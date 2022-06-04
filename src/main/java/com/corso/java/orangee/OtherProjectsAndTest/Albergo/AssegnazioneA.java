package com.corso.java.orangee.OtherProjectsAndTest.Albergo;

public class AssegnazioneA extends Assegnazione {

    @Override
    public void calcolaGiorniAggiuntivi(Richiesta richiesta) {
        if (richiesta.getCamere().size()>1)
            richiesta.setGiorni(richiesta.getGiorni() +  1);
    }
}
