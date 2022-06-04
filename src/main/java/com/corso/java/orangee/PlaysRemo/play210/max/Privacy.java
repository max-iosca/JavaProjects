package com.corso.java.orangee.PlaysRemo.play210.max;

import java.time.LocalDateTime;

public class Privacy {

    private Long id; //sul progetto era una String...cambiato in Integer
    private Boolean consensoGenerico = false;
    private LocalDateTime dtValiditaConsensoGenerico;
    private Boolean consensoMarketing = false;
    private LocalDateTime dtValiditaConsensoMarketing;
    private Boolean consensoNewsLetter = false;
    private LocalDateTime dtValiditaConsensoNewsLetter;

    private static long counter = 1;

    public Privacy (){}

    public Privacy(Boolean consensoGenerico, Boolean consensoMarketing, Boolean consensoNewsLetter) {
        this.id = counter++;
        //this.id = String.valueOf(Long.parseLong(id));
        this.consensoGenerico = consensoGenerico;
        this.consensoMarketing = consensoMarketing;
        this.consensoNewsLetter = consensoNewsLetter;
    }

    public Long getId() {
        return id;
    }

    public Boolean getConsensoGenerico() {
        return consensoGenerico;
    }

    public Boolean getConsensoMarketing() {
        return consensoMarketing;
    }

    public Boolean getConsensoNewsLetter() {
        return consensoNewsLetter;
    }

    public void setConsensoMarketing(Boolean consensoMarketing) {
        this.consensoMarketing = consensoMarketing;
    }

    public void setConsensoNewsLetter(Boolean consensoNewsLetter) {
        this.consensoNewsLetter = consensoNewsLetter;
    }
}
