package com.carrito.service;

import com.carrito.dto.UsuarioRequest;
import com.carrito.dto.UsuarioResponse;

import java.util.List;

public interface UsuarioService {

    UsuarioResponse crearUsuario(UsuarioRequest request);

    List<UsuarioResponse> listarUsuarios();
}