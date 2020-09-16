package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
