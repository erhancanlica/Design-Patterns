package com.java.designpatterns.structural.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sparrow implements Bird {

    private static final Logger logger = Logger.getLogger(Sparrow.class.getName());

    @Override
    public void fly() {
        logger.log(Level.INFO, "flying...");
    }

    @Override
    public void makeSound() {
        logger.log(Level.INFO, "Chirp Chirp");
    }
}
