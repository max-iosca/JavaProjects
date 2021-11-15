package com.corso.java.orange.Collections.List.contocorrente.contocorrenteEasy;

import com.corso.java.orange.ColoringConsole.ColoringConsole;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //CREO LA MIA LISTA MOVIMENTI
   private List<Integer> listaMovimenti = new ArrayList<>();

    public static void main(String[] args) {
        //ISTANZA DEL MIO UNICO CLIENTE, IL MAIN?!
        Main cliente = new Main();

        //PROVO AD ISTANZIARE UN NUOVO CONTO CORRENTE CON RELATIVO VERSAMENTO MINIMO INIZIALE...
        ContoCorrente cc = new ContoCorrente(50);

        //CHECK A VIDEO SE FUNZIONA LA GEN.RANDOM DEL NUMERO CONTO
        System.out.println("CONTO CORRENTE NUMERO: " + cc.getNumeroDiConto());

        cliente.prelievo(cc,200);
        cliente.versamento(cc,1500);
        cliente.versamento(cc, 800);
        cliente.prelievo(cc,400);
        cliente.versamento(cc, 500);
        cliente.prelievo(cc,150);
        cliente.estrattoConto();
    }

    public void versamento(ContoCorrente contoCorrente, int valoreVersamento) {
        int nuovoSaldo = contoCorrente.getSaldo();
        nuovoSaldo += valoreVersamento;
        contoCorrente.setSaldo(nuovoSaldo);
        System.out.println("HAI VERSATO: " + valoreVersamento + "||| SALDO ATTUALE: " + contoCorrente.getSaldo()+" Euro");
        listaMovimenti.add(valoreVersamento);
    }

    public void prelievo(ContoCorrente contoCorrente, int valorePrelievo) {
        if (valorePrelievo > 1000) {
            System.out.println("NON PUOI PRELEVARE PIU' DI 1.000 EURO");
            return;
        }
        int verificaSaldo = contoCorrente.getSaldo();
        if (verificaSaldo - valorePrelievo < 0 || contoCorrente.getSaldo() <= 0) {
            System.out.println("RICHIESTA PRELIEVO DI: "+valorePrelievo+" EURO NON DISPONIBILE POICHE' IL SALDO ATTUALE E' : " + verificaSaldo+" Euro");
            return;
        }
        if(verificaSaldo - valorePrelievo > 0) {
            int nuovoSaldo = verificaSaldo - valorePrelievo;
            contoCorrente.setSaldo(nuovoSaldo);
            System.out.println("PRELIEVO DI:"+valorePrelievo+"  EFFETTUATO - SALDO DISPONIBILE: "+contoCorrente.getSaldo());
            listaMovimenti.add(Math.negateExact(valorePrelievo));

        }
    }

    /*public void saldo(ContoCorrente contoCorrente){
        System.out.println("SALDO ATTUALE/DISPONIBILE: "+contoCorrente.getSaldo()+" Euro");
    }
*/

    public void estrattoConto(){
        System.out.println(ColoringConsole.BLUE_BOLD_BRIGHT+"\n=========ESTRATTO CONTO=========");
        System.out.println("================================"+ColoringConsole.RESET);
        int saldo = 0;
        for(Integer evento : listaMovimenti) {
            if (evento > 0){
                saldo += evento;
                System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT+"VERSAMENTO DI: "+evento+" EURO"+ColoringConsole.RESET);
            }
            if(evento < 0){
                saldo = saldo + evento; //W il debug!!!
                System.out.println(ColoringConsole.RED_BOLD_BRIGHT+"PRELIEVO DI: "+evento+" EURO"+ColoringConsole.RESET);
            }

        }
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT+"SALDO: "+saldo+" EURO"+ColoringConsole.RESET);
        System.out.println(ColoringConsole.BLUE_BOLD_BRIGHT+"================================"+ColoringConsole.RESET);
    }
}