package creational.patterns.factory.factory;

import creational.patterns.factory.player.Player;
import creational.patterns.factory.team.Team;

public interface FootballFactory {

    Player createPlayer();
    Team createTeam();
}
