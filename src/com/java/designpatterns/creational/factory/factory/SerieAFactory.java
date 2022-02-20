package com.java.designpatterns.creational.factory.factory;

import com.java.designpatterns.creational.factory.player.Player;
import com.java.designpatterns.creational.factory.player.SerieAPlayer;
import com.java.designpatterns.creational.factory.team.Juventus;
import com.java.designpatterns.creational.factory.team.Team;

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
