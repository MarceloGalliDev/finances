package com.rootstechnology.spring.finances.services;

import java.util.List;

import com.rootstechnology.spring.finances.models.Entity;

public interface EntitiesService {
    
    Entity getById(Long id);
    List<Entity> getAll();
}
