package creational.patterns.factory.factory;

import creational.patterns.factory.player.BundesligaPlayer;
import creational.patterns.factory.player.Player;
import creational.patterns.factory.team.BorussiaDortmund;
import creational.patterns.factory.team.Team;

public class BundesLigaFactory implements FootballFactory{

    @Override
    public Player createPlayer() {

        return new BundesligaPlayer();
    }

    @Override
    public Team createTeam() {
        return new BorussiaDortmund();
    }
}
