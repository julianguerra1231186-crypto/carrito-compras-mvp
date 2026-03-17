package com.carrito.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacturaResponse {

    private Long id;
    private LocalDateTime fecha;
    private BigDecimal total;
    private Long usuarioId;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String emailUsuario;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}