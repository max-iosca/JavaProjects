package com.corso.java.orangee.PlaysRemo.Twitter.remo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Twitter {
    private Set<Post> posts;
    private Set<Utente> iscritti;
    private static Twitter twitter;

    private Twitter()  {
        posts = new HashSet<>();
        iscritti = new HashSet<>();
    }

    public static Twitter createInstance() {
        if (twitter == null) {
            twitter = new Twitter();
        }
        return twitter;
    }

    public void registraUtente(String nickname){
        Utente utente=new Utente(nickname);
        iscritti.add(utente);
    }


    public void rimuoviIscritto(String nickname) {
        Utente autore = this.getUtentebyNickname(nickname);
        if(autore!=null) {
            iscritti.remove(autore);
        }
        Iterator<Post> eliminator= posts.iterator();
        while (eliminator.hasNext()) {
            Post post= eliminator.next();
            if(post.getAutore().equals(autore)) {
                eliminator.remove();
            }

        }
    }

    public void creaPost(String testo, String nickname){
        Utente autore = this.getUtentebyNickname(nickname);
        Post post = new Post(testo, autore);
        posts.add(post);

        for(Utente seguace: autore.getSeguaci()) {
            notificaMsg(seguace, post);
        }
    }

    private void notificaMsg(Utente seguace, Post post) {
        System.out.println("Gentile " + seguace.getNickname() +", l'utente " + post.getAutore().getNickname() + " ha aggiunto un tweet");
    }

    public void seguiFollower(String nicknameSeguace, String nicknameSeguito){
        Utente utenteSeguito=this.getUtentebyNickname(nicknameSeguito);
        Utente utenteSeguace=this.getUtentebyNickname(nicknameSeguace);

        utenteSeguito.aggiungiSeguace(utenteSeguace);
        utenteSeguace.aggiungiSeguito(utenteSeguito);

    }

    public void rimuoviFollower(String nicknameSeguace, String nicknameSeguito){
        Utente utenteSeguito = this.getUtentebyNickname(nicknameSeguito);
        Utente utenteSeguace = this.getUtentebyNickname(nicknameSeguace);

        utenteSeguace.rimuoviSeguito(utenteSeguito);
        utenteSeguito.rimuoviSeguace(utenteSeguace);
    }

    private Utente getUtentebyNickname(String nickname){
        Utente utenteRegistrato=null;
        for(Utente utente:iscritti){
            if(utente.getNickname().equals(nickname)){
                utenteRegistrato=utente;
            }
        }
        return utenteRegistrato;
    }

}
