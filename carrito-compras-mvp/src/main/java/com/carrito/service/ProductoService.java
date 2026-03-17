package com.carrito.service;

import com.carrito.dto.ProductoRequest;
import com.carrito.dto.ProductoResponse;

import java.util.List;

public interface ProductoService {

    ProductoResponse crearProducto(ProductoRequest request);

    List<ProductoResponse> listarProductos();
}