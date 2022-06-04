package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge_V1;

import java.util.Random;

public class Persona {
    private String nome;
    private Integer eta;

    public Persona(String nome, Integer eta) {
        this.nome = nome;
        //Persona, essendo classe Padre, accetterà sempre valori dichiarati E valori null
        // in quest'ultimo caso, genera un numero random
        if (eta == null) {
            this.eta = calcolaEtaRandom(18, 85);
        } else {
            this.eta = eta;
        }
    }

    public Persona() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    private int calcolaEtaRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(max) + min;
    }

}
