package com.corso.java.orangee.PlaysRemo.play045;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cf;

    public Cliente(String nome, String cf) {
        this.nome = nome;
        this.cf = cf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cf, cliente.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
}
