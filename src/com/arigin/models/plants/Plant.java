package com.arigin.models.plants;

import com.arigin.models.abstracts.Entity;
import com.arigin.models.predators.Predator;

public abstract class Plant extends Entity {
    protected Plant(Entity entity) {
        super(entity.getWeight(), entity.getMaxCoutnOfMovesOnField(), entity.getVelocity(), entity.getEatToFull());
    }

    public Plant() {
        super();
    }


}
