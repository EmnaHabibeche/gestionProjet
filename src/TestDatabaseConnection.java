import dao.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        try {
            // Attempt to establish a database connection
            Connection connection = DatabaseConnection.getConnection();

            // If connection is successful, print a success message
            System.out.println("Database connection successful!");

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            // If connection fails, print an error message
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}