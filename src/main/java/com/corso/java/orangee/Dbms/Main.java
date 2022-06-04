package com.corso.java.orangee.Dbms;

public class Main {

    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
}
