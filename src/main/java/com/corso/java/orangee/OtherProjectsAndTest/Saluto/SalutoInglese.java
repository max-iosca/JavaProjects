package com.corso.java.orangee.OtherProjectsAndTest.Saluto;

public class SalutoInglese extends Saluto {
    private String saluto;

    public SalutoInglese() {
        this.saluto = "Hello! ";

    }

    public SalutoInglese(Persona nome){
        this.saluto = "Hello! ";

    }
    public String getSaluto() {
        return saluto;
    }

    @Override
    public String salutoInLinguaOpportuna() {
        return getSaluto();
    }
}
