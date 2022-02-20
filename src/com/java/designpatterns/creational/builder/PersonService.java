package com.java.designpatterns.creational.builder;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonService {
    private static final Logger logger = Logger.getLogger(PersonService.class.getName());

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .firstName("Erhan")
                .lastName("Canlıca")
                .email("erhancnlc@outlook.com")
                .build();

        logger.log(Level.INFO, person.toString());
    }
}
