package com.corso.java.orange.Collections.Maps.veVendemoTutto;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println(" VE VENNEMO TUTTO + 1 S.P.A. ");
        System.out.println("===============================");

        Map<Cliente, Prodotto> qntProdottiVendutiAlCliente = new HashMap<>();

        Map<Prodotto, Integer> qntProdottiVenduti = new HashMap<>();

        Set<Vendita> archivioVendita = new HashSet<>();

        Prodotto prd01 = new Prodotto("scrivania",5);
        Prodotto prd02 = new Prodotto("bicchieri",10);
        Prodotto prd03 = new Prodotto("cuscinetti ruota", 50);
        Prodotto prd04 = new Prodotto("valvole egr", 20);

        Cliente cliente01 = new Cliente("Tizio", "NLSTZI85");
        Cliente cliente02 = new Cliente("Caio", "NLSCIO80");
        Cliente cliente03 = new Cliente("Pippo", "NLSPPP00");

        archivioVendita.add(new Vendita(prd01, cliente01, 3));
        archivioVendita.add(new Vendita(prd02, cliente01,5));
        archivioVendita.add(new Vendita(prd03, cliente02, 20));
        archivioVendita.add(new Vendita(prd04, cliente02, 20));
        archivioVendita.add(new Vendita(prd02, cliente03, 5));
        archivioVendita.add(new Vendita(prd03, cliente03, 30));

        qntProdottiVenduti.put(prd01, prd01.getQuantita());
        qntProdottiVenduti.put(prd02, prd02.getQuantita());
        qntProdottiVenduti.put(prd03, prd03.getQuantita());
        qntProdottiVenduti.put(prd04, prd04.getQuantita());

        qntProdottiVendutiAlCliente.put(cliente01,prd01);
        qntProdottiVendutiAlCliente.put(cliente01,prd03);
        qntProdottiVendutiAlCliente.put(cliente02,prd03);
        qntProdottiVendutiAlCliente.put(cliente02,prd04);

        stampaArchivioVendita(archivioVendita);
        stampaQntProdottiVendutiAlCliente(qntProdottiVendutiAlCliente);
        stampaQntProdottiVenduti(qntProdottiVenduti);

    }

    public static void stampaArchivioVendita (Set<Vendita> archivioVendita) {
        System.out.println("ARCHIVIO VENDITA GENERALE");
        for(Vendita vendita : archivioVendita){
            System.out.println("\nCLIENTE: " + vendita.getCliente().getNome() +" PRODOTTO: " + vendita.getProdotto().getNome() + " QUANTITA': "+vendita.getProdotto().getQuantita());
        }
    }

    public static void stampaQntProdottiVendutiAlCliente(Map<Cliente, Prodotto> qntProdottiVendutiAlCliente){
        for(Map.Entry<Cliente, Prodotto> item : qntProdottiVendutiAlCliente.entrySet()){
        System.out.println("\nPRODOTTI: " + item.getValue().getNome() + " QUANTITA': " +item.getValue().getQuantita() + " AL CLIENTE: " + item.getKey().getNome());
        }
    }

    public static void stampaQntProdottiVenduti(Map<Prodotto, Integer> qntProdottiVenduti) {
        for(Map.Entry<Prodotto, Integer> item : qntProdottiVenduti.entrySet()) {
            System.out.println("\n QUANTITA': " +item.getValue() + " PER IL PRODOTTO: "+ item.getKey().getNome());
        }
    }
}
