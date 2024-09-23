package com.rootstechnology.spring.finances.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rootstechnology.spring.finances.models.Entity;
import com.rootstechnology.spring.finances.repository.EntitiesRepository;

// podemos usar o @Primary ou um @Qualifier
// @Primary
@Service
public class RegularEntitiesService implements EntitiesRepository {

    @Override
    public Entity getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Entity> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
