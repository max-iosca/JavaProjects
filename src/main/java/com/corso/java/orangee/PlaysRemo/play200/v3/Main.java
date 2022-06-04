package com.corso.java.orangee.PlaysRemo.play200.v3;

public class Main {


    public static void main(String[] args) {
        FormDTO pedro = new FormDTO("Pedro", "pedro@gmail.com", "PedroPe");
        FormDTO pablo = new FormDTO("Pablo", "pablo@gmail.com", "PabloEscoBar");
        FormDTO leonardo = new FormDTO("Leonardo", "leonardo@gmail.com", "LeoLeo");

        Blog blog = new Blog();
        Utente pedroUtente = blog.registrazioneBlog(pedro);
        Utente pabloUtente = blog.registrazioneBlog(pablo);
        Utente leonardoUtente = blog.registrazioneBlog(leonardo);

        blog.iscrizioneBlog(pedro);
        blog.iscrizioneBlog(pablo);
        blog.iscrizioneBlog(leonardo);

        blog.stampaUtenti();

        Post postUno = blog.scriviPost("Titolo inventato", "testo inventato...", pedroUtente);
        Post postDue = blog.scriviPost("La vita di Pablo Escobar", "La droga da, la droga daje!", leonardoUtente);
        Post postTre = blog.scriviPost("La nascita", "pianti e vomito...", leonardoUtente);
        Post postQuattro = blog.scriviPost("Ma che ne so", "balle spaziali...", leonardoUtente);

        Commento commentoUno = blog.scriviCommento("commento inventato",postUno, pabloUtente);
        Commento commentoDue = blog.scriviCommento("commento inutile", postQuattro, pedroUtente);
        Commento commentoTre = blog.scriviCommento("Lascia perdere", postDue, pabloUtente);
        Commento commentoQuattro = blog.scriviCommento("Che te lo dico a fare", postTre,pedroUtente);

        blog.stampaPostUtente(leonardoUtente);
        blog.stampaCommentiUtente(pabloUtente);
        blog.stampaCommentiUtente(pedroUtente);
    }

}
