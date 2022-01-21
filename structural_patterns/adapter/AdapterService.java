package structural.patterns.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdapterService {

    private static final Logger logger = Logger.getLogger(AdapterService.class.getName());

    public static void main(String[] args) {
        Bird bird = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(bird);

        logger.log(Level.INFO, "Sparrow...");
        bird.fly();
        bird.makeSound();

        logger.log(Level.INFO, "ToyDuck...");
        toyDuck.squeak();

        logger.log(Level.INFO, "BirdAdapter...");
        birdAdapter.squeak();
    }
}
