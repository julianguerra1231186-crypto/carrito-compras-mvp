package com.carrito.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
public class DetalleFacturaRequest {

    @NotNull
    private Long facturaId;

    @NotNull
    private Long productoId;

    @NotNull
    @Min(1)
    private Integer cantidad;
}