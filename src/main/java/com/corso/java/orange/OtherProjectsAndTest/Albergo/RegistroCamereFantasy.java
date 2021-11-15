package com.corso.java.orange.OtherProjectsAndTest.Albergo;

import java.util.ArrayList;
import java.util.List;

public class RegistroCamereFantasy implements RegistroCamere {

    private List<Camera> camere;
    private static RegistroCamereFantasy singleton = null;

    public static RegistroCamereFantasy build() {
        if (singleton==null) {
            singleton = new RegistroCamereFantasy();
        }
        return singleton;
    }

    private void RegistroCamereFantasy() {
        int i = 0;
        camere = new ArrayList<>();
        for(i = 1 ; i <= getRandomNumber(1, 6); i++) {
            camere.add(new Matrimoniale(i % 2 == 0 ));
        }
        for(i = 1 ; i <= getRandomNumber(1, 4); i++) {
            camere.add(new Singola());
        }
        for(i = 1 ; i <= getRandomNumber(1, 10); i++) {
            camere.add(new Doppia());
        }
        int k = 0;
        for (Camera camera : camere) {
            camera.setIdCamera( ""+ ++k );
        }

        System.out.println("------ Registro Camere ------");
        for(Camera camera: camere) {
            System.out.println(camera);
        }
        System.out.println("-----------------------------");
        System.out.println();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public List<Camera> getCamere() {
        return this.camere;
    }
}

