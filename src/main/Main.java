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
        System.out.println("------MENU------");
        System.out.println("1. Press 1 to add a new city: ");
        System.out.println("2. Press 2 to view all the cities: ");
        System.out.println("3. Press 3 to modify a city: ");
        System.out.println("4. Press 4 to delete a city: ");
        System.out.println("Please Enter Your Choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2 :
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }
    }
}
