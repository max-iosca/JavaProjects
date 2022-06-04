package com.corso.java.orangee.Array.podistica;

public class Corsa {
    private static final int NR_MAX_ISCRITTI = 50;
    private int contatoreNrPettorina = 1;
    private int posizioneRegistro;
    private String nome;
    private int lunghezzaPercorso;
    private Atleta[] registroPartecipanti;
    // avrei potuto fare Atleta[] registroPartecipanti = new Atleta[NR_MAX_ISCRITTI]; ma generalmente si fa nel costruttore.

    public Corsa(String nome, int lunghezzaPercorso) {
        this.registroPartecipanti = new Atleta[NR_MAX_ISCRITTI];
        this.nome = nome;
        this.lunghezzaPercorso = lunghezzaPercorso;
    }

    public void iscriviAtleta(Atleta atleta){
        if(atleta == null){
            System.out.println("\n🤘🤘🤘 HAI CERCATO DI ISCRIVRE UN NULL 🤘🤘🤘");
            return;
        }
        for(Atleta partecipante : this.registroPartecipanti){
            if(partecipante != null){
                //questo è MOLTO OOP
                if(atleta.equals(partecipante)){
                //questo NON è molto OOP...
                //if(atleta.getEmail().equals(partecipante.getEmail())){
                    System.out.println("ATLETA GIA' REGISTRATO");
                    return;
                }
            }
        }
        this.registroPartecipanti[posizioneRegistro] = atleta;
        this.posizioneRegistro++;
        atleta.setNumeroPettorina(contatoreNrPettorina);
        this.contatoreNrPettorina++;

    }

    public void rimuoviIscrizioneAtleta(Atleta atleta){
        if(atleta == null) {
            System.out.println("ATLETA NON VALIDO");
            return;
        }
        //for(Atleta iscritto : this.registroPartecipanti){ questo è un for each() ma volendo posso usare il ciclo classico
        for(int i=0 ; i<NR_MAX_ISCRITTI ; i++){
            if(this.registroPartecipanti[i] != null){
                if(atleta.getEmail().equals(this.registroPartecipanti[i].getEmail())){
                    this.registroPartecipanti[i] = null;
                    return;
                }
            }
        }
        System.out.println("ATLET NON PRESENTE IN ELENCO!");
    }

    public void stampaRegistro(){
        System.out.println("");
        System.out.println("========================================REGISTRO ISCRITTI=========================================");
        for(Atleta atleta : this.registroPartecipanti){
            if(atleta != null)
            System.out.println(" -: " + atleta);
        }
        System.out.println("==================================================================================================");
    }
    public int getContatore() {
        return posizioneRegistro;
    }

    public void setContatore(int contatore) {
        this.posizioneRegistro = contatore;
    }

}
