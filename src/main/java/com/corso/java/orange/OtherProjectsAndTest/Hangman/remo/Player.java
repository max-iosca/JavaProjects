package com.corso.java.orange.OtherProjectsAndTest.Hangman.remo;

public class Player extends Person implements Comparable<Player>, PlayerScoreable {

    private int nrWinnings;
    private int nrLoosings;

    public Player(String name, Integer age) {
        super(name, age);
    }

    public int getNrWinnings() {
        return nrWinnings;
    }

    public int getNrLoosings() {
        return nrLoosings;
    }

    public int addWinnings() {
        return ++nrWinnings;
    }

    public int addLoosings() {
        return ++nrLoosings;
    }


    @Override
    public int compareTo(Player player) {
        if (this.nrWinnings > player.getNrWinnings())
            return 1;
        if (this.nrWinnings < player.getNrWinnings())
            return -1;
        return 0;
    }
}
