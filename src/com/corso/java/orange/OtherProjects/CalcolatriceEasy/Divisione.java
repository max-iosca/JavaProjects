package com.corso.java.orange.OtherProjects.CalcolatriceEasy;

public class Divisione extends Operazione {

    @Override
    public int esegui() {
        return this.getOperando1() / this.getOperando2();
    }
}
