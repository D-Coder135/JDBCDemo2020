/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 19-11-2020
 *  Time: 06:59 PM
 */
package data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isTraversed() == city.isTraversed() &&
                getKilometersRequired() == city.getKilometersRequired() &&
                Objects.equals(getName(), city.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isTraversed(), getKilometersRequired());
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", isTraversed=" + isTraversed +
                ", kilometersRequired=" + kilometersRequired +
                '}';
    }
}
