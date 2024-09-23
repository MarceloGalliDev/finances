package com.rootstechnology.spring.finances.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.rootstechnology.spring.finances.models.Entity;

@Repository
public class RegularEntitiesRepository implements EntitiesRepository {
    
    final Long generatedId;

    // qualifier busca pelo nome do bean que esta em configuration EntitiesConfiguration
    public RegularEntitiesRepository(@Qualifier("generateEntityId") Long entityId) {
        this.generatedId = entityId;
    }

    @Override
    public Entity getById(Long id) {
        return new Entity(this.generatedId, "Amazon");
        // return new Entity(id, "Amazon");
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
