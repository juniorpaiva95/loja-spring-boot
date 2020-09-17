package com.digivox.desafio.item.controllers;

import com.digivox.desafio.item.dto.ItemCreatedDTO;
import com.digivox.desafio.item.dto.ItemDTO;
import com.digivox.desafio.item.models.Item;
import com.digivox.desafio.item.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAll() { return ResponseEntity.ok().body(itemService.getAll()); }

    @PostMapping
    public ResponseEntity<ItemDTO> create(@Valid @RequestBody ItemCreatedDTO item) {

        try {
            return ResponseEntity.ok().body(itemService.create(item));
        } catch (Exception exception) {
            exception.printStackTrace();
        }


        return null;
    }

//    @ExceptionHandler
//    public ResponseEntity<String> handleException(Exception exception) {
//        return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
//    }

}
