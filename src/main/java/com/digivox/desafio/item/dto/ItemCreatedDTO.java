package com.digivox.desafio.item.dto;

import com.digivox.desafio.item.models.Item;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemCreatedDTO {
//    @NotNull
    private UUID id;

    @NotNull(message = "Description cannot be null")
    private String description;

    @NotNull
    @Min(value = 1, message = "Quantidade não pode ser menor que 1")
    private Double quantity;

    @NotNull
    private Double price;

    @NotNull
    private UUID tipoItemId;

    public ItemCreatedDTO(Item item) {
        this(item.getId(), item.getDescription(), item.getQuantity(), item.getPrice(), item.getTipoItem().getId());
    }
}
