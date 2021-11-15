package com.corso.java.orange.OtherProjectsAndTest.Hangman.max;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GeneraParola {

    private Set<String> paroleDaIndovinare;

    public GeneraParola() {
        this.paroleDaIndovinare = new HashSet<>();
        this.paroleDaIndovinare.add("programmatore");
        this.paroleDaIndovinare.add("evidenziatore");
        this.paroleDaIndovinare.add("aperitivo");
        this.paroleDaIndovinare.add("bambino");
        this.paroleDaIndovinare.add("sviluppatore");
    }

    public String estraiParola() {
        Iterator<String> parolaIterator = paroleDaIndovinare.iterator();
        String result = null;
        while (parolaIterator.hasNext()) {
            result = parolaIterator.next();
            parolaIterator.remove();
            break;
        }
        return result;
    }

    public Set<String> getParoleDaIndovinare() {
        return paroleDaIndovinare;
    }


}