package com.corso.java.orangee.PlaysRemo.play200.v1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Blog implements Comparable<Commento> {

    private List<Utente> listaUtentiRegistrati;
    private List<Post> listaPostBlog;
    private LocalDate dataOnline;
    private List<Commento> listaCommentiAlPost;

    public Blog() {
        this.listaUtentiRegistrati = new ArrayList<>();
        this.listaPostBlog = new ArrayList<>();
        this.listaCommentiAlPost = new ArrayList<>();
        this.dataOnline = LocalDate.now();
        //Non mi serve sapere quando è stato creato il blog in questo contesto, ma potrebbe esserlo in altri..
    }

    public void registrazioneAlBlog(Utente utente) {
        if (listaUtentiRegistrati.isEmpty())
            listaUtentiRegistrati.add(utente);
        try {
            control(utente);
            listaUtentiRegistrati.add(utente);
        } catch (UtenteGiaRegistratoException e) {
            System.err.println("ERRORE! Utente gia registrato al blog");
        }
    }

    private void checkUtenteRegistrato(Utente utente) throws UtenteNonRegistratoAlBlogException {
        for (Utente utenteInLista : listaUtentiRegistrati) {
            if (!utente.getNickName().equalsIgnoreCase(utenteInLista.getNickName()))
                throw new UtenteNonRegistratoAlBlogException();
        }
    }

    public void scriviPost(Utente utente, Post postDaScrivere) {
        try {
            checkUtenteRegistrato(utente);
            listaPostBlog.add(postDaScrivere);
        } catch (UtenteNonRegistratoAlBlogException e) {
            System.err.println("ERRORE, Devi prima registrarti per poter scrivere un post sul blog");
        }
    }

    public void scriviCommentoAlPost(Utente utente, Post postDiRiferimento, Commento commentoDaScrivere) {
        for (Utente utentePost : listaUtentiRegistrati) {
            if (utentePost.equals(utente)) {
                for (Post postBlog : listaPostBlog) {
                    if ((postBlog.equals(postDiRiferimento)))
                        listaCommentiAlPost.add(commentoDaScrivere);
                }
            }
        }
    }

    private void control(Utente utente) throws UtenteGiaRegistratoException {
        for (Utente utenteInLista : listaUtentiRegistrati) {
            if (utente.getNickName().equalsIgnoreCase(utenteInLista.getNickName()))
                throw new UtenteGiaRegistratoException();
        }
    }

    public void stampaTuttiPost(){

    }

    public void stampaTuttiCommenti(){

    }

    @Override
    public int compareTo(Commento o) {
        return 0;
    }
}
