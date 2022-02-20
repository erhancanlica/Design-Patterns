package com.java.designpatterns.behavioral.memento;

public class MementoRun {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state 1");
        originator.setState("state 2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state 3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state 4");
        System.out.println("current state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first saved state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second saved state: " + originator.getState());
    }
}
