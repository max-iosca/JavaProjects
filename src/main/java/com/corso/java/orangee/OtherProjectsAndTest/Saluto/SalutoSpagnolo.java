package com.corso.java.orangee.OtherProjectsAndTest.Saluto;

public class SalutoSpagnolo extends Saluto {
    private String saluto;

    public SalutoSpagnolo() {
        this.saluto = "Hola! ";
    }

    public SalutoSpagnolo(Persona nome){
        this.saluto = "Hola! ";
    }

    public String getSaluto(){
        return saluto;
    }


    public String salutoInLinguaOpportuna() {
        return getSaluto();
    }
}
