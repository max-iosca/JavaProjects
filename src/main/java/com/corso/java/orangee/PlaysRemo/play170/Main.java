package com.corso.java.orangee.PlaysRemo.play170;


import java.util.*;

public class Main {

    private static PoliAmbulatorio poliAmbulatorio;

    public static void main(String[] args) {

        Medico medico1 = new Medico("Medico1", "cardiologia");
        Medico medico2 = new Medico("Medico2", "pneumologia");
        Medico medico3 = new Medico("Medico3", "virologia");
        Set<Medico> medici = new HashSet<>();
        medici.add(medico1);
        medici.add(medico2);
        medici.add(medico3);

        poliAmbulatorio = new PoliAmbulatorio(medici);

        esegueVisita(new Paziente("Bohr", "BHRCHR"), Arrays.asList("cardiologia", "virologia"));
        esegueVisita(new Paziente("Einstein", "NSTBRT"), Arrays.asList("pneumologia"));
        esegueVisita(new Paziente("Curie", "CRMRIE"), Arrays.asList("cardiologia", "virologia"));
        esegueVisita(new Paziente("Heisemberg", "HSMBRG"), Arrays.asList("virologia", "pneumologia"));
        esegueVisita(new Paziente("Bohr", "BHRCHR"), Arrays.asList("cardiologia", "pneumologia"));
        esegueVisita(new Paziente("Bohr", "BHRCHR"), Arrays.asList("cardiologia", "pneumologia", "virologia"));
        esegueVisita(new Paziente("Newton", "NWTSSC"), Arrays.asList("caiologia"));
        esegueVisita(new Paziente("Newton", "NWTSSC"), Arrays.asList("cardiologia", "cardiologia"));

        poliAmbulatorio.stampaMediciPazienti();
    }

    private static void esegueVisita(Paziente paziente, List<String> elencoPrestazioniRichieste) {
        try {
            poliAmbulatorio.visita(paziente, elencoPrestazioniRichieste);
        } catch (PrestazioniRichiesteException e) {
            System.err.println(e.getMessage());
        }
    }
}
