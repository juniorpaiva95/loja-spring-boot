package com.digivox.desafio.item.dto;

import com.digivox.desafio.item.models.Item;
import com.digivox.desafio.item.models.Reserva;
import com.digivox.desafio.item.models.TipoItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDTO {

    private UUID id;

    private String description;

    private Double quantity;

    private Double price;

    private TipoItem tipoItem;

    public ItemDTO(Item item) {
        this(item.getId(), item.getDescription(), item.getQuantity(), item.getPrice(), item.getTipoItem());
    }
}
