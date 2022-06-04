package com.corso.java.orangee.Ricorsione.basic;


/**
 * Il concetto di ricorsione é una tecnica di programmazione molto potente,
 * che sfrutta l'idea di suddividere un problema da risolvere in sotto-problemi
 * simili a quello originale, ma più semplici.<br>
 *
 * La ricorsione ha la caratteristica principale di essere tipicamente un metodo (o una funzione)
 * che, ad un certo punto, chiama se stessa.<br>
 *
 * Gli ingredienti base per scrivere una ricorsione sono i seguenti:
 * <ol>
 *      <li>Il metodo che, ad un certo punto, chiama se stesso.</li>
 *      <li>Una precondizione (o condizione iniziale, o detta anche condizione di uscita) che deve <br>
 *      sempre verificare quando concludere la ricorsione.</li>
 * </ol>
 * Ecco un esempio che esegue questa formula sommatoria ricorsiva: X+(x-1) per 10 volte.
 */
public class Main {

    public static void main(String[] args) {
        int result = sub(10, 10);
        System.out.println(" =>> " + result);
    }

    public static int sub(int k, int start) {
        if (k > 0) {    // condizione di uscita
            String conj = (start==k? "": ", ");
            System.out.printf(conj + " 10-%d = %d", (k-1), 10-(k-1));
            return k + sub(k - 1, start);      // ricorsione
        } else {
            return 0;
        }
    }
}
