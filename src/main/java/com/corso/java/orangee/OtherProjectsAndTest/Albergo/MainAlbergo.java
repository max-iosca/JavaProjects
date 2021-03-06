package com.corso.java.orangee.OtherProjectsAndTest.Albergo;


import java.util.ArrayList;
import java.util.List;



public class MainAlbergo {

    private Albergo albergoA;
    private Albergo albergoB;

    public static void main(String[] args) {
        MainAlbergo main = new MainAlbergo();
            main.albergoA = new Albergo(new AssegnazioneA(), null);
            main.albergoB = new Albergo(new AssegnazioneB(), RegistroCamereFantasy.build());
        main.creaRichiesteAlloggioClienti();

        for(int i=1; i<6; i++) {
            main.albergoA.checkOut(i);
            main.stampaRegistroAlbergo(i);
        }
    }


    private void creaRichiesteAlloggioClienti() {
        System.out.println("========= Eventi Check-In =========");
        Cliente cliente;
        List<Camera> camereRichieste = new ArrayList<>();
        camereRichieste.clear();
        cliente = new Cliente("Alberto", "Leopoldi", 2, 1);
        camereRichieste.add(new Matrimoniale(true));
       // eseguiRichiesta(cliente, camereRichieste, 3);

        camereRichieste.clear();
        cliente = new Cliente("Franco", "Arciboldi", 3, 2);
        camereRichieste.add(new Matrimoniale(false));
        camereRichieste.add(new Doppia());
        camereRichieste.add(new Singola());
       // eseguiRichiesta(cliente, camereRichieste, 4);


        camereRichieste.clear();
        cliente = new Cliente("Gianni", "Maniaco", 1, 0);
        camereRichieste.add(new Singola());
        //eseguiRichiesta(cliente, camereRichieste, 4);

        camereRichieste.clear();
        cliente = new Cliente("Nadia", "Comanechi", 1, 0);
        camereRichieste.add(new Singola());
      //  eseguiRichiesta(cliente, camereRichieste, 5);
        System.out.println("====================================");
        System.out.println();

    }
/*
    private Richiesta eseguiRichiesta(Cliente cliente, List<Camera> camereRichieste, int giorniPermanenza) {
        Richiesta richiesta = new Richiesta(cliente, giorniPermanenza, camereRichieste);
        try {
            albergoA.elaboraRichiesta(richiesta);
            System.out.println("La richiesta del cliente "+ cliente.getCognome()+ " ?? stata accettata");
        } catch (CamereNonDisponibiliException e) {
            System.out.println("La richiesta del cliente "+ cliente.getCognome()+ " non ?? stata accettata");
        }
        return richiesta;
    }
*/
    private void stampaRegistroAlbergo(int giorno) {
        System.out.println("========= Registro Albergo =========");
        System.out.println("_____________ Giorno " + giorno +" _____________");
        albergoA.stampaRegistro();
        System.out.println("====================================");
        System.out.println();
    }
}
