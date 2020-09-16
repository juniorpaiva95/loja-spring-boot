package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
