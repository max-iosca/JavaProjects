package com.corso.java.orange.Eccezioni.studioMedico;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.*;

public class Main {

    private Set<Paziente> listaDeiPazientiInAmbulatorio = new HashSet();
    private List<Prenotazione> listaDellePrenotazioni = new ArrayList<>();

    public static void main(String[] args) throws Exception { //NON QUI IL THROWS!!!! O ESCE APPENA INCONTRA UN ERRORE (SALTA AL CATCH E SALTA LE ISTRUZIONI SUCCESSIVE)

        Main poliambulatorio = new Main();

        Medico cardiologo = new Medico("CARDIO", "Cardiologo");
        Medico pneumologo = new Medico("PNEUMO", "Pneumologo");
        Medico virologo = new Medico("VIROL", "Virologo");

        Paziente paziente1 = new Paziente("Tizio", "NLSTZO90");
        Paziente paziente2 = new Paziente("Caio", "NLSCAI89");

        try {
            poliambulatorio.prenotaVisita(paziente1, cardiologo, "cuore");
            poliambulatorio.prenotaVisita(paziente2, cardiologo, "cuore");
            poliambulatorio.prenotaVisita(paziente1, virologo, "virus");
            poliambulatorio.prenotaVisita(paziente2, pneumologo, ""); //SE POPOLASSI IL CAMPO 'TIPOVISITA' CON 'NULL' - - -> ESPLODE TUTTO
            poliambulatorio.prenotaVisita(paziente1, cardiologo, "cuore");
            poliambulatorio.prenotaVisita(paziente1, pneumologo, "cuore");
        } catch (TipoVisiteRichiesteUgualiException exception) {
            System.out.println(exception.getMessage());
        } catch (NrMaxVisiteNelloStessoGiornoException exception) {
            System.out.println(exception.getMessage());
        }

        cardiologo.stampaListaPazienti();
        virologo.stampaListaPazienti();
        pneumologo.stampaListaPazienti();

        poliambulatorio.reportPazienti();
    }

        /**
         * RICORDATI CHE:
         * private List<Prenotazione> listaDellePrenotazioni = new ArrayList<>();
         */
        public void prenotaVisita (Paziente paziente, Medico medico, String tipoVisita) throws TipoVisiteRichiesteUgualiException, NrMaxVisiteNelloStessoGiornoException {
            if (medico.equals(null) || paziente.equals(null) || tipoVisita.equals("")) {
                System.out.println(ColoringConsole.PURPLE_BOLD_BRIGHT+"ERRORE TUTTI I CAMPI DEVONO ESSERE POPOLATI\n"+ColoringConsole.RESET);
                return;
            }
            System.out.println(ColoringConsole.CYAN_BOLD_BRIGHT+"IL PAZIENTE: " + paziente.getNome() + " RICHIEDE UNA PRENOTAZIONE CON:");
            System.out.println("DOCTOR: " + medico.getNome());

            int contatoreTipoVisite = 0;

            for (Prenotazione prenotazione : listaDellePrenotazioni) {
                /**
                 * EQUALS IMPOSTATO SU 1)NOME PAZIENTE 2) TIPO VISITA
                 * DA USARE!!!
                 */
                if (prenotazione.getTipoVisita().equals(tipoVisita)) {
                    contatoreTipoVisite++;
                    paziente.setNrVisite(paziente.getNrVisite()+contatoreTipoVisite);
                    /**
                     * GESTIRE CORRETTAMENTE QUESTO CONTATORE, COSI NON FUNGE...
                     */
                    if (paziente.getNrVisite() > 1) {
                        throw new TipoVisiteRichiesteUgualiException(ColoringConsole.RED_BOLD_BRIGHT+"NON PUOI AVERE DUE VISITE UGUALI NELLO STESSO GIORNO");
                    }
                    if (paziente.getNrVisite() > 2) {
                        throw new NrMaxVisiteNelloStessoGiornoException("PUOI RICHIEDERE UN MASSIMO DI DUE VISITE NELLO STESSO GIORNO"+ColoringConsole.RESET);
                    }
                }
                paziente.setNrVisite(paziente.getNrVisite()+contatoreTipoVisite);
            }

            medico.getListaPazienti().add(paziente);
            paziente.setNrVisite(+1);
            listaDellePrenotazioni.add(new Prenotazione(paziente, medico, tipoVisita));
            System.out.println("PRENOTAZIONE EFFETTUATA\n"+ColoringConsole.RESET);
            listaDeiPazientiInAmbulatorio.add(paziente);
        }

    /** RICORDATI CHE:
     *  private Set<Paziente> listaDeiPazientiInAmbulatorio = new HashSet();
     */
    public void reportPazienti(){
        System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT+"\nREPORT PAZIENTI ATTUALE:");
        System.out.print("NOME");
        System.out.println("\t\tNR VISITE ATTUALI");
        System.out.println("--------------------------------");
            for(Paziente paziente : listaDeiPazientiInAmbulatorio){
                System.out.print(paziente.getNome());
                System.out.println("\t\t\t\t"+paziente.getNrVisite());
            }
        System.out.println("--------------------------------"+ColoringConsole.RESET);
        }
    }

