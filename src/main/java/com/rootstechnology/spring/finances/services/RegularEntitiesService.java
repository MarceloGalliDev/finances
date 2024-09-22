package com.rootstechnology.spring.finances.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rootstechnology.spring.finances.models.Entity;
import com.rootstechnology.spring.finances.repository.EntitiesRepository;

// podemos usar o @Primary ou um @Qualifier
// @Primary
@Service
public class RegularEntitiesService implements EntitiesService {

    EntitiesRepository entitiesRepository;

    public RegularEntitiesService(EntitiesRepository entRep) {
        this.entitiesRepository = entRep;
    }

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
