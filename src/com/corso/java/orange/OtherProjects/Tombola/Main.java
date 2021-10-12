package com.corso.java.orange.OtherProjects.Tombola;



import java.util.*;

/**
 *
 */
public class Main {
    private Map<Integer, Cartella> cartelle = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
        int nrCartelle = 3;
        int c = 0;
        Cartella cartella = new Cartella(c);
        for (c = 1; c <= nrCartelle; c++) {
            cartella = new Cartella(c);
            main.cartelle.put(c, cartella);
        }

        for (Integer nrCartella : main.cartelle.keySet()) {
            main.cartelle.get(nrCartella).stampaCartella();
        }

        List<Integer> elencoNumeriEstratti = main.estrazioni();
       // cartella.elaboraVincitaSuCartella(3, );
        //for(int c = 1; c <= nrCartelle; c++) {  }
    }

//_______________________________________________________METODI DI CLASSE______________________________________________________________

    private List<Integer> estrazioni() {
        List<Integer> listaNumeriEsclusi = new ArrayList<>();
        List<Integer> listaNumeriEstratti = new ArrayList<>(); // tentativo -> mantengo una lista di numeri estratti, non era richiesta, vediamo se può aiutarmi.
        for (int i = 1; i <= 90; i++) {
            int nrEstratto = Utility.calcRandomByRange(1, 90, listaNumeriEsclusi);
            listaNumeriEsclusi.add(nrEstratto);
            System.out.print(nrEstratto + " ");
            listaNumeriEstratti.add(nrEstratto);
            return listaNumeriEstratti;
        }
        combinazioneVincita(3, listaNumeriEstratti, cartelle);
        System.out.println("LE CARTELLE VINCENTI SONO: " /* + cartelle.getNrCartella() */);
    return null;
    }


    /**
     * Cos'è una vincita? un ambo/terno/quaderna ecc....
     * Una vincita ha queste caratteristiche:
     * UNA SERIE DI NUMERI(Due per ambo, tre per il terno ect..)
     * GENERATI RANDOM
     * TROVATI dentro UNA o PIU' CARTELLE
     * SULLA STESSA RIGA
     * QUANDO SI EFFETTUA LA VINCITA, DEVO TENER TRACCIA DELLA CARTELLA, O PIU' CARTELLE, CHE HA/HANNO RISCOSSO LA RELATIVA VINCITA.
     */
    private void combinazioneVincita(int tipoVincita, List<Integer> listaNumeriEstratti, Map cartelle) {       //tipoVincita avrà come valori 2=ambo 3= terno 4=quaterna 5= cinquina 15=tombola ???
        List<Integer> listaNumeriVincita = new ArrayList<>(tipoVincita);
        listaNumeriVincita.add(0/*listaNumeriEstratti.get(numero estratto in quel momento) */);
    }
/*
    private List<Integer> ImpostaVincitaTombola(int vincita, Cartella cartelle) {

       switch (vincita) {
            case 2:
                for (Cartella cartella : cartelle) {
                    for (List<Integer> riga : righe) {
                        for (Integer cella : riga) {

                            break;

                        }
                    }
                }
            case 3:
                for (Cartella cartella : cartelle) {
                    for (List<Integer> riga : righe) {
                        for (Integer cella : riga) {

                            break;

                        }
                    }
                }
            case 4:
                for (Cartella cartella : cartelle) {
                    for (List<Integer> riga : righe) {
                        for (Integer cella : riga) {

                            break;

                        }
                    }
                }
            case 5:
                for (Cartella cartella : cartelle) {
                    for (List<Integer> riga : righe) {
                        for (Integer cella : riga) {

                            break;

                        }
                    }
                }
            case 15:
                for (Cartella cartella : cartelle) {
                    for (List<Integer> riga : righe) {
                        for (Integer cella : riga) {

                            break;

                        }
                    }
                }


        }
        return null;DEFINIRE IL RETURN
    }*/
}




