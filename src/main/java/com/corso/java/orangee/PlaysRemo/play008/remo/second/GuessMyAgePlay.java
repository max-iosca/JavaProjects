package com.corso.java.orangee.PlaysRemo.play008.remo.second;


import java.util.*;

public class GuessMyAgePlay {

    public static final int NR_MAX_PERSONS = 5;
    public static final int NR_ATTEMPTS_PER_ROUND = 3;
    private String names[];
    private Person person;
    private Scanner input;

    public static void main(String[] args) {
        GuessMyAgePlay guessMyAge = new GuessMyAgePlay();
        guessMyAge.run();

        List<Player> players = new ArrayList<>();
        Collections.sort(players);
    }

    public GuessMyAgePlay() {
        input = new Scanner(System.in);
        this.names = new String[NR_MAX_PERSONS];
        this.names[0] = "Franco";
        this.names[1] = "Paola";
        this.names[2] = "Gianni";
        this.names[3] = "Andrea";
        this.names[4] = "Sara";
    }

    /**
     * Lancia il metodo play.
     * In questo modo qui possiamo eseguire azioni di setup a livello di Game
     * nel caso ci fossero utili. Esempio: chiedere i dati del giocatore.
     */
    public void run() {
        Player player = new Player("Remo", 50);
        play(player);
        System.out.println("Ciao " + player.getName() + ", questo é il tuo punteggio finale:");
        System.out.println("Vinte: " + player.getNrWinnings() + "\nPerse:" + player.getNrLoosings());
    }


    /**
     * Esegue in seguenza i rounds init, play, end.
     * Abbiamo quindi incapsulato (identificato) i passi base di ogni partita.
     */
    public void play(Player player) {

        boolean wonRound;
        boolean replay;
        do {

            initRound();

            // FIXME RM - ma ancora non ce piace!
            // C'é troppa logica qui che potrebbe essere incapsulata (nascosta) per essere adattabile in
            // piú contesti. Usare una interfaccia da passare a playRound potrebbe essere una buona scelta.
            // Disaccoppia il giocatore e incapsula la logica di assegnazione del punteggio.
            wonRound = playRound();
            if (wonRound)
                player.addWinnings();
            else
                player.addLoosings();

            replay = endRound();

        } while(replay);
    }

    /**
     * inizializza il round scegliendo in modo casuale un nome da assegnare dall'elenco di names
     * e creando una istanza di Person che a sua volta genera in automatico una etá in modo randomico.
     */
    protected void initRound() {
        int index = new Random().nextInt(NR_MAX_PERSONS);
        this.person = new Person(this.names[index], null);
    }

    /**
     * Esegue il round di gioco con il numero di tentativi prefissato.
     */
    protected boolean playRound() {
        boolean won = false;
        System.out.println("Indovina l'etá di " + person.getName());
        for(int i=1; i <= NR_ATTEMPTS_PER_ROUND; i++) {
            System.out.println("Tentativo nr ... " + i);
            System.out.print("Inserisci l'etá: ");
            int ageByPlayer = input.nextInt();
            if (!evaluateAge(ageByPlayer)) {
                System.out.println("...Riprova");
            } else {
                won = true;
                break;
            }
        }
        System.out.println(person.getName() + " ha " + person.getAge() + " anni");
        return won;
    }


    /**
     * Chiede al giocatore se vuole riprovare
     *
     * @return
     */
    protected boolean endRound() {
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
    @SuppressWarnings("DuplicatedCode")
    private boolean evaluateAge(int ageByPlayer) {
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
