package com.corso.java.orange.Costruttori;


/**
 * In questa classe decidiamo di non esporre il metodo setVelocitaMax(int valore) perché
 * vogliamo che la velocitá massimasia definita solo al momento della creazione dell'istanza.
 * Quindi, solo nei costruttori.
 */
public class Macchina {

    private String modello;
    private long velocita;
    private long velocitaMax;
    private Persona proprietario;

    /**
     * Questo costruttore richiede un parametro di tipo Persona ed uno di tipo int.
     * I parametri ricevuti vengono assegnati agli attriubuti della classe.
     * @param proprietario
     * @param velocitaMax
     */
    public Macchina(Persona proprietario, int velocitaMax) {
        this.velocitaMax = velocitaMax;
        this.velocita = 0;
        this.proprietario = proprietario;
    }

    /**
     * Esempio di overloading di un metodo
     * Questo é un ulteriore costruttore che richiede solo il parametro di tipo Persona.
     *
     * @param proprietario
     */
    public Macchina(Persona proprietario) {
        // si puó implementarlo cosi: chiama il costruttore definito prima
        this(proprietario, 150);

        // ...oppure cosi: ma otteniamo una duplicazione di codice
        this.proprietario = proprietario;
        this.velocitaMax = 150;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public long getVelocita() {
        return velocita;
    }

    public void setVelocita(long velocita) {
        this.velocita = velocita;
    }

    public Persona getProprietario() {
        return proprietario;
    }

    public long getVelocitaMax() {
        return velocitaMax;
    }
}
