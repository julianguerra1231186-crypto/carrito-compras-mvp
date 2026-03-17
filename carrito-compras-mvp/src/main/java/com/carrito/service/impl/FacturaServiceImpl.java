package com.carrito.service.impl;

import com.carrito.dto.FacturaRequest;
import com.carrito.dto.FacturaResponse;
import com.carrito.entity.Factura;
import com.carrito.entity.Usuario;
import com.carrito.repository.FacturaRepository;
import com.carrito.repository.UsuarioRepository;
import com.carrito.service.FacturaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    private final FacturaRepository facturaRepository;
    private final UsuarioRepository usuarioRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository, UsuarioRepository usuarioRepository) {
        this.facturaRepository = facturaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public FacturaResponse crearFactura(FacturaRequest request) {
        Usuario usuario = usuarioRepository.findById(request.getUsuarioId())
                .orElseThrow(() -> new IllegalArgumentException("No existe un usuario con el id proporcionado"));

        Factura factura = Factura.builder()
                .fecha(request.getFecha())
                .total(request.getTotal())
                .usuario(usuario)
                .build();

        Factura facturaGuardada = facturaRepository.save(factura);

        return mapToResponse(facturaGuardada);
    }

    @Override
    public List<FacturaResponse> listarFacturas() {
        return facturaRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private FacturaResponse mapToResponse(Factura factura) {
        return FacturaResponse.builder()
                .id(factura.getId())
                .fecha(factura.getFecha())
                .total(factura.getTotal())
                .usuarioId(factura.getUsuario().getId())
                .nombreUsuario(factura.getUsuario().getNombre())
                .apellidoUsuario(factura.getUsuario().getApellido())
                .emailUsuario(factura.getUsuario().getEmail())
                .createdAt(factura.getCreatedAt())
                .updatedAt(factura.getUpdatedAt())
                .build();
    }
}