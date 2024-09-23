package com.rootstechnology.spring.finances.repository;

import java.util.List;

import com.rootstechnology.spring.finances.models.Entity;

public interface EntitiesRepository {

        Entity getById(Long id);
    List<Entity> getAll();

}
