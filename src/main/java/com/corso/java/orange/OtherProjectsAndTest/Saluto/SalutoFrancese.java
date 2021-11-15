package com.corso.java.orange.OtherProjectsAndTest.Saluto;

public class SalutoFrancese extends Saluto{
    private String saluto;

    public SalutoFrancese() {
        this.saluto = "Bonjour! ";

    }
    public SalutoFrancese(Persona nome){
        this.saluto = "Bonjour! ";
    }

    public String getSaluto(){
        return saluto;
    }


    public String salutoInLinguaOpportuna() {
        return getSaluto();
    }
}
