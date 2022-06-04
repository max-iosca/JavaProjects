package com.corso.java.orangee.PlaysRemo.play045;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Vendita> vendite = new HashSet<>();
        List<Cliente> clienti = new ArrayList<>();
        List<Prodotto> prodotti = new ArrayList<>();

        clienti.add(new Cliente("Einstein", "NSTBRT"));
        clienti.add(new Cliente("Bohr", "BHRNLS"));
        clienti.add(new Cliente("Da Vinci", "DVNLNR"));
        clienti.add(new Cliente("Heisemberg", "HSBCLR"));

        prodotti.add(new Prodotto("0010", "Matita"));
        prodotti.add(new Prodotto("0020", "Goniometro"));
        prodotti.add(new Prodotto("0030", "Carta"));
        prodotti.add(new Prodotto("0040", "Penna"));
        prodotti.add(new Prodotto("0050", "Temperino"));

        vendite.add(new Vendita(clienti.get(0), prodotti.get(1), 4));
        vendite.add(new Vendita(clienti.get(3), prodotti.get(1), 1));
        vendite.add(new Vendita(clienti.get(1), prodotti.get(0), 3));
        vendite.add(new Vendita(clienti.get(1), prodotti.get(4), 2));
        vendite.add(new Vendita(clienti.get(2), prodotti.get(2), 10));
        vendite.add(new Vendita(clienti.get(3), prodotti.get(2), 9));
        vendite.add(new Vendita(clienti.get(3), prodotti.get(1), 7));
        vendite.add(new Vendita(clienti.get(0), prodotti.get(3), 5));
        vendite.add(new Vendita(clienti.get(0), prodotti.get(2), 1));
        vendite.add(new Vendita(clienti.get(1), prodotti.get(1), 8));

        System.out.println("\n--- Ve Vennemo Tutto" + ColoringConsole.GREEN + (char)174+ ColoringConsole.RESET + " S.p.A. ---\n");

        System.out.println("\n--- Stampa dettaglio del venduto ---");
        stampaVendite(vendite);

        System.out.println("\n--- Stampa report 2 (Per Cliente) ---");
        stampaReport1(generaReport1(vendite));

        System.out.println("\n--- Stampa report 1 (Per Prodotto) ---");
        stampaReport2(generaReport2(vendite));
    }

    /**
     * Stampa semplicemente le vendite caricate sulla collection 'vendite' di tipo Set
     *
     * @param vendite
     */
    private static void stampaVendite(Set<Vendita> vendite) {
        for(Vendita vendita: vendite) {
            System.out.println("Il cliente " + vendita.getCliente().getNome()
                    + " ha acquistato nr " + vendita.getQta() +" di " + vendita.getProdotto().getNome());
        }
    }

    /**
     * Genera il primo report caricando i dati su una mappa con K=Cliente, V=qtá
     * e la ritorna al chiamante.
     *
     * @param vendite
     * @return
     */
    private static Map<Cliente, Integer> generaReport1(Set<Vendita> vendite) {
        Map<Cliente, Integer> report = new HashMap<>();

        for(Vendita vendita: vendite) {
            Integer qtaVendita = report.get(vendita.getCliente());
            if (qtaVendita==null)
                qtaVendita =0;
            report.put(vendita.getCliente(), vendita.getQta() + qtaVendita);
        }
        return report;
    }

    /**
     * Genera il primo report caricando i dati su una mappa con K=Prodotto, V=qtá
     * e la ritorna al chiamante.
     *
     * @param vendite
     * @return
     */
    private static Map<Prodotto, Integer> generaReport2(Set<Vendita> vendite) {
        Map<Prodotto, Integer> report = new HashMap<>();

        for(Vendita vendita: vendite) {
            Integer qtaVendita = report.get(vendita.getProdotto());
            if (qtaVendita==null)
                qtaVendita = 0;
            report.put(vendita.getProdotto(), vendita.getQta() + qtaVendita);
        }
        return report;
    }


    /**
     * Stampa il report1 facendo uno slice Verticale della mappa.
     *
     * @param vendutoPerCliente
     */
    private static void stampaReport1(Map<Cliente, Integer> vendutoPerCliente) {
        for(Cliente cliente: vendutoPerCliente.keySet()) {
            System.out.println("Il cliente " + cliente.getNome() + " ha acquistato nr " + vendutoPerCliente.get(cliente) + " prodotti");
        }
    }

    /**
     * Stampa il report1 facendo uno slice Orizzontale della mappa.
     *
     * @param vendutoPerProdotto
     */
    private static void stampaReport2(Map<Prodotto, Integer> vendutoPerProdotto) {
        for(Map.Entry<Prodotto, Integer> riga: vendutoPerProdotto.entrySet()) {
            System.out.println("Il prodotto " + riga.getKey().getNome() + " é stato vennuto " + riga.getValue() + " volte");
        }
    }


}
