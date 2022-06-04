package com.corso.java.orangee.PlaysRemo.play190;

import java.util.Comparator;

public class OrdinaPerCognomeNomeComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        String cli1 = cliente1.getCognome() + cliente1.getNome();
        String cli2 = cliente2.getCognome().concat(cliente2.getNome());
        return cli1.compareTo(cli2);
    }
}
