package com.corso.java.orangee.OtherProjectsAndTest.Hangman.remo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman extends SimpleGamePlay {

    private Scanner input;
    private String wordToGuess, plainWordToGuess;
    private List<Character> insertedLetters;
    private Dictionary dictionary;

    @Override
    protected void startRound() throws CantStartRoundException {
        input = new Scanner(System.in);
        insertedLetters = new ArrayList<>();
        if (dictionary==null)
            dictionary = new Dictionary();
        this.wordToGuess = this.dictionary.getRandomizedWord();
    }

    @Override
    protected void playRound(PlayerScoreable scoreablePlayer) {
        DrawHangmanPlay drawPlay = new DrawHangmanPlay();
        plainWordToGuess = new String(wordToGuess);
        boolean won = false;
        int attempts = 1;
        int errors = 0;
        do {
            drawPlay.ClearConsole();
            drawPlay.disegna(errors);
            wordToGuess = Utility.renderWordToGuess(plainWordToGuess, insertedLetters);
            if (wordToGuess.indexOf('*')==-1) {
                won = true;
                break;
            }
            System.out.println("Tentativo nr ... " + (attempts++) +". Indovina la parola: ("+ plainWordToGuess + ") \n" + wordToGuess + "\nLettera: ");
            Character letter = Utility.validateInputLetter(input);
            insertedLetters.add(letter);

            if (!evaluate(letter)) {
                errors++;
                System.out.println("Lettera " + letter + " non trovata!");
            }


        } while(errors<NR_ATTEMPTS_PER_ROUND);

        if (won)
            scoreablePlayer.addWinnings();
        else {
            scoreablePlayer.addLoosings();
            drawPlay.disegna(NR_ATTEMPTS_PER_ROUND);
        }
    }

    @Override
    protected boolean evaluate(Character letter) {
        return plainWordToGuess.toUpperCase().indexOf(letter) > -1;
    }
}
