/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 19-11-2020
 *  Time: 07:22 PM
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // What we need inside this DatabaseConnection class -->

    // 1. URL of the database.
    // localhost (on our computer)
    // IP --> 127.0.0.1 or domain name --> localhost
    private static final String URL = "jdbc:mysql://localhost:3306/google_pay_game";

    // 2. Username of the admin of the database.
    private static final String USERNAME = "root";

    // 3. Password of the admin of the database.
    private static final String PASSWORD = "";

    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public void connectToDatabase() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException exception) {
            System.err.println("Could not connect to the database." +
                    "Please check your URL, Username and Password!");
            exception.printStackTrace();
        }
        finally {
            printConnectionStatus();
        }
    }

    private void printConnectionStatus() {
        System.out.println(connection == null ? "The connection to the database is inactive..." :
                "The connection to the database is active...");
    }

}
