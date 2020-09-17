package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
