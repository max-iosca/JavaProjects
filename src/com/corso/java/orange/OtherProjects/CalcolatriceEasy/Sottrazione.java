package com.corso.java.orange.OtherProjects.CalcolatriceEasy;

public class Sottrazione extends Operazione {

    @Override
    public int esegui() {
        return this.getOperando1() - this.getOperando2();
    }
}
