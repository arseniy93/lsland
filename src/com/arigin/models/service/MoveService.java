package com.arigin.models.service;

import com.arigin.models.Island;
import com.arigin.models.abstracts.Animal;
import com.arigin.models.abstracts.Entity;
import com.arigin.models.enums.DirectionType;
import com.arigin.models.island.Field;
import com.arigin.models.service.impl.ChooseDirectionServiceImpl;

import java.util.Random;

public interface MoveService {

    void move(Random random);
}
