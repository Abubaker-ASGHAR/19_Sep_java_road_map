package org.example;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        try {
            // Connect to the database
            dbManager.connect();

            // Create the users table
            dbManager.createTable();

            // Insert sample users
            dbManager.insertUser("Alice1", "alice@example.1com");
            dbManager.insertUser("Bob1", "bob@example.1com");
            dbManager.insertUser("Charlie1", "charlie@example.1com");

            // Retrieve and display all users
            dbManager.getAllUsers();

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            // Disconnect from the database
            dbManager.disconnect();
        }
    }
}
