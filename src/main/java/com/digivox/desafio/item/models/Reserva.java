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
@Table(name = "tb_reserva")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reserva {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToMany(mappedBy = "reservas", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Item> itens = new ArrayList<Item>();
}