package com.carrito.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacturaRequest {

    @NotNull(message = "La fecha es obligatoria")
    private LocalDateTime fecha;

    @NotNull(message = "El total es obligatorio")
    @DecimalMin(value = "0.00", inclusive = true, message = "El total no puede ser negativo")
    private BigDecimal total;

    @NotNull(message = "El usuario es obligatorio")
    private Long usuarioId;
}