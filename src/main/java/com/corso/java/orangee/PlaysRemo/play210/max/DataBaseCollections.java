package com.corso.java.orangee.PlaysRemo.play210.max;

import java.util.HashSet;
import java.util.Set;

public class DataBaseCollections {

    private Set<Contact> dbContacts;
    private Set<Privacy> dbPrivacy;
    //private Set<Utente> dbUtenti;
    private static DataBaseCollections dataBaseInstance;

    public DataBaseCollections() {
        this.dbContacts = new HashSet<>();
        this.dbPrivacy = new HashSet<>();
       // this.dbUtenti = new HashSet<>();
    }

    public static DataBaseCollections createInstance(){
        if(dataBaseInstance == null) {
            dataBaseInstance = new DataBaseCollections();
        }
        return dataBaseInstance;
    }

    public Set<Contact> getDbContacts() {
        return dbContacts;
    }

    public void setDbContacts(Set<Contact> dbContacts) {
        this.dbContacts = dbContacts;
    }

    public Set<Privacy> getDbPrivacy() {
        return dbPrivacy;
    }

    public void setDbPrivacy(Set<Privacy> dbPrivacy) {
        this.dbPrivacy = dbPrivacy;
    }

}
