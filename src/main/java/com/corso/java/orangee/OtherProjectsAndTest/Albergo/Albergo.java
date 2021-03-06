package com.corso.java.orangee.OtherProjectsAndTest.Albergo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Albergo {

    private Assegnazione assegnazione;
    private RegistroCamere registro;
    private List<Alloggio> alloggi;

    public Albergo(Assegnazione assegnazione, RegistroCamere registroCamere) {
        this.assegnazione = assegnazione;
        // Se il parametro registroCamere non viene passato allora vuol dire che
        // la classe Albergo dovr√° crearsi da sola le camere usando una sua classe di default.
        if (registroCamere==null)
            this.registro = RegistroCamereStandard.build();
        this.alloggi = new ArrayList<>();
    }
/*
    public void elaboraRichiesta(Richiesta richiesta) throws CamereNonDisponibiliException {

            List<Camera> camereDisponibili = this.assegnazione.verificaDisponibilit√†(richiesta , registro);

            if(camereDisponibili.size() == richiesta.getCamere().size()){
                Alloggio alloggio = assegnazione.assegnaCamere(richiesta, camereDisponibili, registro.getCamere());
                alloggi.add(alloggio);
            }
            else {
                //log.info("camera non disponibile: " + richiesta.getCliente().getCognome());
                throw new CamereNonDisponibiliException();
            }
    }
*/
    public void stampaRegistro() {
        for (Alloggio alloggio : alloggi) {
           // System.out.println("I signori " + alloggio.getCliente().getCognome() + " alloggiano in: ");
            for (Camera camera : alloggio.getCamere()) {
                System.out.println("Camera: " + camera.getIdCamera());
            }
        }
    }

    public void checkOut(int giorno) {
        Iterator<Alloggio> alloggioIterator = alloggi.iterator();
        while( alloggioIterator.hasNext()) {
            Alloggio alloggioAttuale = alloggioIterator.next();
            if( alloggioAttuale.getGiorni() == giorno) {
                List<Camera> camere = alloggioAttuale.getCamere();
                for(Camera camera : camere){
                    camera.setOccupata(false);
                }

                // Questa istruzione fa la stessa cosa del for precedente!
                alloggioAttuale.getCamere().stream().forEach(e -> e.setOccupata(false));

                alloggioIterator.remove();
            }
        }
    }
}
