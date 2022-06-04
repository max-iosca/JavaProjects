package com.corso.java.orangee.PlaysRemo.play170;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PoliAmbulatorio {

    private Set<Medico> medici;
    private List<String> prestazioniDisponibili;

    public PoliAmbulatorio(Set<Medico> medici) {
        this.prestazioniDisponibili = new ArrayList<>();
        this.medici = medici;
        ottieniElencoPrestazioniDisponibiliDaiMedici();
    }

    private void ottieniElencoPrestazioniDisponibiliDaiMedici() {
        for(Medico medico: medici) {
            this.prestazioniDisponibili.add(medico.getSpecializzazione());
        }
    }


    public void visita(Paziente paziente, List<String> prestazioniRichieste) throws PrestazioniRichiesteException {
        if (prestazioniRichieste==null)
            throw new PrestazioniRichiesteException("Le prestazioni richieste dal paziente " + paziente.getCognome() +" non sono valide");

        if (prestazioniRichieste.size()>2)
            throw new PrestazioniRichiesteException("Le prestazioni richieste dal paziente " + paziente.getCognome() +" sono maggiori del numero consentito");

        // verifica che le prestazioni siano disponibili in base al medico
        for(String prestazione: prestazioniRichieste) {
            if (!prestazioniDisponibili.contains(prestazione))
                throw new PrestazioniRichiesteException("La prestazione richiesta dal paziente " + paziente.getCognome() +" non é tra quelle previste");
        }

        // come verifichiamo i duplicati?
        Set<String> prestazioniRichiesteCheckDupe = new HashSet<>();
        for(String prestazione: prestazioniRichieste) {
            if (!prestazioniRichiesteCheckDupe.add(prestazione)) {
                throw new PrestazioniRichiesteException("Errore");
            }
        }

        // Eliminiamo eventuali duplicati
        Set<String> prestazioniRichiesteSet = new HashSet<>();
        prestazioniRichiesteSet.addAll(prestazioniRichieste);

        for(String specializzazione: prestazioniRichiesteSet) {
            for (Medico medico : medici) {
                if (medico.getSpecializzazione().equals(specializzazione)) {
                    medico.aggiungiPaziente(paziente);
                    paziente.aggiungiVisitaRichiesta();
                    break;
                }
            }
        }
    }


    public void stampaMediciPazienti() {
        System.out.println("Stampa Elenco Medici-Pazienti");
        for(Medico medico: medici) {
            System.out.println("Medico: " + medico.getCognome() + " specialista in " + medico.getSpecializzazione());
            for(Paziente paziente: medico.getPazienti()) {
                System.out.println("\t\t" + paziente.getCognome() + " " + paziente.getCf() + " nr visite: " + paziente.getNrVisiteRichieste());
            }
        }
    }
}
