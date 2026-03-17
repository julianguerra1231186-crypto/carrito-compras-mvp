package com.carrito.service;

import com.carrito.dto.DetalleFacturaRequest;
import com.carrito.dto.DetalleFacturaResponse;

import java.util.List;

public interface DetalleFacturaService {

    DetalleFacturaResponse crearDetalleFactura(DetalleFacturaRequest request);

    List<DetalleFacturaResponse> listarDetallesPorFactura(Long facturaId);
}