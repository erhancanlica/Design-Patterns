package com.java.designpatterns.creational.factory;

import com.java.designpatterns.creational.factory.factory.BundesLigaFactory;
import com.java.designpatterns.creational.factory.factory.FootballFactory;
import com.java.designpatterns.creational.factory.factory.LaLigaFactory;
import com.java.designpatterns.creational.factory.factory.SerieAFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FootballService {

    private static final Logger logger = Logger.getLogger(FootballService.class.getName());

    public static void main(String[] args) {
        FootballFactory germany = new BundesLigaFactory();
        FootballFactory italy = new SerieAFactory();
        FootballFactory spain = new LaLigaFactory();

        FootballWorld footballWorld = new FootballWorld(spain);
        logger.log(Level.INFO, footballWorld.getFootballTeamColor());
        logger.log(Level.INFO, footballWorld.getFootballTopScorer());
    }
}
