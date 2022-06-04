package com.corso.java.orangee.OtherProjectsAndTest.Saluto;

public class MainSaluto {
    public static void main(String[] args) {

        Saluto salutoInglese = new SalutoInglese();
        Saluto salutoFrancese = new SalutoFrancese();
        Saluto salutoSpagnolo = new SalutoSpagnolo();

        System.out.println(salutoInglese.salutoInLinguaOpportuna());
        System.out.println(salutoFrancese.salutoInLinguaOpportuna());
        System.out.println(salutoSpagnolo.salutoInLinguaOpportuna());

        Persona massimo = new Persona("Massimo", "Iosca");
        salutoInglese = new SalutoInglese(massimo);
        System.out.println(salutoInglese.getSaluto() + massimo.getNome());

        salutoFrancese = new SalutoFrancese(massimo);
        System.out.println(salutoFrancese.getSaluto() + massimo.getNome());

        salutoSpagnolo = new SalutoSpagnolo(massimo);
        System.out.println(salutoSpagnolo.getSaluto() + massimo.getNome());
    }
}
