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
            dbManager.insertUser("Alice", "alice@example.com");
            dbManager.insertUser("Bob", "bob@example.com");
            dbManager.insertUser("Charlie", "charlie@example.com");

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
