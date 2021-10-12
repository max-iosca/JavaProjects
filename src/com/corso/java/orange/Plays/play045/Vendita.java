package com.corso.java.orange.Plays.play045;


public class Vendita {

    private int progressivoVendita;
    private Cliente cliente;
    private Prodotto prodotto;
    private int qta;

    public Vendita(Cliente cliente, Prodotto prodotto, int qta) {
        this.cliente = cliente;
        this.prodotto = prodotto;
        this.qta = qta;
    }

    public int getProgressivoVendita() {
        return progressivoVendita;
    }

    public void setProgressivoVendita(int progressivoVendita) {
        this.progressivoVendita = progressivoVendita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }
}
