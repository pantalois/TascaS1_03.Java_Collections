package Level_2.Exercici_2;

import java.util.HashSet;


public class Restaurant {
    private String name;
    private int points;

    public Restaurant(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }


    public boolean checkData(HashSet<Restaurant> myRestaurants) {
        for (Restaurant r : myRestaurants) {
            if (r.getName().equals(this.name) && r.getPoints() == this.points) {
                return false;
            }
        }
        return true;
    }
}

