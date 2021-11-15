package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.RemoGenerics.src;

import java.util.List;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        Magazzino<Persona, Integer> copenaghen = new Magazzino<>();
        final Persona einstein = new Persona("Albert", "Einstein", "ABRMCCD..");
        final Persona bohr = new Persona("Niels", "Bohr", "NLSBHR..");
        final Persona curie = new Persona("Marie", "Curie", "CRMRI..");

        copenaghen.carico(einstein, 1);
        copenaghen.carico(bohr, 2);
        copenaghen.carico(curie, 4);
        copenaghen.scarico(einstein, 1);
        copenaghen.scarico(curie, 1);

        /**
         * Ci serve una funzione lambda (la parte dx di questa uguaglianza)
         * ed incapsularla in un "predicato" (Predicate) di java per poter eseguire a
         * runtime il filtro che ci consente di estrarre il prodotto che risponde
         * a questa condizione p.equals(pAA)
         */
        Predicate<Persona> predicato = p->p.equals(curie);


        /**
         * Ci serve una lambda per operare una somma ed ottenere il totale di tutte
         * le occorrenze movimentate di tipo pAA.
         * Questa lambda ora intercetta il tipo di movimento per sommare algebricamente le quantitá.
         */
        SommaFunc<Integer, TipoMovimento> somma = (x, y, s) -> (s.equals(TipoMovimento.CARICO)?(x + y):(x - y));


        /**
         * eseguiamo il metodo esistenza passando come parametro la lambda incapsulata
         * nell´interfaccia funzionale di tipo Predicate.
         * Quel predicato verrá eseguito su ogni transazione di magazzino.
         */
        List<TransazioneMagazzino<Persona, Integer>> transazioni = copenaghen.esistenza(predicato);
        for(TransazioneMagazzino<Persona, Integer> item: transazioni) {
            System.out.printf("P->%s, Q:%d, %s \n", item.getSoggetto(), item.getQuantita(), ((TipoMovimento.CARICO.equals(item.getMovimento()))?"Entrato":"Uscito"));
        }

        System.out.printf("\nNumero persone presenti con invito a nome %s, %d", curie.getCognome(), copenaghen.esistenza(predicato, somma));
    }
}