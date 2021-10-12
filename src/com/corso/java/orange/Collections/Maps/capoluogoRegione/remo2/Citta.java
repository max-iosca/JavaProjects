package com.corso.java.orange.Collections.Maps.capoluogoRegione.remo2;

class Citta {
    private final String cap;

    public Citta(String cap) {
        this.cap = cap;
    }

    public String getCap() {
        return cap;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cap == null) ? 0 : cap.hashCode());
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
        Citta other = (Citta) obj;
        if (cap == null) {
            if (other.cap != null)
                return false;
        } else if (!cap.equals(other.cap))
            return false;
        return true;
    }

}
