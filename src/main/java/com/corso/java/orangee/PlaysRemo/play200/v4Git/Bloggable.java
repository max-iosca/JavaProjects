package com.corso.java.orangee.PlaysRemo.play200.v4Git;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.dtos.PersonaDTO;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.PersonaException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.PostException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.UtenteNonRegistratoException;
import com.corso.java.orangee.PlaysRemo.play200.v4Git.exceptions.UtenteNonValidoException;

public interface Bloggable {
    Utente registraUtente(PersonaDTO personaDTO) throws PersonaException;
    Long registraPost(String titolo, String testo, String username) throws UtenteNonRegistratoException, PostException;
    void commentaPost(Utente utente, Long postId, String testo) throws UtenteNonValidoException, PostException;
    void stampaPostUtentePerData(String username);
    void stampaCommentiDiUnUtente(String username);
}
