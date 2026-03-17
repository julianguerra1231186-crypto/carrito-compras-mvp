package com.carrito.controller;

import com.carrito.dto.ProductoRequest;
import com.carrito.dto.ProductoResponse;
import com.carrito.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoResponse crearProducto(@Valid @RequestBody ProductoRequest request) {
        return productoService.crearProducto(request);
    }

    @GetMapping
    public List<ProductoResponse> listarProductos() {
        return productoService.listarProductos();
    }
}