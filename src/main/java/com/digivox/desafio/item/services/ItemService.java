package com.digivox.desafio.item.services;

import com.digivox.desafio.item.dto.ItemDTO;
import com.digivox.desafio.item.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<ItemDTO> getAll() {
        log.info("ItemService -> getAll");

        return repository.findAll().stream().map(ItemDTO::new).collect(Collectors.toList());
    }
}
