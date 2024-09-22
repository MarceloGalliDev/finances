package com.rootstechnology.spring.finances.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rootstechnology.spring.finances.models.Entity;

@Service
public class FakeEntitiesService implements EntitiesService {

    @Override
    public Entity getById(Long id) {
        return new Entity(0L, "fake");
    }

    @Override
    public List<Entity> getAll() {
        return List.of(new Entity(0L, "fake"));
    }

}
