package com.digivox.desafio.item.services;

import com.digivox.desafio.item.dto.ItemCreatedDTO;
import com.digivox.desafio.item.dto.ItemDTO;
import com.digivox.desafio.item.models.Item;
import com.digivox.desafio.item.models.TipoItem;
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

    @Autowired
    private TipoItemService tipoItemService;

    public List<ItemDTO> getAll() {
        log.info("ItemService -> getAll");

        return repository.findAll().stream().map(ItemDTO::new).collect(Collectors.toList());
    }

    public ItemDTO create(ItemCreatedDTO itemCreate) throws Exception {
        log.info("ItemService -> create");

        TipoItem tipoItem = tipoItemService.getOne(itemCreate.getTipoItemId());
        if (tipoItem == null) {
            throw new Exception("Tipo informado não existe");
        }

        return new ItemDTO(repository.save(
                new Item(
                        null,
                        itemCreate.getDescription(),
                        itemCreate.getQuantity(),
                        itemCreate.getPrice(),
                        tipoItem,
                        itemCreate.getReservas()
                )
        ));

//                new Item(null, itemCreate.getDescription(), itemCreate.getQuantity(), itemCreate.getPrice(), itemCreate.getReservas())))
    }
}
