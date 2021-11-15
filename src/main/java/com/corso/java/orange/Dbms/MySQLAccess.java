package com.corso.java.orange.Dbms;

import java.sql.*;

public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("org.mariadb.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mariadb://localhost:3309/warehouse", "root", "test");
            connect.setAutoCommit(false);

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from products");
            writeResultSet(resultSet);

            String codice = "202012";
            preparedStatement = connect.prepareStatement("insert into products values (default, "+codice +", ?, ?)");
            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect.prepareStatement("insert into products values (default, ?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, "202012");
            preparedStatement.setString(2, "2003444");
            preparedStatement.setString(3, "Caramelle");
            preparedStatement.executeUpdate();
            connect.commit();

            preparedStatement = connect.prepareStatement("SELECT id, barCode, code, description from products");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);

            // Remove again the insert comment
            preparedStatement = connect.prepareStatement("delete from products where code = ? ; ");
            preparedStatement.setString(1, "aaaaa");
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("select * from products");
            writeMetaData(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query
        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String barcode = resultSet.getString("barCode");
            String code = resultSet.getString("code");
            String description = resultSet.getString("description");
            System.out.println("Id: " + id);
            System.out.println("barcode: " + barcode);
            System.out.println("codice: " + code);
            System.out.println("Descrizione: " + description);
        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
