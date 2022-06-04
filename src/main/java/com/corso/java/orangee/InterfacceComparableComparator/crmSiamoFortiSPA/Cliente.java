package com.corso.java.orangee.InterfacceComparableComparator.crmSiamoFortiSPA;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    private String nome;
    private String cognome;
    private String nomeAzienda;
    private String codFisc;
    private String email;
    boolean notificheMail;
    boolean notificheSms;

    public Cliente(String nome, String cognome, String nomeAzienda, String codFisc, String email, boolean notificheMail, boolean notificheSms) {
        try {
            this.nome = nome;
            this.cognome = cognome;
            this.nomeAzienda = nomeAzienda;
            this.codFisc = codFisc;
            this.email = email;
            this.notificheMail = notificheMail;
            this.notificheSms = notificheSms;

            if (notificheMail == true && notificheSms == true)
                throw new AccettareSoloUnaSceltaDiNotificaException(ColoringConsole.RED_BOLD_BRIGHT + "ERRORE! PUOI ACCETTARE SOLO UN TIPO DI NOTIFICA" +
                        "\nCLIENTE: " + this.nome + " " + this.cognome + " DEVE MODIFICARE LA SCELTA\n" + ColoringConsole.RESET);
        } catch (AccettareSoloUnaSceltaDiNotificaException e) {
            System.out.println(e.getMessage());
        }
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

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNotificheMail() {
        return notificheMail;
    }

    public void setNotificheMail(boolean notificheMail) {
        this.notificheMail = notificheMail;
    }

    public boolean isNotificheSms() {
        return notificheSms;
    }

    public void setNotificheSms(boolean notificheSms) {
        this.notificheSms = notificheSms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codFisc, cliente.codFisc) || Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codFisc, email);
    }

    @Override
    public int compareTo(Cliente o) {
        return this.getCognome().concat(this.getNome()+this.isNotificheMail()+this.isNotificheSms()).compareTo(o.getCognome().concat(o.getNome()+o.isNotificheMail()+o.isNotificheSms()));
    }
}
