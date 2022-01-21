package creational.patterns.factory;

import creational.patterns.factory.factory.FootballFactory;
import creational.patterns.factory.player.Player;
import creational.patterns.factory.team.Team;

public class FootballWorld {

    private final Team team;
    private final Player player;


    public FootballWorld(FootballFactory footballFactory) {
        this.team = footballFactory.createTeam();
        this.player = footballFactory.createPlayer();
    }

    public String getFootballTeamColor() {
        return team.getTeamColor();
    }

    public String getFootballTopScorer() {
        return player.getTopScorer();
    }
}
