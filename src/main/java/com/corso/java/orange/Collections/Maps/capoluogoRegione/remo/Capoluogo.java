package com.corso.java.orange.Collections.Maps.capoluogoRegione.remo;

class Capoluogo {
    private final String nome;
    private final String cap;

    public Capoluogo(String nome, String cap) {
        this.nome = nome;
        this.cap = cap;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Capoluogo other = (Capoluogo) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    public String getNome() {
        return nome;
    }

    public String getCap() {
        return cap;
    }
}
