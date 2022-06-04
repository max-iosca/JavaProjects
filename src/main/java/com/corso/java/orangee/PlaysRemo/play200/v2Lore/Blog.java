package com.corso.java.orangee.PlaysRemo.play200.v2Lore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Blog {

    private List<Utente> utenti;
    private List<Post> listaPost;


    public Blog() {
        this.utenti = new ArrayList<>();
        this.listaPost = new ArrayList<>();

    }

    public void iscrizione(FormRegistrazioneUtenteDTO richiestaRegistrazione) {
        Utente utente = registrazione(richiestaRegistrazione);
        utenti.add(utente);
    }

    public Utente registrazione(FormRegistrazioneUtenteDTO richiesta) {
        Utente result = new Utente();
        result.setEmail(richiesta.getEmail());
        result.setNomeUtente(richiesta.getNomeUtente());
        result.setNome(richiesta.getNome());
        return result;
    }

    public Post posta(String titoloPost, String testoPost, Utente autore) {
        Post nuovoPost = new Post(titoloPost, testoPost, autore);
        listaPost.add(nuovoPost);
        return nuovoPost;
    }


    public Commento commenta(String testoCommento, Post postDaCommentare, Utente autoreCommento) {
        int indicePost = listaPost.indexOf(postDaCommentare);
        Post postCommento = listaPost.get(indicePost);
        Commento nuovoCommento = new Commento(testoCommento, autoreCommento, postDaCommentare);
        postCommento.getCommenti().add(nuovoCommento);
        return nuovoCommento;

    }

    public void stampaUtenti() {
        for (Utente user : utenti) {
            System.out.println(user);
        }
    }

    public void stampaPostUtente(Utente user) {
        System.out.println("POST DI " + user.getNomeUtente());
        Collections.sort(listaPost);
        for (Post post : listaPost) {
            if (post.getCreatorePost().equals(user)) {
                System.out.println(post);
            }
        }
    }

    public void stampaCommentiUtente(Utente user) {
        System.out.println("COMMENTI DI " + user.getNomeUtente());
        for (Post post :listaPost){
            for (Commento commento : post.getCommenti()){
                if (user.equals(commento.getAutoreCommento())){
                    System.out.println(commento);
                }
            }
        }
        }



}
