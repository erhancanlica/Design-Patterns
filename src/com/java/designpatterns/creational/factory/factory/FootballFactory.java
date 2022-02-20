package com.java.designpatterns.creational.factory.factory;

import com.java.designpatterns.creational.factory.player.Player;
import com.java.designpatterns.creational.factory.team.Team;

public interface FootballFactory {

    Player createPlayer();
    Team createTeam();
}
