package com.corso.java.orangee.PlaysRemo.play200.v3;

import java.util.*;

public class Blog {

    private Set<Utente> listaUtenti;
    private List<Post> listaPost;

    public Blog() {
        this.listaUtenti = new HashSet<>();
        this.listaPost = new ArrayList<>();
    }

    public void iscrizioneBlog(FormDTO richiestaForm) {
        try {
            if (richiestaForm == null)
                throw new FormRichiestaNullException();
            Utente utente = registrazioneBlog(richiestaForm);
            listaUtenti.add(utente);
        } catch (FormRichiestaNullException e) {
            System.err.println("FORM RICHIESTA NON VALIDO, RIPROVARE");
        }
    }

    public Utente registrazioneBlog(FormDTO richiestaRegistrazione) {
        Utente utente = new Utente();
        utente.setEmail(richiestaRegistrazione.getEmail());
        utente.setNickname(richiestaRegistrazione.getNickName());
        utente.setNome(richiestaRegistrazione.getNome());
        return utente;
    }

    public Post scriviPost(String titoloPost, String testoPost, Utente utentePost) {
        Post nuovoPost = new Post(titoloPost, testoPost, utentePost);
        listaPost.add(nuovoPost);
        return nuovoPost;
    }

    public Commento scriviCommento(String testoCommento, Post postDaCommentare, Utente utente) {
        int indicePost = listaPost.indexOf(postDaCommentare);
        Post postCommento = listaPost.get(indicePost);
        Commento nuovoCommento = new Commento(testoCommento, utente, postDaCommentare);
        postCommento.getListaCommenti().add(nuovoCommento);
        return nuovoCommento;
    }

    public void stampaUtenti() {
        for (Utente utente : listaUtenti) {
            System.out.println(utente);
        }
    }

    public void stampaPostUtente(Utente utente) {
        System.out.println("POST DI: " + utente.getNickname());
        Collections.sort(listaPost);
        for (Post post : listaPost) {
            if (post.getUtenteDelPost().equals(utente)) {
                System.out.println(post);
            }
        }
    }

    public void stampaCommentiUtente(Utente user) {
        System.out.println("COMMENTI DI " + user.getNickname());
        for (Post post : listaPost) {
            for (Commento commento : post.getListaCommenti()) {
                if (user.equals(commento.getUtenteDelCommento())) {
                    System.out.println(commento);
                }
            }
        }
    }
}
