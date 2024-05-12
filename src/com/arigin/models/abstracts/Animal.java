package com.arigin.models.abstracts;


import com.arigin.models.herbivores.*;
import com.arigin.models.plants.Plants;
import com.arigin.models.predators.*;

public abstract class Animal extends Entity {
    protected Animal(Double weight, Integer maxCoutnOfMovesOnField, Integer velocity, Double eatToFull) {
        super(weight, maxCoutnOfMovesOnField, velocity, eatToFull);
    }

    public Animal() {
        super();
    }

}
