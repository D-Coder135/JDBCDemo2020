/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 21-11-2020
 *  Time: 10:05 PM
 */
package helper;

public class CityEntryHelper {
    // Inside this CityEntryHelper class, we will create methods to execute the queries.

    private static final String INSERT_QUERY = "Insert into cities (Name, Traversed, Kilometers_required)"
            + "values (?, ? ,?)";

    // 1. to add a city in the database (CREATE)
    public boolean createNewCity() {
        return false;
    }

    // 2. to read all the cities from the database.(READ)
    public void readAllCities() {

    }

    // 3. to modify the attributes of a city in the database.(UPDATE)
    public boolean modifyCity() {
        return false;
    }

    // 4. to delete a city from the database.(DELETE)
    public void deleteCity() {

    }

}
