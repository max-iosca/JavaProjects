package com.corso.java.orangee.PlaysRemo.play200.v4Git;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.dtos.PersonaDTO;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.PersonaException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.PostException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.UtenteNonRegistratoException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.UtenteNonValidoException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Blog implements Bloggable {

    private List<Post> posts;
    private Set<Utente> utentiRegistrati;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public Utente registraUtente(PersonaDTO personaDTO) throws PersonaException {
        if (personaDTO==null)
            throw new PersonaException("Errore. Inserire utente e password");
        if (personaDTO.getNomeUtente()==null || personaDTO.getPassword()==null)
            throw new PersonaException("Errore. Inserire utente e password");

        if (utentiRegistrati==null)
            utentiRegistrati = new HashSet<>();

        Utente utente = new Utente(personaDTO.getNomeUtente(), personaDTO.getPassword());
        utentiRegistrati.add(utente);
        return utente;
    }


    public Long registraPost(String titolo, String testo, String username) throws UtenteNonRegistratoException, PostException {
        Utente autore = getUtenteByUsername(username);
        if (autore==null)
            throw new UtenteNonRegistratoException();

        Post post = new Post(titolo, testo, autore, LocalDateTime.now());
        if (post==null) {
            throw new PostException();
        }
        posts.add(post);
        return post.getId();
    }


    private Utente getUtenteByUsername(String username) {
        for(Utente utente: utentiRegistrati) {
            if (utente.getUsername().equals(username)) {
                return utente;
            }
        }
        return null;
    }

    private Post getPostById(Long id) {
        for(Post post: this.posts) {
            if (post.getId()==id) {
                return post;
            }
        }
        return null;
    }


    public void commentaPost(Utente utente, Long postId, String testo) throws UtenteNonValidoException, PostException {
        if (utente==null)
            throw new UtenteNonValidoException();
        Utente utenteRegistrato = this.getUtenteByUsername(utente.getUsername());
        if (utenteRegistrato==null)
            throw new UtenteNonValidoException();

        Post post = this.getPostById(postId);
        if (post==null)
            throw new PostException();

        Commento commento = new Commento(testo, utenteRegistrato, LocalDateTime.now());
        post.aggiungiCommento(commento);
    }

    public void stampaPostUtentePerData(String username) {
        System.out.println(ColoringConsole.GREEN_BOLD + "\nReport: tutti i post dell'utente " + username +ColoringConsole.RESET);
        Utente utente = this.getUtenteByUsername(username);
        for(Post post: posts) {
            if (post.getAutore().equals(utente)) {
                System.out.println("Data Reg.: " + post.getDataRegistrazione().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
                System.out.println("titolo: " + post.getTitolo());
                System.out.println("testo: " + post.getTesto());
            }
        }
    }

    public void stampaCommentiDiUnUtente(String username) {
        System.out.println(ColoringConsole.GREEN_BOLD + "\nReport: tutti i commenti dell'utente " + username +ColoringConsole.RESET);
        Utente utente = this.getUtenteByUsername(username);
        for(Post post: posts) {
            for(Commento commento: post.getCommenti()) {
                if (commento.getAutore().equals(utente)) {
                    System.out.println("Data Reg.: " + commento.getDataRegistrazione().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
                    System.out.println("commento: " + commento.getTesto());
                    System.out.println("\tData Reg.: " + post.getDataRegistrazione().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
                    System.out.println("\ttitolo: " + post.getTitolo());
                    System.out.println("\tautore post: " + post.getAutore().getUsername());
                }
            }
        }
    }
}
