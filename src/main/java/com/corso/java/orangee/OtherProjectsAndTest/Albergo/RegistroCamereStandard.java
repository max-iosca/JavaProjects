package com.corso.java.orangee.OtherProjectsAndTest.Albergo;

import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe usa un Singleton pattern per evitare che vengano create
 * piú di una singola istanza della stessa classe.
 */
public class RegistroCamereStandard implements RegistroCamere  {

    private List<Camera> camere;

    private static RegistroCamereStandard singleton = null;

    // questo metodo statico é l'unico utilizzabile dall'esterno per interagire con la
    // classe (non con l'istanza).
    public static RegistroCamereStandard build() {
        if (singleton==null) {
            singleton = new RegistroCamereStandard();
        }
        return singleton;
    }

    // ...perché il costruttore é nascosto (private)
    private RegistroCamereStandard() {
        int i = 0;
        camere = new ArrayList<>();
        for(i = 1 ; i <= 4; i++) {
            camere.add(new Matrimoniale(i % 2 == 0 ));
        }
        for(i = 1 ; i <= 3; i++) {
            camere.add(new Singola());
        }
        for(i = 1 ; i <= 3; i++) {
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

    public List<Camera> getCamere() {
        return this.camere;
    }
}

