package com.arigin.models.predators;

import com.arigin.models.abstracts.Animal;
import com.arigin.models.abstracts.Entity;
import com.arigin.models.plants.Plants;

public abstract class Predator extends Animal {
    public Predator(Entity entity) {
        super(entity.getWeight(), entity.getMaxCoutnOfMovesOnField(), entity.getVelocity(), entity.getEatToFull());
    }



    public Predator() {
        super();
    }

}
