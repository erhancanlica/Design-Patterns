package creational.patterns.factory.factory;

import creational.patterns.factory.player.Player;
import creational.patterns.factory.player.SerieAPlayer;
import creational.patterns.factory.team.Juventus;
import creational.patterns.factory.team.Team;

public class SerieAFactory implements FootballFactory {

    @Override
    public Player createPlayer() {
        return new SerieAPlayer();
    }

    @Override
    public Team createTeam() {
        return new Juventus();
    }
}
