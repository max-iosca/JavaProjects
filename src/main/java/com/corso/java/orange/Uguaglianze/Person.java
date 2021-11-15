package com.corso.java.orange.Uguaglianze;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String fiscalCode;
    private LocalDate birthDate;
    private String sex;

    public Person() {

    }

    public Person(String name, String surname, String fiscalCode, LocalDate birthDate, String sex) {
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
        this.birthDate = birthDate;
        this.sex = sex;
    }


    /**
     * Il fatto é che java non puó sapere a priori quando (secondo il programmatore) due sue istanze
     * di una classe sono identiche. Per questo motivo va istruito attraverso l'implementazione del metodo
     * 'equals'.
     * Questo metodo fa una serie di controlli che sono disposti in una sequenza specifica al fine
     * di rendere quanto piú performante il processo di verifica.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        // le due istanze puntano allo stesso indirizzo di memoria? (hanno quindi lo stesso indirizzo di riferimento?)
        if (this == o) return true;         // allora le due istanze sono certamente uguali

        // l'istanza 'o' é nulla? Oppure l'istanza di 'o' é é di un tipo differente dalla classe di questo metodo?
        if (o == null || getClass() != o.getClass()) return false;      // allora le due istanze non sono uguali

        // per effetto del controllo precedente sui tipi possiamo eseguire il cast esplicito senza rischi.
        Person person = (Person) o;

        // utilizza il metodo equals 'statico' della classe 'Objects' per confrontare due stringhe
        return Objects.equals(fiscalCode, person.fiscalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fiscalCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
