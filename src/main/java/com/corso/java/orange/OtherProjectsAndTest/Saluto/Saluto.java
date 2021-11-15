package com.corso.java.orange.OtherProjectsAndTest.Saluto;

public abstract class Saluto {
    private String saluto;

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    public abstract String salutoInLinguaOpportuna();
}
