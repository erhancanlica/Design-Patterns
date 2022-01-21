package creational.patterns.factory.factory;

import creational.patterns.factory.player.LaLigaPlayer;
import creational.patterns.factory.player.Player;
import creational.patterns.factory.team.RealMadrid;
import creational.patterns.factory.team.Team;

public class LaLigaFactory implements FootballFactory {
    @Override
    public Player createPlayer() {
        return new LaLigaPlayer();
    }

    @Override
    public Team createTeam() {
        return new RealMadrid();
    }
}
