package com.corso.java.orangee.PlaysRemo.play200.v4Git;

import com.corso.java.orangee.PlaysRemo.play200.v4Git.dtos.PersonaDTO;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.PersonaException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.PostException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.UtenteNonRegistratoException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.UtenteNonValidoException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * =====================================
 * Play200 - Blog
 * =====================================
 * Scrivere una applicazione per gestire il classico funzionamento di un Blog:
 *
 * R1. Per scrivere su un blog bisogna essere iscritti al blog (registrazione);
 * R2. Scrivere su un blog equivale a registrare i seguenti dati:
 *     - Titolo del post
 *     - testo del post
 *     - data di registrazione del post
 *     - autore del post (l'utente)
 * R3. I post possono essere collegati a commenti di altri utenti;
 * R4. I commenti sono definiti con i seguenti dati:
 *     - testo del commento
 *     - data di inserimento del commento
 *     - autore del commento
 * R5. In ogni istante é possibile richiedere al sistema di stampare a video:
 *     a. tutti i post di un utente ordinati per data di registrazione
 *     b. tutti i commenti che un utente ha scritto sui vari post (mostrare solo il titolo del post oltre che il commento)
 *
 */
public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog();

        List<PersonaDTO> listaPersone = new ArrayList<>();
        listaPersone.add(new PersonaDTO("Albert", "prova"));
        listaPersone.add(new PersonaDTO("Lise", "test"));
        listaPersone.add(new PersonaDTO("Niels", "root"));
        listaPersone.add(new PersonaDTO("Leonardo", "root"));
        listaPersone.add(new PersonaDTO("Rosalind", "prova"));
        listaPersone.add(new PersonaDTO("Marie", "xxxxx"));
        listaPersone.add(new PersonaDTO("Galileo", "prova"));
        listaPersone.add(new PersonaDTO("Fabiola", "admin"));
        listaPersone.add(new PersonaDTO("Charles", "root"));
        listaPersone.add(new PersonaDTO("Jocelyn", "root"));

        Set<Utente> utenti = registraUtenti(listaPersone, blog);

        List<Long> elencoIdPosts = registraPosts(blog, utenti);

        registraCommenti(blog, elencoIdPosts, utenti);

        blog.stampaPostUtentePerData("Albert");
        blog.stampaCommentiDiUnUtente("Albert");
    }

    private static void registraCommenti(Blog blog, List<Long> elencoIdPosts, Set<Utente> utenti) {
        for(Utente utente: utenti) {
            for(Long postId: elencoIdPosts) {
                try {
                    blog.commentaPost(utente, postId, "Commento al post...con id " + postId + " ... ");
                } catch (UtenteNonValidoException | PostException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    private static List<Long> registraPosts(Blog blog, Set<Utente> utenti) {
        List<Long> elencoIdPosts = new ArrayList<>();
        for (Utente utente : utenti) {
            try {
                elencoIdPosts.add(blog.registraPost("Il mio primo Post!", "questo é il testo del post di " + utente.getUsername() + " ...", utente.getUsername()));
            } catch(UtenteNonRegistratoException | PostException e){
                System.err.println(e.getMessage());
            }
        }
        return elencoIdPosts;
    }

    private static Set<Utente> registraUtenti(List<PersonaDTO> listaPersone, Blog blog) {
        Set<Utente> result = new HashSet<>();
        for(PersonaDTO personaDTO: listaPersone) {
            try {
                result.add(blog.registraUtente(personaDTO));
            } catch (PersonaException e) {
                System.err.println(e.getMessage());
            }
        }
        return result;
    }
}
