package com.corso.java.orange.OtherProjectsAndTest.Hangman.remo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {

    InputStream fileStream;
    List<String> wordlist = new ArrayList<>();

    public Dictionary() {
        fileStream = getClass().getClassLoader().getResourceAsStream("wordlist.txt");
        if (fileStream==null) {
            System.out.println("Attenzione. Il file wordlist.txt deve essere presente nella cartella resources.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toUpperCase();
                if(!line.contains("'") && !line.contains("À") && !line.contains("È") && !line.contains("É") && !line.contains("Ì")
                        && !line.contains("Ò") && !line.contains("Ù") && !line.contains(" "))
                    wordlist.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRandomizedWord() {
        Random r = new Random();
        return wordlist.get(r.nextInt(wordlist.size()));
    }
}
