package com.carrito.service.impl;

import com.carrito.dto.DetalleFacturaRequest;
import com.carrito.dto.DetalleFacturaResponse;
import com.carrito.entity.DetalleFactura;
import com.carrito.entity.Factura;
import com.carrito.entity.Producto;
import com.carrito.repository.DetalleFacturaRepository;
import com.carrito.repository.FacturaRepository;
import com.carrito.repository.ProductoRepository;
import com.carrito.service.DetalleFacturaService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

    private final DetalleFacturaRepository detalleFacturaRepository;
    private final FacturaRepository facturaRepository;
    private final ProductoRepository productoRepository;

    public DetalleFacturaServiceImpl(
            DetalleFacturaRepository detalleFacturaRepository,
            FacturaRepository facturaRepository,
            ProductoRepository productoRepository
    ) {
        this.detalleFacturaRepository = detalleFacturaRepository;
        this.facturaRepository = facturaRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public DetalleFacturaResponse crearDetalleFactura(DetalleFacturaRequest request) {
        Factura factura = facturaRepository.findById(request.getFacturaId())
                .orElseThrow(() -> new IllegalArgumentException("No existe una factura con el id proporcionado"));

        Producto producto = productoRepository.findById(request.getProductoId())
                .orElseThrow(() -> new IllegalArgumentException("No existe un producto con el id proporcionado"));

        BigDecimal precioUnitario = producto.getPrecio();
        BigDecimal subtotal = precioUnitario.multiply(BigDecimal.valueOf(request.getCantidad()));

        DetalleFactura detalleFactura = DetalleFactura.builder()
                .factura(factura)
                .producto(producto)
                .cantidad(request.getCantidad())
                .precioUnitario(precioUnitario)
                .subtotal(subtotal)
                .build();

        DetalleFactura detalleGuardado = detalleFacturaRepository.save(detalleFactura);

        BigDecimal totalActual = factura.getTotal() != null ? factura.getTotal() : BigDecimal.ZERO;
        factura.setTotal(totalActual.add(subtotal));
        facturaRepository.save(factura);

        return mapToResponse(detalleGuardado);
    }

    @Override
    public List<DetalleFacturaResponse> listarDetallesPorFactura(Long facturaId) {
        if (!facturaRepository.existsById(facturaId)) {
            throw new IllegalArgumentException("No existe una factura con el id proporcionado");
        }

        return detalleFacturaRepository.findByFacturaId(facturaId)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private DetalleFacturaResponse mapToResponse(DetalleFactura detalleFactura) {
        return DetalleFacturaResponse.builder()
                .id(detalleFactura.getId())
                .facturaId(detalleFactura.getFactura().getId())
                .productoId(detalleFactura.getProducto().getId())
                .nombreProducto(detalleFactura.getProducto().getNombre())
                .cantidad(detalleFactura.getCantidad())
                .precioUnitario(detalleFactura.getPrecioUnitario())
                .subtotal(detalleFactura.getSubtotal())
                .build();
    }
}