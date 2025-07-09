package Level_2.Exercici_2;

import java.util.*;

public class MainExercici2 {
    public static void main(String[] args) {

        HashSet<Restaurant> myRestaurants = new HashSet<>();
        List<Restaurant> myRestaurantsOrdered = new ArrayList<>();

        System.out.println("Welcome to the ranking restaurant App, let´s rank your 5 favorites restaurants! ");
        while (myRestaurants.size() < 5) {
            Restaurant r = new Restaurant();
            r.setName();
            r.setPoints();

            if (myRestaurants.isEmpty()) {
                myRestaurants.add(r);
            }
            else {
                if (r.checkData(myRestaurants)) {
                    myRestaurants.add(r);
                    myRestaurantsOrdered.add(r);

                } else {
                    System.out.println("You cannot add a restaurant with the same name and the same points ");
                    System.out.println("The restaurant '" + r.getName() + "' was not added");
                }
            }
            System.out.println("Right now you have in your set: ");
            for (Restaurant values : myRestaurants) {
                System.out.println("[Restaurant Name -> " + values.getName() + "] [Points -> " + values.getPoints() + "]");
            }
        }
        Collections.sort(myRestaurantsOrdered);
        System.out.println("This are the restaurants ordered in descending order");
        for (Restaurant values : myRestaurantsOrdered){
            System.out.println("[Restaurant Name -> " + values.getName() + "] [Points -> " + values.getPoints() + "]");
        }
    }
}
