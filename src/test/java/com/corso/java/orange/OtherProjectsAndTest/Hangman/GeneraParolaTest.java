package com.corso.java.orange.OtherProjectsAndTest.Hangman;

import com.corso.java.orange.OtherProjectsAndTest.Hangman.max.GeneraParola;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneraParolaTest {

    @Test
    public void estraiParolaTest() {
        GeneraParola genParola = new GeneraParola();
        String risultato = genParola.estraiParola();
        //assertEquals(risultato, "aperitivo");
        assertEquals(risultato, "bambino");
    }
}