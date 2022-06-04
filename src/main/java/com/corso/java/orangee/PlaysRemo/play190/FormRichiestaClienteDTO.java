package com.corso.java.orangee.PlaysRemo.play190;


/**
 * Questa classe incapsula il concetto di DTO (Data Transfer Object)
 * Questi tipi di oggetti sono delle semplicissime classi POJO che hanno lo scopo esclusivo
 * di trasportare informazioni.
 * In questo contesto questa classe trasporta informazioni che proverrebbero virtualmente dalla form compilata
 * dall'utente che, in realtá, potrebbe non essere ancora un cliente effettivo.
 * E non sarebbe dunque effettivamente corretto creare una istanza di Cliente e passarla al CRM perché il cliente
 * non é giá potenzialmente un cliente. Quello che deve arrivare al metodo registra del CRM deve essere una Richiesta
 * di registrazione
 */
public class FormRichiestaClienteDTO {

    private String nome;
    private String cognome;
    private String azienda;
    private String email;
    private String cf;
    private boolean notificaSMS;
    private boolean notificaEmail;

    public FormRichiestaClienteDTO(String nome, String cognome, String azienda, String email, String cf, boolean notificaSMS, boolean notificaEmail) {
        this.nome = nome;
        this.cognome = cognome;
        this.azienda = azienda;
        this.email = email;
        this.cf = cf;
        this.notificaSMS = notificaSMS;
        this.notificaEmail = notificaEmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public boolean isNotificaSMS() {
        return notificaSMS;
    }

    public void setNotificaSMS(boolean notificaSMS) {
        this.notificaSMS = notificaSMS;
    }

    public boolean isNotificaEmail() {
        return notificaEmail;
    }

    public void setNotificaEmail(boolean notificaEmail) {
        this.notificaEmail = notificaEmail;
    }
}
