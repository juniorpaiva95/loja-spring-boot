package com.digivox.desafio.item.dto;

import com.digivox.desafio.item.models.Reserva;
import com.digivox.desafio.item.models.TipoItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemCreatedDTO {
    @NotNull
    private UUID id;

    @NotNull
    @Min(value = 10, message = "Informe uma descrição com pelo menos 10 caracteres")
    private String description;

    @NotNull
    @Min(1)
    private Double quantity;

    @NotNull
    private Double price;

    @NotNull
    private UUID tipoItemId;

    private List<Reserva> reservas;
}
