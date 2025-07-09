package Level_2.Exercici_2;

import java.util.*;


public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int points;

    public Restaurant() {
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setName(){
        Scanner scName = new Scanner(System.in);
        System.out.println("Please enter the name of the new restaurant: ");
        this.name = scName.nextLine();
    }

    public void setPoints() {
        Scanner scPoints = new Scanner(System.in);
        boolean validInput = false;

        System.out.println("Please enter a score between 1 and 10 for the '" + this.name + "' restaurant");

        while (!validInput) {
            if (!scPoints.hasNextInt()) {
                System.out.println("This value is not accepted as a valid score, it has to be between 1 and 10, please, try again");
                scPoints.next();
                continue;
            }
            this.points = scPoints.nextInt();
            if (!(this.points <= 10 && this.points >= 1)){
                System.out.println("This value is not accepted as a valid score, it has to be between 1 and 10, please, try again");
                continue;
            }
            validInput = true;
            System.out.println("The score you choosed for '" + this.name + "' restaurant is " + this.points);
            }
    }

    public boolean checkData(HashSet<Restaurant> myRestaurants) {
        for (Restaurant r : myRestaurants) {
            if (r.getName().equals(this.name) && r.getPoints() == this.points) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int compareTo(Restaurant restaurantPoints) {
         return Integer.compare(restaurantPoints.points, this.points);
    }
}





