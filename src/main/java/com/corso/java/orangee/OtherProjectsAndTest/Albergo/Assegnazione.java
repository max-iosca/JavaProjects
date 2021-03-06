package com.corso.java.orangee.OtherProjectsAndTest.Albergo;


import java.util.List;

abstract public class Assegnazione {
/*
    public List<Camera> verificaDisponibilit√†(Richiesta richiesta, RegistroCamere registro) {
        List<Camera> result = new ArrayList<>();

        for(Camera cameraRichiesta : richiesta.getCamere()) {
            boolean cameraAggiunta = false;
            for (Camera cameraAlbergo : registro.getCamere()) {
                if((!cameraAlbergo.isOccupata()) && (!result.contains(cameraAlbergo))) {
                    if(cameraAlbergo.verificaCamera(cameraRichiesta)){
                        result.add(cameraAlbergo);
                        cameraAggiunta = true;
                        break;
                    }
                }
            }
            //if(!cameraAggiunta)
               // log.info("La camera richiesta " + cameraRichiesta + ", non √© disponibile per la famiglia " + richiesta.getCliente().getCognome());
        }
        return result;
    }
*/

    public Alloggio assegnaCamere(Richiesta richiesta, List<Camera> camereRichieste, List<Camera> camereAlbergo) {

        for(Camera cameraAlbergo : camereAlbergo){
            for(Camera camera : camereRichieste) {
                if(cameraAlbergo.equals(camera)) {
                    cameraAlbergo.setOccupata(true);
                    break;
                }
            }
        }
        // metodo astratto. Template method pattern.
        calcolaGiorniAggiuntivi(richiesta);

        return new Alloggio(richiesta.getCliente(), camereRichieste, richiesta.getGiorni());
    }

    public abstract void calcolaGiorniAggiuntivi(Richiesta richiesta);
}
