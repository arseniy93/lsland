package com.arigin.models.herbivores;

import com.arigin.models.abstracts.Animal;
import com.arigin.models.abstracts.Entity;
import com.arigin.models.plants.Plants;
import com.arigin.models.predators.Predator;

public abstract class Herbivore extends Entity {
    protected Herbivore(Entity entity) {
        super(entity.getWeight(), entity.getMaxCoutnOfMovesOnField(), entity.getVelocity(), entity.getEatToFull());
    }

    public Herbivore() {
        super();
    }

}
