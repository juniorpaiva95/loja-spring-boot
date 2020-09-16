package com.digivox.desafio.item.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_tipo_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    @OneToMany(mappedBy = "tipoItem", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Item> itens = new ArrayList<Item>();
}