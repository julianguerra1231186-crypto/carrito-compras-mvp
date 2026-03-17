package com.carrito.controller;

import com.carrito.dto.DetalleFacturaRequest;
import com.carrito.dto.DetalleFacturaResponse;
import com.carrito.service.DetalleFacturaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles-factura")
public class DetalleFacturaController {

    private final DetalleFacturaService detalleFacturaService;

    public DetalleFacturaController(DetalleFacturaService detalleFacturaService) {
        this.detalleFacturaService = detalleFacturaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleFacturaResponse crearDetalleFactura(@Valid @RequestBody DetalleFacturaRequest request) {
        return detalleFacturaService.crearDetalleFactura(request);
    }

    @GetMapping("/factura/{facturaId}")
    public List<DetalleFacturaResponse> listarDetallesPorFactura(@PathVariable Long facturaId) {
        return detalleFacturaService.listarDetallesPorFactura(facturaId);
    }
}