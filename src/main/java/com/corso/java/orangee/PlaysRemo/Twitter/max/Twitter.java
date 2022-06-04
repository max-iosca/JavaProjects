package com.corso.java.orangee.PlaysRemo.Twitter.max;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Twitter {
    private Set<Post> listaPost;
    private Set<Utente> listaUtenti;

    public Twitter() {
        this.listaPost = new HashSet<>();
        this.listaUtenti = new HashSet<>();
    }

    public void registrazione(String nickname) {
        Utente utente = new Utente(nickname);
        listaUtenti.add(utente);
    }

    public void rimuoviIscritto(String nickname) {
        Utente autore = this.getUtenteByNickname(nickname);
        if (autore != null) {
            listaUtenti.remove(autore);
        }
        Iterator<Post> iterator = listaPost.iterator();
        while (iterator.hasNext()) ;
        Post item = iterator.next();
        if (autore.getNickname().equals(item)) {
            iterator.remove();
            System.out.println("ELIMINATO DA TWITTER: " + item.getAutore());
        }
    }


    public void creaPost(String nickname, String testo) {
        Utente autore = this.getUtenteByNickname(nickname);
        Post post = new Post("il mio testo", this.getUtenteByNickname(nickname));
        listaPost.add(post);
        for (Utente seguace : autore.getListaSeguaci()) {
            notificaMsg(seguace, post);
        }
    }

    private void notificaMsg(Utente seguace, Post post) {

        System.out.println("Gentile " + seguace.getNickname() + " , il tuo Follower " + post.getAutore().getNickname() + " ha scritto un tweet");

    }

    public void seguiFollower(String nicknameSeguace, String nicknameSeguito) {
        Utente utenteSeguito = this.getUtenteByNickname(nicknameSeguito);
        Utente utenteSeguace = this.getUtenteByNickname(nicknameSeguace);

        utenteSeguito.aggiungiSeguace(utenteSeguace);
        utenteSeguace.aggiungiSeguito(utenteSeguito);
    }

    public void rimuoviFollower(String nicknameSeguace, String nicknameSeguito) {
        Utente utenteSeguito = this.getUtenteByNickname(nicknameSeguito);
        Utente utenteSeguace = this.getUtenteByNickname(nicknameSeguace);

        utenteSeguito.rimuoviSeguace(utenteSeguace);
        utenteSeguace.rimuoviSeguito(utenteSeguito);
    }

    private Utente getUtenteByNickname(String nickname) {
        Utente utenteRegistrato = null;
        for (Utente iscritto : listaUtenti) {
            if (iscritto.getNickname().equalsIgnoreCase(nickname)) {
                utenteRegistrato = iscritto;
            }
        }
        return utenteRegistrato;
    }
}
