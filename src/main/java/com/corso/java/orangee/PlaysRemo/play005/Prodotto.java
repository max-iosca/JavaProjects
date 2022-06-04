package com.corso.java.orangee.PlaysRemo.play005;

/**
 * Dichiariamo la classe abstract in modo da non consentire la creazione di un oggetto concreto.
 * E' questa classe che fa tutto per ora, poiché il calcolo del prezzo finale di vendita rimane sempre lo stesso.
 */
abstract public class Prodotto {

    private String codice;
    private String nome;
    private float prezzoUnitario;
    private float scontoPercentuale;

    public Prodotto(String codice, String nome, float prezzoUnitario) {
        this.codice = codice;
        this.nome = nome;
        this.prezzoUnitario = prezzoUnitario;
    }

    /**
     * Questo calcolo é valido per ogni tipo di prodotto.
     * Ma se un domani si volesse utilizzare una formula diversa per un ProdottoNonAlimentare,
     * basterebbe ridefinirlo nella classe opportuna.
     * @param qta
     * @return
     */
    public float calcolaPrezzoVendita(int qta) {
        float prezzoUnitarioNetto = this.prezzoUnitario - ((this.prezzoUnitario * scontoPercentuale) / 100);
        return prezzoUnitarioNetto * qta;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public float getScontoPercentuale() {
        return scontoPercentuale;
    }

    protected void setScontoPercentuale(float scontoPercentuale) {
        this.scontoPercentuale = scontoPercentuale;
    }
}
