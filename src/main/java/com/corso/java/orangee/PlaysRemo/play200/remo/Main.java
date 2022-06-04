package com.corso.java.orangee.PlaysRemo.play200.remo;


/**
 * OurTweet:
 * - Utente
 * - Post
 * - Tweeter
 *
 */
public class Main {

    public static void main(String[] args) {
        Twitter twitter = Twitter.createInstance();
        Twitter twitter2 = Twitter.createInstance();



        twitter.registraUtente("remos");
        twitter.registraUtente("mimmos");
        twitter.registraUtente("francos");
        twitter.registraUtente("pinas");
        twitter.registraUtente("mannaggias");

        twitter.seguiFollower("mimmos", "remos");
        twitter.seguiFollower("francos", "remos");
        twitter.seguiFollower("pinas", "remos");
        twitter.rimuoviIscritto("remos");
        twitter.seguiFollower("remos", "mimmos");
        twitter.seguiFollower("francos", "mimmos");
        twitter.seguiFollower("mannaggias", "mimmos");

        System.out.println("==== Nuovo Post di un utente =====");
        twitter.creaPost("Questo é il post di Remos", "remos");

        System.out.println("==== Nuovo Post di un utente =====");
        twitter.creaPost("Questo é il post di Mimmos", "mimmos");

        System.out.println("==== Nuovo Post di un utente =====");
        twitter.rimuoviFollower("remos", "mimmos");
        twitter.creaPost("Questo é il secondo post di Mimmos", "mimmos");

    }
}
