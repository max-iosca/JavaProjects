package com.corso.java.orange.Collections.List.contocorrente.contocorrenteInClasseMassimo;

public class Main {
    public static void main(String[] args) {

        Banca bnl = new Banca();

        Cliente cliente = new Cliente("Massimo","Iosca", "SCIMSM90");

        bnl.aperturaConto(cliente, 50);
        bnl.versamento(cliente, 500);
        bnl.prelievo(cliente, 2000);
        bnl.prelievo(cliente, 2000);
        bnl.stampaEstrattoConto(cliente);
        bnl.chiusuraConto(cliente);
        bnl.versamento(cliente, 1);
        bnl.versamento(bnl.getContoCorrente(cliente), 500);
        ContoCorrente contoMario = bnl.getContoCorrente(cliente);
    }
}
