package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.TipoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoItemRepository extends JpaRepository<TipoItem, Long> {
}
