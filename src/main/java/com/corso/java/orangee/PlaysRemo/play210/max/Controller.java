package com.corso.java.orangee.PlaysRemo.play210.max;

import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormNewsLetterMarketingDTO;
import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormRegUtenteStepDue;
import com.corso.java.orangee.PlaysRemo.play210.max.dtos.FormRegUtenteStepUno;
import com.corso.java.orangee.PlaysRemo.play210.max.exceptions.FormDTOStepTwoNullException;
import com.corso.java.orangee.PlaysRemo.play210.max.exceptions.FormDTOStepOneNullException;
import com.corso.java.orangee.PlaysRemo.play210.max.exceptions.UserNotFoundException;

public class Controller {

    private DataBaseCollections dataBaseCollections;

    public Controller() {
        this.dataBaseCollections = new DataBaseCollections();
    }

    public DataBaseCollections getDataBaseCollections() {
        return dataBaseCollections;
    }

    private void checkUserStepOne(FormRegUtenteStepUno formStepUno) throws FormDTOStepOneNullException {
        if (formStepUno.equals(null))
            throw new FormDTOStepOneNullException();
    }

    private void checkUserStepTwo(FormRegUtenteStepDue formStepDue) throws FormDTOStepTwoNullException {
        if (formStepDue.getNomeUtente().equals(null) && formStepDue.getPassword().equals(null))
            throw new FormDTOStepTwoNullException();
    }

    public Contact checkBothStep(FormRegUtenteStepUno formStepUno, FormRegUtenteStepDue formStepDue) {
        Contact contattoEffettivo = null;
        boolean esisteGia = false;
        try {
            checkUserStepOne(formStepUno);
            checkUserStepTwo(formStepDue);
            contattoEffettivo = new Contact(formStepUno.getNome(), formStepUno.getCognome(), formStepUno.getCf(), formStepDue.getNrTelefono(), new Account(formStepDue.getNomeUtente(), formStepDue.getPassword(), formStepUno.getEmail()));
            esisteGia = contactAlreadyExist(contattoEffettivo);
            if(!esisteGia)
                registerContactOnDB(contattoEffettivo);

        } catch (FormDTOStepOneNullException e1) {
            System.err.println("\tErrore in check 1, istanza NULL!");
        } catch (FormDTOStepTwoNullException e2) {
            System.err.println("\tErrore in check 2, dati non completi");
        }
        return contattoEffettivo;
    }

    public void registerContactOnDB(Contact contattoDaSalvare) {
        dataBaseCollections.getDbContacts().add(contattoDaSalvare);
    }

    public void writePrivacyOnDB(Privacy privacy) {
        dataBaseCollections.getDbPrivacy().add(privacy);
    }

    public void writeValuesOfNewsletterAndMarketing(FormNewsLetterMarketingDTO valuesOfNewsAndMarketing, Contact contact){
         contact.getPrivacy().setConsensoNewsLetter(valuesOfNewsAndMarketing.getConsNewsLet());
         contact.getPrivacy().setConsensoMarketing(valuesOfNewsAndMarketing.getConsPrivacy());
         dataBaseCollections.getDbPrivacy().add(contact.getPrivacy());
    }

    public void checkFormNewsletterAndMarketing(FormNewsLetterMarketingDTO formNewsAndMark) {
        try {
            for (Contact contatto : dataBaseCollections.getDbContacts()) {
                if (!contatto.getNrTelefono().equals(formNewsAndMark.getNrTelefono())) {
                    throw new UserNotFoundException();
                }
                writePrivacyOnDB(contatto.getPrivacy());
            }
        } catch (UserNotFoundException e) {
            System.out.println("User NON trovato !!Nr Telefono diverso da quello presente nel DB!!");
        }
    }

    /**
     * IL PROGETTO RICHIEDE CHE:
     * R6: I CONTROLLI FORMALI NELLA REGISTRAZIONE DELL'UTENTE DEVONO SEMPRE VRIFICARE CHE NON ESISTE UN UTENTE CON:
     * LO STESSO USERNAME O CON LO STESSO INDIRIZZO EMAIL O CON LO STESSO NrTELEFONO
     *
     * @param contattoDaVerificare
     * @return
     */
//vojo morμμμμμμμμ
    public boolean contactAlreadyExist(Contact contattoDaVerificare) {
        for (Contact contatto : dataBaseCollections.getDbContacts()) {
            if (contattoDaVerificare.getAccount().getUsername().equals(contatto.getAccount().getUsername()) ||
                    contattoDaVerificare.getAccount().getEmail().equals(contatto.getAccount().getEmail()) ||
                    contattoDaVerificare.getNrTelefono().equals(contatto.getNrTelefono())) {
                return true;
            }
        }
        return false;
    }
}
