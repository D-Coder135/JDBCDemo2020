/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 19-11-2020
 *  Time: 06:59 PM
 */
package data;

public class City {
    private String name;
    private boolean isTraversed;
    private int kilometersRequired;

    public City(String name, boolean isTraversed, int kilometersRequired) {
        this.name = name;
        this.isTraversed = isTraversed;
        this.kilometersRequired = kilometersRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTraversed() {
        return isTraversed;
    }

    public void setTraversed(boolean traversed) {
        isTraversed = traversed;
    }

    public int getKilometersRequired() {
        return kilometersRequired;
    }

    public void setKilometersRequired(int kilometersRequired) {
        this.kilometersRequired = kilometersRequired;
    }
}
