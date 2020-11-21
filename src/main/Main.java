/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 19-11-2020
 *  Time: 07:46 PM
 */
package main;

import connection.DatabaseConnection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.connectToDatabase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the city you want to add: ");
        String name = scanner.nextLine().trim();
        System.out.println("Please tell me if you have been to the city? (true/false): ");
    }
}
