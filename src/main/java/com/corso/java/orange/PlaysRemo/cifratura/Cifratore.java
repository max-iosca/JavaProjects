package com.corso.java.orange.PlaysRemo.cifratura;

public class Cifratore {

    private char[] chiave;

    public Cifratore(String chiave) {
        this.chiave = chiave.toCharArray();
    }

    public String encrypt(String fraseIn) {
        char[] result = new char[fraseIn.length()];
        int i=0; int k = 0;
        char[] frase = fraseIn.toCharArray();
        while(i<frase.length) {
            if (k==chiave.length)
                k = 0;
            int shiftVal = Character.getNumericValue(chiave[k++]);
            if (frase[i]==' ')
                result[i] = ' ';
            else
                result[i] = (char)((int)frase[i] + shiftVal);
            i++;
        }
        return String.copyValueOf(result);
    }


    public String decrypt(String fraseIn) {
        char[] result = new char[fraseIn.length()];
        int i=0; int k = 0;
        char[] frase = fraseIn.toCharArray();
        while(i<frase.length) {
            if (k==chiave.length)
                k = 0;
            int shiftVal = Character.getNumericValue(chiave[k++]);
            if (frase[i]==' ')
                result[i] = ' ';
            else
                result[i] = (char)((int)frase[i] - shiftVal);
            i++;
        }
        return String.copyValueOf(result);
    }
}
