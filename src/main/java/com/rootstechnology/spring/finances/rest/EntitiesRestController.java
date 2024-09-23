package com.rootstechnology.spring.finances.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootstechnology.spring.finances.models.Entity;
import com.rootstechnology.spring.finances.services.EntitiesService;

@RestController
public class EntitiesRestController {

    // Injetando as dependencias
    // Trazemos o Service em uma váriavel
    @Autowired
    EntitiesService entitiesService;

    @GetMapping("/entities/1")
    public Entity get() {
        return this.entitiesService.getById(1L);
    }

    @GetMapping("/entities")
    public List<Entity> getAllEntities() {
        return entitiesService.getAll();
    }
}
