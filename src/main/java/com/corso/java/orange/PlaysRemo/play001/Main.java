package com.corso.java.orange.PlaysRemo.play001;

public class Main {

    public static void main(String[] args) {
        Persona david = new Studente();
        Persona jimmy = new Medico();
        Persona mario = new Insegnante();

        david.setNome("David");
        david.setCogmome("Leone");
        david.setCf("abcdef1234567890");

        System.out.println(david.nomeCognome() + " cf: "+david.getCf());
        david.verificaCf();
        jimmy.setNome("Jimmy");
        jimmy.setCogmome("Fontana");
        jimmy.setCf("abcde1234567890");

        System.out.println(jimmy.nomeCognome() + " cf: "+jimmy.getCf());
        jimmy.verificaCf();
        mario.setNome("Mario");
        mario.setCogmome("Bros");
        mario.setCf(null);

        System.out.println(mario.nomeCognome() + " cf: "+mario.getCf());
        mario.verificaCf();
    }
}
