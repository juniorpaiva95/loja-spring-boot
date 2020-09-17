package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservaRepository extends JpaRepository<Reserva, UUID> {}
