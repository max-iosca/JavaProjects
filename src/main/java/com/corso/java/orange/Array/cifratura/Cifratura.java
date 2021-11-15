package com.corso.java.orange.Array.cifratura;

public class Cifratura {
    private char[] arrayCifratura;
    private int[] arrayChiaveCifratura;

    public Cifratura() {
        this.arrayCifratura = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        this.arrayChiaveCifratura = new int[]{1,3,5,4,2,7};
    }

    public char[] cifraLaParola(char[] parolaData){
        char[] parolaCifrata = new char[parolaData.length];
        for(int i=0; i<=parolaData.length; i++){
            if(parolaData.length > arrayCifratura.length){
                i=0;
            parolaCifrata[i] = parolaData[i + arrayCifratura[arrayChiaveCifratura[i]]];
            System.out.println(parolaCifrata);
            }
        }
        return parolaCifrata;
    }

//_____________________________________________________________METODI SET E GET_________________________________________

    public int[] getArrayChiaveCifratura() {
        return arrayChiaveCifratura;
    }

    public void setArrayChiaveCifratura(int[] arrayChiaveCifratura) {
        this.arrayChiaveCifratura = arrayChiaveCifratura;
    }

    public char[] getArrayCifratura() {
        return arrayCifratura;
    }

    public void setArrayCifratura(char[] arrayCifratura) {
        this.arrayCifratura = arrayCifratura;
    }
}
