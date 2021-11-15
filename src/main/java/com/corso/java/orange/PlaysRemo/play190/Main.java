package com.corso.java.orange.PlaysRemo.play190;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ============================
 * Play190 - CRM SuperLight
 * ============================
 *
 * L'azienda SIAMOFORTI spa ci chiede di scrivere un CRM (Customer Relationship Management) per gestire i propri clienti.
 * Il CRM deve essere in grado di fare le sequenti cose:
 *
 * R1. I clienti possono registrarsi usando i seguenti dati nella form accessibile via web:
 *     - Nome
 *     - Cognome
 *     - Nome Azienda
 *     - CF
 *     - email
 *     - accetto di ricevere notifiche via email (tipo una spunta. Quindi é un booleano)
 *     - accetto di ricevere notifiche via sms (tipo una spunta. Quindi é un booleano)
 *
 * R2. Due clienti sono uguali quando hanno stessa email oppure stesso CF.
 *
 * R3. Si possono accettare solo una delle due modalitá di ricezione delle notifiche (o SMS o email).
 * In caso contrario deve essere inviato un errore di compilazione della form.
 * E' possibile non indicare nessuna delle due voci. In tal caso il cliente non riceverá mai notifiche.
 *
 * R4. Se il cliente é giá registrato deve essere inviato un msg opportuno al cliente (via console ovviamente)
 *
 * R5. In ogni momento deve essere possibile stampare un report ordinato per cognome e nome che riporta
 * i clienti che hanno accettato di ricevere le notifiche via email o sms.
 *
 * R6. In ogni momento deve essere possibile stampare un report ordinato per cognome e nome che riporta
 * i clienti che hanno accettato di ricevere le notifiche via email o sms.
 *
 * R7. In ogni momento deve essere possibile stampare un report ordinato per Nome Azienda che riporta
 * i clienti che hanno accettato di ricevere le notifiche via email o sms.
 */
public class Main {

    public static void main(String[] args) {
        CRM crm = new CRM();

        List<FormRichiestaClienteDTO> elencoRichieste = new ArrayList<>();
        generaRichieste(elencoRichieste);

        for(FormRichiestaClienteDTO richiesta: elencoRichieste) {
            esegueRichiesta(crm, richiesta);
        }
        //Comparator<Cliente> comparatorPerNomeCognome = (Cliente c1, Cliente c2)->c1.getCognome().concat(c1.getNome()).compareTo(c2.getCognome().concat(c2.getNome()));
        Comparator<Cliente> comparatorPerNomeCognome = new OrdinaPerCognomeNomeComparator();
        crm.stampaReport(new RptCliNomeCognomeNotifiche(), comparatorPerNomeCognome);

        Comparator<Cliente> comparatorPerAzienda = (Cliente c1, Cliente c2)->c1.getAzienda().compareTo(c2.getAzienda());
        crm.stampaReport(new RptCliAziendaNotifiche(), comparatorPerAzienda);
    }

    private static void esegueRichiesta(CRM crm, FormRichiestaClienteDTO richiesta) {
        crm.registrazione(richiesta);
    }

    private static void generaRichieste(List<FormRichiestaClienteDTO> elenco) {
        elenco.add(new FormRichiestaClienteDTO("Niels", "Bohr", "AZIENDA A spa", "nielsb@gmail.com", "BHRNLS", true, true));
        elenco.add(new FormRichiestaClienteDTO("Albert", "Einstein", "AZIENDA B spa", "einstein@gmail.com", "NSTBRT", true, false));
        elenco.add(new FormRichiestaClienteDTO("Marie", "Curie", "AZIENDA C spa", "curie@gmail.com", "CRIMRI", false, true));
        elenco.add(new FormRichiestaClienteDTO("Pierre", "Curie", "AZIENDA C spa", "curie@gmail.com", "PRRCRI", true, false));
        elenco.add(new FormRichiestaClienteDTO("Carl", "Heisemberg", "AZIENDA A spa", "heisembergb@gmail.com", "HSBCRL", false, true));
        elenco.add(new FormRichiestaClienteDTO("Enrico", "Fermi", "AZIENDA D spa", "fermib@gmail.com", "FRMNRC", true, false));
        elenco.add(new FormRichiestaClienteDTO("Isaac", "Newton", "AZIENDA F spa", "isaac@gmail.com", "NWTSSC", true, false));
    }
}
