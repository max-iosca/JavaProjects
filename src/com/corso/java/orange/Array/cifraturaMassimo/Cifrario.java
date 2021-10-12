package com.corso.java.orange.Array.cifraturaMassimo;

public class Cifrario {

    private char[] chiaveDiCriptazione;

    public Cifrario(String chiave){
        this.chiaveDiCriptazione = chiave.toCharArray(); //converts this string into character array
    }

    public char[] getChiaveDiCriptazione() {
        return chiaveDiCriptazione;
    }

    public String cripta(String fraseDaCriptare){
        char[] arrayCriptato = new char[fraseDaCriptare.length()]; //lunghezza array uguale a quello in ingresso
        int i = 0,k = 0; //inizializzo due indici = 0
        char[] fraseTrasformataDaStringInChar = fraseDaCriptare.toCharArray(); //array frase inizializzato con conversione in char dell'array in ingresso
        while(i<fraseTrasformataDaStringInChar.length){
            if(k== chiaveDiCriptazione.length)
                k = 0;
            int shiftVal = Character.getNumericValue(chiaveDiCriptazione[k++]);
            if (fraseTrasformataDaStringInChar[i] == ' ')
                arrayCriptato[i] = ' ';
            else
                arrayCriptato[i] = (char)((int)fraseTrasformataDaStringInChar[i] + shiftVal);
            i++;
        }
        return String.copyValueOf(arrayCriptato);
    }


    public String decripta(String fraseDaDecriptare) {
        char[] arrayDecriptato = new char[fraseDaDecriptare.length()];
        int i = 0;
        int k = 0;
        char[] frase = fraseDaDecriptare.toCharArray();
        while (i < frase.length) {
            if (k == chiaveDiCriptazione.length)
                k = 0;
            int shiftVal = Character.getNumericValue(chiaveDiCriptazione[k]);
            if (frase[i] == ' ')
                arrayDecriptato[i] = ' ';
            else
                arrayDecriptato[i] = (char) ((int) frase[i] - shiftVal);
            i++;
        }
        return String.copyValueOf(arrayDecriptato);
    }

}
