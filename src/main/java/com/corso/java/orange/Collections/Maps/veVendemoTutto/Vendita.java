package com.corso.java.orange.Collections.Maps.veVendemoTutto;

public class Vendita {
    private Prodotto prodotto;
    private Cliente cliente;
    private int qntVenduta;

    public int getQntVenduta() {
        return qntVenduta;
    }

    public void setQntVenduta(int qntVenduta) {
        this.qntVenduta = qntVenduta;
    }

    public Vendita(Prodotto prodotto, Cliente cliente, int quantita) {
        this.prodotto = prodotto;
        this.cliente = cliente;
        this.qntVenduta = quantita;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
