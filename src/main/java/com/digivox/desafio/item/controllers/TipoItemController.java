package com.digivox.desafio.item.controllers;

import com.digivox.desafio.item.dto.ItemCreatedDTO;
import com.digivox.desafio.item.dto.ItemDTO;
import com.digivox.desafio.item.models.TipoItem;
import com.digivox.desafio.item.services.TipoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tipo-item")
public class TipoItemController {

    @Autowired
    private TipoItemService service;

    @GetMapping
    public ResponseEntity<List<TipoItem>> getAll() { return ResponseEntity.ok().body(service.getAll()); }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoItem> getOne(@PathVariable UUID id) {
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @PostMapping
    public ResponseEntity<TipoItem> create(@Valid @RequestBody TipoItem item) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(item));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TipoItem> update(@PathVariable UUID id, @RequestBody TipoItem tipoItem) {
        return ResponseEntity.ok().body(service.update(id, tipoItem));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }

}
