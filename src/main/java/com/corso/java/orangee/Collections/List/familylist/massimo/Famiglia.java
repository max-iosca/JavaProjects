package com.corso.java.orangee.Collections.List.familylist.massimo;

public class Famiglia {
    private Persona marito;
    private Persona moglie;

    public Famiglia(Persona marito, Persona moglie) {
        this.marito = marito;
        this.moglie = moglie;
    }

    public Persona getMarito() {
        return marito;
    }

    public void setMarito(Persona marito) {
        this.marito = marito;
    }

    public Persona getMoglie() {
        return moglie;
    }

    public void setMoglie(Persona moglie) {
        this.moglie = moglie;
    }


}