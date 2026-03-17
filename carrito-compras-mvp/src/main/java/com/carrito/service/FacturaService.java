package com.carrito.service;

import com.carrito.dto.FacturaRequest;
import com.carrito.dto.FacturaResponse;

import java.util.List;

public interface FacturaService {

    FacturaResponse crearFactura(FacturaRequest request);

    List<FacturaResponse> listarFacturas();
}