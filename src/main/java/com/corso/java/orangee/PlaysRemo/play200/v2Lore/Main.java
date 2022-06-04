package com.corso.java.orangee.PlaysRemo.play200.v2Lore;

public class Main {
    public static void main(String[] args) {

        Blog forum = new Blog();

        FormRegistrazioneUtenteDTO marco = new FormRegistrazioneUtenteDTO("marco22", "marco@mail.com", "marco");
        FormRegistrazioneUtenteDTO simone = new FormRegistrazioneUtenteDTO("simone22", "simone@mail.com", "simone");
        FormRegistrazioneUtenteDTO marta = new FormRegistrazioneUtenteDTO("marta22", "marta@mail.com", "marta");

        Utente marcoU = forum.registrazione(marco);
        Utente simoneU = forum.registrazione(simone);
        Utente martaU = forum.registrazione(marta);

        forum.iscrizione(marco);
        forum.iscrizione(simone);
        forum.iscrizione(marta);

        forum.stampaUtenti();

        Post post1 = forum.posta("Ricetta", "Ingredienti...", simoneU);
        Post post2 = forum.posta("Libri preferiti", "il miei libri...", simoneU);
        Post post3 = forum.posta("10 Migliori Film", "i 10 migliori film...", simoneU);

        Post post4 = forum.posta("Sport Invernali", "Gli sport...", martaU);


        Commento commento1 = forum.commenta("Mi piace", post1, marcoU);
        Commento commento2 = forum.commenta("Non mi piace", post3, marcoU);
        Commento commento3 = forum.commenta("Credo che..", post4, marcoU);
        Commento commento4= forum.commenta("Per favore ...",post3,simoneU);


        forum.stampaPostUtente(simoneU);

        forum.stampaCommentiUtente(marcoU);

        forum.stampaCommentiUtente(simoneU);


    }
}
