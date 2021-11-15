package com.corso.java.orange.Eccezioni.esercizioInClasse;

public class Main {
    public static void main(String[] args) {
        //divisione2(7, 0);

        float risultato = divisione3(20,1);
        if(risultato != -1)
            System.out.println(risultato);

        try {

            System.out.println(divisione(15, 5));
            System.out.println(divisione(20, 10));
            //  System.out.println(divisione(10, 0));


        } catch (DivisoreUgualeZeroException eccezione) {
            // System.out.println("Errore, divisore uguale a zero!!!");
            // System.out.println(eccezione.getMessage());
        }

    }

    private static float divisione(float dividendo, float divisore) throws DivisoreUgualeZeroException {
        if (divisore == 0) {
            throw new DivisoreUgualeZeroException("ERRORE DIVISORE = 0 E DIVIDENDO = " + dividendo);
        }
        return dividendo / divisore;
    }

    private static float divisione2(float dividendo, float divisore) {
        if (divisore == 0) {
            try {
                throw new DivisoreUgualeZeroException("ERRORE DIVISORE = 0 E DIVIDENDO = " + dividendo);
            } catch (DivisoreUgualeZeroException e) {
                System.out.println(e.getMessage());
            }
        } else {
            return dividendo / divisore;
        }
        return 0;
    }

    private static float divisione3(float dividendo, float divisore) {
        if (divisore == 0) {
            System.out.println("ERRORE");
            return -1;
        } else
            return dividendo / divisore;
    }

}
