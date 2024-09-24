package com.rootstechnology.spring.finances.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.rootstechnology.spring.finances.models.Entity;
import com.rootstechnology.spring.finances.repository.EntitiesRepository;

// podemos usar o @Primary ou um @Qualifier
// @Primary
@Service
public class RegularEntitiesService implements EntitiesRepository {

    @Autowired
    ApplicationContext appContext;

    private MyEntityId generatedId;

    @Override
    public  void setGeneratedId(MyEntityId entityId) {
        this.generatedId = entityId;
    }

    @Override
    public Entity getById(Long id) {
        return new Entity(this.generatedId.getId(), "Amazon");
    }

    // necessario incluir um scope=prototype
    @Override
    public List<Entity> getAll() {
        var myEntityIdBean = appContext.getBean(MyEntityId.class);

        return List.of(
            new Entity(myEntityIdBean.getId(), "Amazon"),
            new Entity(myEntityIdBean.getId(), "Worten"),
            new Entity(myEntityIdBean.getId(), "Pão de Açucar")
        );
    }

}
