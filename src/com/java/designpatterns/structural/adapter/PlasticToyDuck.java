package com.java.designpatterns.structural.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PlasticToyDuck implements ToyDuck {

    private static final Logger logger = Logger.getLogger(Sparrow.class.getName());

    @Override
    public void squeak() {
        logger.log(Level.INFO, "squeak");
    }
}
