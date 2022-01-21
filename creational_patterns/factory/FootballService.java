package creational.patterns.factory;

import creational.patterns.factory.factory.BundesLigaFactory;
import creational.patterns.factory.factory.FootballFactory;
import creational.patterns.factory.factory.LaLigaFactory;
import creational.patterns.factory.factory.SerieAFactory;

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
