/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 19-11-2020
 *  Time: 07:46 PM
 */
package main;

import connection.DatabaseConnection;
import data.City;
import helper.CityEntryHelper;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static final int CREATE_CITY = 1;
    public static final int VIEW_ALL_CITIES = 2;
    public static final int MODIFY_CITY = 3;
    public static final int DELETE_CITY = 4;

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
        scanner.nextLine();
        CityEntryHelper helper = new CityEntryHelper();
        switch (choice) {
            case CREATE_CITY:
                /* System.out.println("Please enter the name of the city: ");
                String name = scanner.nextLine().trim();
                System.out.println("Have you been to the city yet? (true/false)");
                boolean isTraversed = scanner.nextBoolean();*/

                String name = JOptionPane.showInputDialog(null,
                        "Please input the name of the city: ", "City Name", JOptionPane.PLAIN_MESSAGE);
                boolean isTraversed = Boolean.parseBoolean(JOptionPane.showInputDialog(null,
                        "Have you been to the city? (true/false): ", "Traversed", JOptionPane.PLAIN_MESSAGE));
                int kmsRequired = (int) ((Math.random() * 2000.0) + 100.0);
                try {
                    helper.createNewCity(DatabaseConnection.getConnection(), new City(name, isTraversed, kmsRequired));
                } catch (SQLException exception) {
                    System.err.println("ERROR IN ADDING THE CITY!");
                }
                break;
            case VIEW_ALL_CITIES:
                try {
                    helper.readAllCities(DatabaseConnection.getConnection());
                } catch (SQLException exception) {
                    JOptionPane.showMessageDialog(null,
                            "The values could not be read from the database!",
                            "Error 1",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;
            case MODIFY_CITY:
                String oldName = JOptionPane.showInputDialog(null,
                        "Please enter the old name of the city", "City Name"
                        , JOptionPane.PLAIN_MESSAGE);
                String newName = JOptionPane.showInputDialog(null,
                        "Please enter the new name of the city", "City New Name"
                        , JOptionPane.PLAIN_MESSAGE);
                try {
                    helper.modifyCity(DatabaseConnection.getConnection(), oldName, newName);
                } catch (SQLException exception) {
                    JOptionPane.showMessageDialog(null,
                            "The city could not be updated!",
                            "Error 2",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;
            case DELETE_CITY:
                name = JOptionPane.showInputDialog(null,
                        "Please enter the name of the city you want to delete from the database",
                        "Delete City", JOptionPane.PLAIN_MESSAGE);
                try {
                    helper.deleteCity(DatabaseConnection.getConnection(), name);
                } catch (SQLException exception) {
                    JOptionPane.showMessageDialog(null,
                            "The city could not be deleted",
                            "Error 3",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
        }
    }
}
