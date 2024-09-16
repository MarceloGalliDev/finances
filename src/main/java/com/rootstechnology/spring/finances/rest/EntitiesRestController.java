package com.rootstechnology.spring.finances.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootstechnology.spring.finances.models.Entity;

@RestController
public class EntitiesRestController {

    @GetMapping("/entities/1")
    public Entity get() {
        return new Entity(1L, "Amazon");
    }

    @GetMapping("/entities")
    public List<Entity> getAllEntities() {
        return List.of(
            new Entity(1L, "Amazon"),
            new Entity(2L, "BestBuy"),
            new Entity(3L, "Submarino")
        );
    }
}
