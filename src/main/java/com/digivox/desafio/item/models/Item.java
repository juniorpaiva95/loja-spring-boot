package com.digivox.desafio.item.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String description;

    private Double quantity;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private TipoItem tipoItem;

    @ManyToMany
    @JoinTable(name="tb_item_reserva",
            joinColumns={@JoinColumn(name="tb_item_id")},
            inverseJoinColumns={@JoinColumn(name="tb_reserva_id")})
    private List<Reserva> reservas = new ArrayList<Reserva>();

}