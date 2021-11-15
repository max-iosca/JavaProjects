package com.corso.java.orange.Eccezioni.magazzinoInDad;


public class Prodotto {

    private String code;
    private String description;
    private String barCode;
    private String extended_description;

    public Prodotto(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getExtended_description() {
        return extended_description;
    }

    public void setExtended_description(String extended_description) {
        this.extended_description = extended_description;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the barCode
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * @param barCode the barCode to set
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prodotto that = (Prodotto) o;
        if (that.code == null) return false;

        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
