package com.carrito.controller;

import com.carrito.dto.FacturaRequest;
import com.carrito.dto.FacturaResponse;
import com.carrito.service.FacturaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FacturaResponse crearFactura(@Valid @RequestBody FacturaRequest request) {
        return facturaService.crearFactura(request);
    }

    @GetMapping
    public List<FacturaResponse> listarFacturas() {
        return facturaService.listarFacturas();
    }
}