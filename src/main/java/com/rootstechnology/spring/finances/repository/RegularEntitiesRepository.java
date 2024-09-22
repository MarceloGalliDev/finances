package com.rootstechnology.spring.finances.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rootstechnology.spring.finances.models.Entity;

@Repository
public class RegularEntitiesRepository implements EntitiesRepository{

    @Override
    public Entity getById(Long id) {
        return new Entity(id, "Amazon");
    }

    @Override
    public List<Entity> getAll() {
        return List.of(
            new Entity(1L, "Amazon"),
            new Entity(2L, "BestBuy"),
            new Entity(3L, "Submarino")
        );
    }

}
