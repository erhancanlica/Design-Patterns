package com.java.designpatterns.creational.factory.factory;

import com.java.designpatterns.creational.factory.player.Player;
import com.java.designpatterns.creational.factory.player.LaLigaPlayer;
import com.java.designpatterns.creational.factory.team.RealMadrid;
import com.java.designpatterns.creational.factory.team.Team;

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
