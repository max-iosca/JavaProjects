package com.corso.java.orangee.OtherProjectsAndTest.Hangman.remo;

import java.util.List;
import java.util.Scanner;

public class Utility {


    public static Character validateInputLetter(Scanner input) {
        Character result = null;
        do {
            String value = input.nextLine();
            if (value.length() != 1 || !value.matches("^[a-zA-Z]"))
                System.out.println("\u001b[31mSolo lettere da A a Z\u001b[0m");
            else
                result = value.charAt(0);
        } while(result==null);
        return Character.toUpperCase(result);
    }


    public static String renderWordToGuess(String wordToGuess, List<Character> insertedLetters) {
        String result = wordToGuess;
        for(int i=0; i < wordToGuess.length(); i++) {
            if (insertedLetters.indexOf(wordToGuess.charAt(i))==-1) {
                result = result.replace(result.charAt(i), '*');
            }
        }
        return result;
    }
}
