/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 21-11-2020
 *  Time: 10:05 PM
 */
package helper;

import data.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityEntryHelper {
    // Inside this CityEntryHelper class, we will create methods to execute the queries.

    private static final String INSERT_QUERY = "Insert into cities (Name, Traversed, Kilometers_required)"
            + "values (?, ? ,?)";

    private static final String READ_QUERY = "SELECT * FROM cities";

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

    }

    // 3. to modify the attributes of a city in the database.(UPDATE)
    public boolean modifyCity() {
        return false;
    }

    // 4. to delete a city from the database.(DELETE)
    public void deleteCity() {

    }

}
