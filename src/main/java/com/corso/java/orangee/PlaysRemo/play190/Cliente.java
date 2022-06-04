package com.corso.java.orangee.PlaysRemo.play190;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String cognome;
    private String azienda;
    private String email;
    private String cf;
    private boolean notificaSMS;
    private boolean notificaEmail;

    public Cliente() {

    }

    public Cliente(String nome, String cognome, String azienda, String email, String cf, boolean notificaSMS, boolean notificaEmail) {
        this.nome = nome;
        this.cognome = cognome;
        this.azienda = azienda;
        this.email = email;
        this.cf = cf;
        this.notificaSMS = notificaSMS;
        this.notificaEmail = notificaEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        boolean result = Objects.equals(email, cliente.email) || Objects.equals(cf, cliente.cf);
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, cf);
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
