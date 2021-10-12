package com.corso.java.orange.Collections.List.macchina2;

public class Macchina {

    private String modello;
    private Integer anno;
    private Motore motore;

    public Macchina() {}

    public Macchina(String modello, Integer anno, Motore motore) {
        this.modello = modello;
        this.anno = anno;
        this.motore = motore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    public Motore getMotore() {
        return motore;
    }
}
