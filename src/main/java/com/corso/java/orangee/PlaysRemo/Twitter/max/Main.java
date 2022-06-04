package com.corso.java.orangee.PlaysRemo.Twitter.max;

public class Main {
    public static void main(String[] args) {

        Twitter twitter = new Twitter();

        twitter.registrazione("remos");
        twitter.registrazione("mimmos");
        twitter.registrazione("pedros");
        twitter.registrazione("pablitos");
        twitter.registrazione("mannaggias");

        twitter.seguiFollower("mimmos","remos");
        twitter.seguiFollower("pedros", "remos");
        twitter.seguiFollower("pablitos", "remos");

        twitter.seguiFollower("remos", "mimmos");
        twitter.seguiFollower("pedros","mimmos");
        twitter.seguiFollower("mannaggias","mimmos");


        twitter.creaPost("remos","Questo è il post di Remos");
        twitter.creaPost("mimmos", "Questo è il post di Mimmos");
        twitter.rimuoviIscritto("remos");
    }
}
