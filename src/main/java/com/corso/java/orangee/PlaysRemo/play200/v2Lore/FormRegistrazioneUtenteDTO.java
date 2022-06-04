package com.corso.java.orangee.PlaysRemo.play200.v2Lore;

public class FormRegistrazioneUtenteDTO {

    private String nomeUtente;
    private String email;
    private String nome;

    public FormRegistrazioneUtenteDTO(String nomeUser, String email, String nome) {
        this.nomeUtente = nomeUser;
        this.nome = nome;
        this.email = email;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
