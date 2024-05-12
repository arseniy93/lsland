package com.arigin.config;

import com.arigin.models.abstracts.Entity;
import com.arigin.models.enums.EntityType;
import com.arigin.models.predators.Wolf;
import com.arigin.models.service.jsonservice.CreateObjectFromJson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class EntityCharacteristicsConfig {

    public EntityCharacteristicsConfig(CreateObjectFromJson createObjectFromJson) {
        entityMapConfig=new HashMap<>();
        EntityType[] entityTypes=EntityType.values();
        for (int i = 0; i < createObjectFromJson.getListOfEntity().size(); i++) {
            entityMapConfig.put(entityTypes[i],createObjectFromJson.getListOfEntity().get(i));
        }
    }
    private Map<EntityType, Entity> entityMapConfig;


    public Map<EntityType, Entity> getEntityMapConfig() {
        return entityMapConfig;
    }
}
