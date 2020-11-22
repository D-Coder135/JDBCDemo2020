/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 21-11-2020
 *  Time: 10:05 PM
 */
package helper;

import data.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityEntryHelper {
    // Inside this CityEntryHelper class, we will create methods to execute the queries.

    public static final String UPDATE_QUERY = "UPDATE cities SET Name = ? WHERE Name = ? ";
    public static final String NAME_COLUMN = "Name";
    public static final String TRAVERSED = "Traversed";
    private static final String INSERT_QUERY = "Insert into cities (Name, Traversed, Kilometers_required)"
            + "values (?, ? ,?)";
    private static final String READ_QUERY = "SELECT * FROM cities";

    private static final String DELETE_QUERY = "DELETE FROM cities WHERE Name = ?;";

    // 1. to add a city in the database (CREATE)
    public boolean createNewCity(Connection connection, City city) throws SQLException {
        String name = city.getName();
        boolean isTraversed = city.isTraversed();
        int kilometersRequired = city.getKilometersRequired();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
        preparedStatement.setString(1, name);
        preparedStatement.setBoolean(2, isTraversed);
        preparedStatement.setInt(3, kilometersRequired);
        preparedStatement.executeUpdate();
        return false;
    }

    // 2. to read all the cities from the database.(READ)
    public void readAllCities(Connection connection) throws SQLException {
        PreparedStatement readStatement = connection.prepareStatement(READ_QUERY);
        ResultSet results = readStatement.executeQuery();
        while (results.next()) {
            String name = results.getString(NAME_COLUMN);
            boolean isTraversed = results.getBoolean(TRAVERSED);
            int kmsRequired = results.getInt("Kilometers_required");
            City city = new City(name, isTraversed, kmsRequired);
            System.out.println(city);
            System.out.println("------------------------------");
        }
    }

    // 3. to modify the attributes of a city in the database.(UPDATE)
    public void modifyCity(Connection connection, String oldName, String newName) throws SQLException {
        PreparedStatement updateStatement = connection.prepareStatement(UPDATE_QUERY);
        updateStatement.setString(1, newName);
        updateStatement.setString(2, oldName);
        updateStatement.executeUpdate();
    }

    // 4. to delete a city from the database.(DELETE)
    public void deleteCity(Connection connection) {
        PreparedStatement deleteStatement = connection.prepareStatement(DELETE_QUERY);
    }

}
