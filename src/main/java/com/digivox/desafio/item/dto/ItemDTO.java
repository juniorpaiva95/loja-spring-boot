package com.digivox.desafio.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private long id;

    private String description;

    private Double quantity;

    private Double price;


}
