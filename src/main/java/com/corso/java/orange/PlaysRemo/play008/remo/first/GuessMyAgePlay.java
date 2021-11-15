package com.corso.java.orange.PlaysRemo.play008.remo.first;

import java.util.Random;
import java.util.Scanner;

public class GuessMyAgePlay {

    public static final int NR_MAX_PERSONS = 5;
    private String names[];
    private Person person;

    public static void main(String[] args) {
        GuessMyAgePlay guessMyAge = new GuessMyAgePlay();
        guessMyAge.run();
    }

    public GuessMyAgePlay() {
        this.names = new String[NR_MAX_PERSONS];
        this.names[0] = "Franco";
        this.names[1] = "Paola";
        this.names[2] = "Gianni";
        this.names[3] = "Andrea";
        this.names[4] = "Sara";
    }

    /**
     * lancia il gioco ed esce solo quando il giocatore vuole terminare.
     */
    public void run() {
        boolean replay = false;
        do {
            int index = new Random().nextInt(NR_MAX_PERSONS);
            this.person = new Person(this.names[index]);
            replay = this.play();
        } while(replay);
    }


    /**
     *  esegue il gioco effettivo offrendo un numero x di tentativi.
     *  stampa l'etá effettiva del soggetto.
     *
     * @return true se il giocatore vuole continuare a giocare
     */
    public boolean play() {
        boolean guessed = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Indovina l'etá di " + person.getName());
        for(int i=1; i<=3; i++) {
            System.out.println("Tentativo nr ... " + i);
            System.out.print("Inserisci l'etá: ");
            int ageByPlayer = input.nextInt();
            guessed = checkAge(ageByPlayer);
            if (!guessed) {
                System.out.println("...Riprova");
            } else {
                break;
            }
        }
        System.out.println(person.getName() + " ha " + person.getAge() + " anni");

        // FIXME RM Non ce piaceeeeeee!!!!:
        // FIXME RM questo metodo fa troppe cose! (refactoring!)
        System.out.println("Vuoi giocare di nuovo? S/N");
        String answer;
        do {
            answer = input.nextLine();
        } while (!answer.equalsIgnoreCase("S") &&  !answer.equalsIgnoreCase("N"));

        return answer.equalsIgnoreCase("S");
    }


    /**
     * esegue il controllo tra il dato passato dal giocatore e quello della persona in esame.
     * Stampa sempre l'esito del controllo.
     *
     * @param ageByPlayer se true l'etá é corretta
     * @return
     */
    private boolean checkAge(int ageByPlayer) {
        boolean result = false;
        if (ageByPlayer > person.getAge())
            System.out.println("Non hai indovinato. " + person.getName() + " é piú piccolo.");
        if (ageByPlayer < person.getAge())
            System.out.println("Non hai indovinato. " + person.getName() + " é piú grande.");

        if (ageByPlayer == person.getAge()) {
            System.out.println("Bravo! Hai indovinato. ");
            result = true;
        }
        return result;
    }

}
