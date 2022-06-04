package com.corso.java.orangee.PlaysRemo.play210.max.dtos;

public class FormNewsLetterMarketingDTO {

    private String email;
    private String nrTelefono;
    private Boolean consNewsLet = false;
    private Boolean consPrivacy = false;

    public FormNewsLetterMarketingDTO(String email, String nrTelefono,Boolean consNewsLet, Boolean consPrivacy) {
        this.email = email;
        this.consNewsLet = consNewsLet;
        this.consPrivacy = consPrivacy;
        this.nrTelefono = nrTelefono;
    }

    public String getNrTelefono() {
        return nrTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getConsNewsLet() {
        return consNewsLet;
    }

    public void setConsNewsLet(Boolean consNewsLet) {
        this.consNewsLet = consNewsLet;
    }

    public Boolean getConsPrivacy() {
        return consPrivacy;
    }

    public void setConsPrivacy(Boolean consPrivacy) {
        this.consPrivacy = consPrivacy;
    }
}
