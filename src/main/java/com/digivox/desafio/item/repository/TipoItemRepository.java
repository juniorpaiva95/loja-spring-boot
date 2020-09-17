package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.TipoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoItemRepository extends JpaRepository<TipoItem, UUID> {
}
