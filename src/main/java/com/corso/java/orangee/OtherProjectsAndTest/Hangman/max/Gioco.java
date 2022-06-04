package com.corso.java.orangee.OtherProjectsAndTest.Hangman.max;

import java.util.Scanner;
import java.util.Set;

public class Gioco {

    private GeneraParola generaParola;
    private Set<Giocatore> giocatori;


    public Gioco(Set<Giocatore> giocatori){
        this.generaParola = new GeneraParola();
        this.giocatori = giocatori;
    }

    public void play() {
        for(Giocatore giocatore : this.giocatori){

            String parolaDaIndovinare = this.generaParola.estraiParola();
            String asterisco = "*";
            String parolaDaIndovinareMascherata = asterisco.repeat(parolaDaIndovinare.length());

            // MASCHERARE LA PAROLA MOSTRATA A VIDEO

            System.out.println("LA PARLA DA INDOVINARE MASCHERATA: "+ parolaDaIndovinareMascherata);

            // CHIEDI LETTERA ALL'UTENTE DA SCANNER INPUT

            Scanner input = new Scanner(System.in);
            System.out.println("DIGITARE LA LETTERA:");
            Character letteraProposta = input.next().charAt(0);
            int numeroTentativi = 0;
            do {
                //VERIFICA SE LA LETTERA E' NELLA PAROLA
                if(verificaPresenzaLettera(parolaDaIndovinare, letteraProposta)){
                    char [] parolaMascherataArray = parolaDaIndovinareMascherata.toCharArray();
                    for(int i=0 ; i< parolaDaIndovinare.length(); i++){
                        if(parolaDaIndovinare.charAt(i) == letteraProposta){
                            parolaMascherataArray[i] = letteraProposta;
                        }
                    }
                    //SE LA LETTERA E' NELLA PAROLA, QUESTA VA MOSTRATA A VIDEO
                    parolaDaIndovinareMascherata = new String(parolaMascherataArray);
                    System.out.println(parolaMascherataArray);
                }
                else {
                    //SE LA LETTERA NON E' NELLA PAROLA VIENE INCREMENTATO IL NR DEI TENTATIVIù
                    //E VIENE AGGIUNTA UNA LINEA ALL'IMPICCATO
                    System.out.println("LA LETTERA " + letteraProposta + " NON E' NELLA PAROLA DA INDOVINARE");
                    numeroTentativi++;
                }



                //PASSA AL GIOCATORE SUCCESSIVO SE NRTENTATIVI SUPERIORE A N OPPURE
                //SE IL GIOCATOER HA INDOVINATO LA PAROLA

            } while(!parolaDaIndovinareMascherata.equals(parolaDaIndovinare) || numeroTentativi < 6);

        }

    }


    private boolean verificaPresenzaLettera(String parola, char lettera){
        return parola.indexOf(lettera) != -1;
    }

}
