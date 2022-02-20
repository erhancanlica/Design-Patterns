package com.java.designpatterns.creational.factory;

import com.java.designpatterns.creational.factory.factory.FootballFactory;
import com.java.designpatterns.creational.factory.player.Player;
import com.java.designpatterns.creational.factory.team.Team;

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
