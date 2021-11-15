package com.corso.java.orange.OtherProjectsAndTest.Hangman.remo;


import java.util.Scanner;

abstract public class SimpleGamePlay {

    public static final int NR_ATTEMPTS_PER_ROUND = 7;
    private Scanner input;


    /**
     * Creiamo una lista di nomi da cui scegliere in modo randomico
     * il nome da assegnare al soggetto per cui indovinare l'etá.
     */
    public SimpleGamePlay() {
        input = new Scanner(System.in);
    }

    /**
     * Lancia il metodo play.
     * In questo modo qui possiamo eseguire azioni di setup a livello di Game
     * nel caso ci fossero utili. Esempio: chiedere i dati del giocatore.
     */
    public void run() {
        Player player = new Player("Remo", 50);
        try {
            play(player);

            System.out.println("Ciao " + player.getName() + ", questo é il tuo punteggio finale:");
            System.out.println("Vinte: " + player.getNrWinnings() + "\nPerse:" + player.getNrLoosings());
        } catch (CantStartRoundException e) {
            System.out.println("Errore durante inizializzazione del gioco.");
        }

    }


    /**
     * Esegue in seguenza i rounds init, play, end.
     * Abbiamo quindi incapsulato (identificato) i passi base di ogni partita.
     */
    public void play(PlayerScoreable player) throws CantStartRoundException {

        boolean replay;
        do {
            startRound();

            playRound(player);

            replay = endRound();
        } while(replay);
    }

    /**
     * inizializza il round scegliendo in modo casuale un nome da assegnare dall'elenco di names
     * e creando una istanza di Person che a sua volta genera in automatico una etá in modo randomico.
     */
    abstract protected void startRound() throws CantStartRoundException;

    /**
     * Esegue il round di gioco con il numero di tentativi prefissato.
     * Riceve come parametro un oggetto che deve implementare i metodi dell'interfaccia
     * PlayerScoreable. Puó essere qualunque oggetto. Non necessariamente il Player.
     * Basta che implementi i metodi previsti dall'interfaccia.
     *
     * @param scoreablePlayer
     */
    abstract protected void playRound(PlayerScoreable scoreablePlayer);


    /**
     * Chiede al giocatore se vuole riprovare
     *
     * @return
     */
    protected boolean endRound() {
        System.out.println("Vuoi giocare di nuovo? S/N");
        String answer;
        do {
            answer = getInput().nextLine();
        } while (!answer.equalsIgnoreCase("S") && !answer.equalsIgnoreCase("N"));

        return answer.equalsIgnoreCase("S");
    }

    /**
     *
     */
    abstract protected boolean evaluate(Character letter);

    public Scanner getInput() {
        return input;
    }

}
