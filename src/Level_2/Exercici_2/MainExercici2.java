package Level_2.Exercici_2;

import java.util.*;

public class MainExercici2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Restaurant> myRestaurants = new HashSet<>();
        System.out.println("Welcome to the ranking restaurant App, let´s rank your 5 favorites restaurants! ");
        while (myRestaurants.size() < 5) {
            System.out.println("Please enter the name of the new restaurant: ");
            String name = sc.nextLine();

            int points = 0;
            boolean flag = true;
            while(flag) {
                System.out.println("Please enter the point of the new restaurant: ");
                try {
                    points = sc.nextInt();
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number: ");
                }
                sc.nextLine();
            }
            Restaurant r = new Restaurant(name, points);
            if (myRestaurants.isEmpty()) {
                myRestaurants.add(r);
            } else {
                if (r.checkData(myRestaurants)) {
                    myRestaurants.add(r);

                } else {
                    System.out.println("You cannot add a restaurant with the same name and the same points ");
                }
            }
            System.out.println("Right now you have in your set: ");
            for (Restaurant values : myRestaurants) {
                System.out.println("[Restaurant Name -> " + values.getName() + "] [Points -> " + values.getPoints() + "]");
            }
            List<Restaurant> myRestaurantsOrdered = new ArrayList<>(myRestaurants);
            Collection.sort(myRestaurantsOrdered);
        }
    }
}
