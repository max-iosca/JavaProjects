package com.corso.java.orangee.PlaysRemo.play210.max;

import java.util.Set;

public class Portale {

    private Controller controller = new Controller();
    private static Portale nostroPortaleOnline;

    public static Portale createInstance(){
        if( nostroPortaleOnline == null){
            nostroPortaleOnline = new Portale();
        }
        return nostroPortaleOnline;
    }

    public Controller getController() {
        return controller;
    }

    /** IL PROGETTO RICHIEDE CHE:
     *  R2: IN OGNI ISTANTE DEVE ESSERE POSSIBILE INVIARE EMAIL SOLO A CHI HA ACCETTATO TUTTI E DUE I CONSENSI A MARKETING E NEWSLETTER.
     *
     * METODO CHE INVIA EMAIL (PER FINTA) NEWSLETTER E MARKETING SOLO A CHI HA ACCETTATO ENTRAMBE LE CONDIZIONI
     * @param listaPrivacyDB --> lista dove dovrebbero esser salvati i record(oggetti) di chi ha accettato tali condizioni
     */
    public void sendOnlyIfDoubleConsent (Set<Privacy> listaPrivacyDB) {
        if(listaPrivacyDB.equals(null))
            System.out.println("LISTA PRIVACY VUOTA");
        for(Privacy singoloOggettoPrivacy : listaPrivacyDB){
            if(singoloOggettoPrivacy.getConsensoMarketing() && singoloOggettoPrivacy.getConsensoNewsLetter())
                System.out.println("NEWSLETTER E PUBBLICITA' INVIATA SOLO A CHI HA ACCETTATO ENTRAMBE LE CONDIZIONI: RIUSCITO.");
        }
    }

    /**IL PROGETTO RICHIEDE CHE:
     * R3:IN OGNI ISTANTE UN UTENTE POTREBBE ACCEDERE ALLA FORM (CONSENSO NEWSLETTER E MARKETING 1/1) PER CAMBIARE IL CONSENSO SUI FLAG DEL PUNTO R2
     *
     */
    public void changeValuesOfNewsLetterAndMarketing( Contact contatto , Boolean newsLet, Boolean marketing){
        for(Contact itemContatto : controller.getDataBaseCollections().getDbContacts()) {
            if(itemContatto.equals(contatto)){
                itemContatto.getPrivacy().setConsensoMarketing(marketing);
                itemContatto.getPrivacy().setConsensoNewsLetter(newsLet);
            }
        }
    }

    /**IL PROGETTO RICHIEDE CHE:
     * R4:IN OGNI ISTANTE E' POSSIBILE CHIEDERE AL SISTEMA DI SAPERE QUALI SONO GLI UTENTI REGISTRATI
     * QUINDI SOLO CHI, DA UTENTE NON REGISTRATO E' EFFETTIVAMENTE DIVENTATO UN 'CONTACT' REGISTRATO NEL PORTALE
     */
    public void printContactsList(){
        System.out.println("\n=====LISTA CONTATTI REGISTRATI=====");
        for(Contact contatto : controller.getDataBaseCollections().getDbContacts()){
            System.out.println(contatto);
        }
        System.out.println("=====_________________________=====\n");
    }
}
