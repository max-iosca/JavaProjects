package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.RemoWildcard_1.src;

/**
 * FiltroSoggetti accetta come tipo parametrico qualunque tipo estenda Persona o un tipo Persona stessa.
 *
 * @param <T>
 */
public class FiltroSoggetti<T extends Persona> {

    public T accetta(T soggetto) {
        if (soggetto.getCognome().startsWith("C"))
            return soggetto;
        return null;
    }

}