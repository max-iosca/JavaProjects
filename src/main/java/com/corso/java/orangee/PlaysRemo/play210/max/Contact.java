package com.corso.java.orangee.PlaysRemo.play210.max;

import java.time.LocalDate;
import java.util.Objects;

class Contact {
    private Long id;
    private String nome;
    private String cognome;
    private String cf;
    private LocalDate dataNascita;
    private String nrTelefono;
    private Account account;
    private Privacy privacy = new Privacy();
    private static long counter = 1;

    public Contact(String nome, String cognome, String cf, String nrTelefono, Account account) {
        this.id = counter++;
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.nrTelefono = nrTelefono;
        this.account = new Account(account.getUsername(),account.getPassword(),account.getEmail());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCf() {
        return cf;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getNrTelefono() {
        return nrTelefono;
    }

    public Account getAccount() {
        return account;
    }

    public Privacy getPrivacy() {
        return privacy;
    }

    @Override
    public String toString() {
        return "\tID Utente:["+id+"] Nome:"+nome+" Cognome:"+cognome+" C.Fiscale: "+ cf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(cf, contact.cf) && Objects.equals(account, contact.account) && Objects.equals(privacy, contact.privacy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cf, account, privacy);
    }
}

class Account {

    private Long id;
    private String username;
    private String password;
    private String email;
    private static long counter = 1;

    public Account(String username, String password, String email) {
        this.id = counter++;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}



