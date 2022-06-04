package com.corso.java.orangee.InterfacceComparableComparator.istitutiDiCredito;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

public class Posta implements IncrementoCapitaleIniziale{

    private String nome;
    private String citta;
    private int codicePosta;

    public Posta(String nome, String citta, int codicePosta) {
        this.nome = nome;
        this.citta = citta;
        this.codicePosta = codicePosta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getCodicePosta() {
        return codicePosta;
    }

    public void setCodicePosta(int codicePosta) {
        this.codicePosta = codicePosta;
    }

    public void incrementaCapitale(Famiglia famiglia, Integer valoreCapitaleIniziale){
        Integer aumentoCapitaleAnnuo = 0;
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT+"\nL'ENTE DELLE POSTE OFFRE UN PIANO CHE PERMETTERA' DI: "+ColoringConsole.RESET);
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT+"CON UN CAPITALE INIZIALE DI:"+valoreCapitaleIniziale+ColoringConsole.RESET);

        if(famiglia.getNumeroNucleoFamiliare() < 5)
            aumentoCapitaleAnnuo = ((valoreCapitaleIniziale/100)*7);
        if(famiglia.getNumeroNucleoFamiliare() >= 5)
            aumentoCapitaleAnnuo = ((valoreCapitaleIniziale/100)*11);
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT+"CONSIDERANDO IL NUMERO DEI COMPONENTI DELLA FAMIGLIA OTTERRAI UN AUMENTO DI: "+aumentoCapitaleAnnuo+" EURO/ANNO"+ColoringConsole.RESET);
    }
}
