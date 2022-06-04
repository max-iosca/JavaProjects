package com.corso.java.orangee.InterfacceComparableComparator.esempioInterfaccia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Le due classi Fattura e Fattorino sono completamente diverse tra di loro.
 * Ma hanno un metodo in comune (esegui()) che puó essere utilizzato per fare in modo che
 * io possa usarle in modo generico tramite l'interfaccia.
 * Questo mi consente di scrivere codice generico che non cambierá mai.
 * Se dovesse cambiare perché, ad esempio, ho modificato il metodo esegui() dell'interfaccia
 * otterrei sicuramente un errore a compile-time. E questo mi va bene perché non ho sorprese in esecuzione:
 * devo cioé prima risolvere gli errori di compilazione, evidentemente, modificando anche tutti i metodi esegui
 * delle varie classi che implementano quella interfaccia in modo opportuno.
 *
 * Se un giorno dovessi aggiungere una nuova classe che deve eseguire anche lei il metodo esegui() mi basterebbe crearla e
 * dichiararla in modo tale che implementi l'interfaccia comune.
 */
public class Main {

    public static void main(String[] args) {
        Fattura fattura = new Fattura(Arrays.asList(5, 6, 9, 10));
        Fattorino fattorino = new Fattorino();

        // posso fare cosi...
        IEsegue fatturaAlternativa = new Fattura(Arrays.asList(3, 6, 2));
        IEsegue fattorinoAlternativo = new Fattorino();
        lanciaEsegui(fatturaAlternativa);
        lanciaEsegui(fattorinoAlternativo);

        // posso fare cosi...
        lanciaEsegui(fattura);
        lanciaEsegui(fattorino);

        //...oppure cosi...
        List<IEsegue> esecuzioni = new ArrayList<>();
        esecuzioni.add(fattura);
        esecuzioni.add(fattorino);
        for(IEsegue istanza: esecuzioni) {
            istanza.esegui();
        }
    }

    private static void lanciaEsegui(IEsegue istanza) {
        istanza.esegui();
    }
}
