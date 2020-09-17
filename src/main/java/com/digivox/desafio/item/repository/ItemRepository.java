package com.digivox.desafio.item.repository;

import com.digivox.desafio.item.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
}
