package com.corso.java.orangee.PlaysRemo.play210.max;

import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormNewsLetterMarketingDTO;
import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormRegUtenteStepDue;
import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormRegUtenteStepUno;
import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormUtenteDTO;

public class Main {
    public static void main(String[] args) {

        //creo il portale dove l'utOntO desidera registrarsi e crearsi un account
        Portale portale = new Portale();

//-------------------------------------------------------PROVA DI TUTTO SU UN SOLO UTENTE/CONTACT-----------------------------------------------
        //creo un utente che si interfaccia tramite formUtenteDTO
        FormUtenteDTO formUtente1 = new FormUtenteDTO("Mario","Rossi", "mariorossi@gmail.com");

        //creo due oggetti formDTO in riferimento alle due form richieste dal progetto
        FormRegUtenteStepUno formStepUno = new FormRegUtenteStepUno("Mario", "Rossi", "MAOROS89", true, "mariorossi@gmail.com");
        FormRegUtenteStepDue formStepDue = new FormRegUtenteStepDue("MarioRossi","nonloso","061122333");

        //delego al controller la verifica che ci siano i presupposti per permettere all'utente/persona di creare un account e registrarlo sul DB
        portale.getController().checkBothStep(formStepUno,formStepDue);

        //creo un oggetto formPrivacy, sempre un DTO
        FormNewsLetterMarketingDTO formNewsMarket = new FormNewsLetterMarketingDTO("mariorossi@gmail.com","061122333",true,true);

        //controllo che esista quell'utente, così da registrare le sue informazioni di privacy.
        portale.getController().checkFormNewsletterAndMarketing(formNewsMarket);

        //invia email di privacy se e solo se entrambe le condizioni su marketing e newsletter sono true...almeno dovrebbe
        portale.sendOnlyIfDoubleConsent(portale.getController().getDataBaseCollections().getDbPrivacy());

        //stampa la lista degli account/contact registrati sul DB
        portale.printContactsList();
//-------------------------------------------------------------TUTTO QUESTO BLOCCO---------------------------------------------------------------

//---------------------------------------------PROVO ANCHE ALTRI UTENTI--------------------------------------------------------------------------
    //Utente 2: Paolo Gialli - - - - - - - -
        FormUtenteDTO formUtente2 = new FormUtenteDTO("Paolo", "Gialli", "paologialli@gmail.com");
        FormRegUtenteStepUno formStepUnoU2 = new FormRegUtenteStepUno("Paolo", "Gialli","POLGLL60",true, "paologialli@gmail.com");
        FormRegUtenteStepDue formStepDueU2 = new FormRegUtenteStepDue("PaoloGialli","cheneso","3311122333");

        portale.getController().checkBothStep(formStepUnoU2,formStepDueU2);
        FormNewsLetterMarketingDTO formNewsMarketU2 = new FormNewsLetterMarketingDTO("paologialli@gmail.com","3311122333",true, false);
        portale.getController().checkFormNewsletterAndMarketing(formNewsMarketU2);

        portale.sendOnlyIfDoubleConsent(portale.getController().getDataBaseCollections().getDbPrivacy());

        portale.printContactsList();
    //- - - - - - - - - - - - - - - - - - - -

    //Utente 3: Fausto Blu- - - - - - - - - -
        Utente fausto = new Utente("Fausto", "Blu","faustoblu@gmail.com");
        FormUtenteDTO formUtente3 = new FormUtenteDTO(fausto);
        FormRegUtenteStepUno formStepUnoU3 = new FormRegUtenteStepUno("Fausto","Blu", "FASBLU78",true,"faustoblu@gmail.com");
        FormRegUtenteStepDue formStepDueU3 = new FormRegUtenteStepDue("faustoblu", "vattelapesca","063322111");
        portale.getController().checkBothStep(formStepUnoU3,formStepDueU3);
        FormNewsLetterMarketingDTO formNewsMarketU3 = new FormNewsLetterMarketingDTO("faustoblu@gmail.com","063322111",true,true);
        portale.getController().checkFormNewsletterAndMarketing(formNewsMarketU3);
        portale.sendOnlyIfDoubleConsent(portale.getController().getDataBaseCollections().getDbPrivacy());
        portale.printContactsList();

        //- - - - - - - - - - - - - - - - - - - -

        FormUtenteDTO formUtente4 = new FormUtenteDTO("Pedro","Verde","pedroverde@gmail.com");

        //Gioco un po' con i costruttori
        FormUtenteDTO formUtente5 = new FormUtenteDTO(new Utente("Gino", "la Porta", "ginolaporta@gmail.com"));

        //Gioco un po' con i costruttori 2.0
        Utente filippo = new Utente("Filippo","pupupu","filippopupupu@gmail.com");
        FormUtenteDTO formUtente6 = new FormUtenteDTO(filippo);

//---------------------------------------------FINO QUI------------------------------------------------------------------------------------------




        //portale.printContactsList();
    }
}
