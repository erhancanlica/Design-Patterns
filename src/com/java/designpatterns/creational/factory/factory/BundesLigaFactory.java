package com.java.designpatterns.creational.factory.factory;

import com.java.designpatterns.creational.factory.player.Player;
import com.java.designpatterns.creational.factory.player.BundesligaPlayer;
import com.java.designpatterns.creational.factory.team.BorussiaDortmund;
import com.java.designpatterns.creational.factory.team.Team;

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
