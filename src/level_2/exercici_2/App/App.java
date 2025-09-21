package level_2.exercici_2.App;

import level_2.exercici_1.model.Restaurant;
import level_2.exercici_2.Service.OrderRestaurants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {

    public App() {

    }

    public static void run() {
        HashSet<Restaurant> myRestaurants = new HashSet<>();
        List<Restaurant> myRestaurantsOrdered = new ArrayList<>();


        myRestaurants.add(new Restaurant("Restaurant1", 1));
        myRestaurants.add(new Restaurant("Restaurant1", 2));
        myRestaurants.add(new Restaurant("Restaurant1", 3));
        myRestaurants.add(new Restaurant("Restaurant1", 4));

        for (Restaurant restaurant : myRestaurants) {
            myRestaurantsOrdered.add(restaurant);
        }
        OrderRestaurants restaurantsOrdered = new OrderRestaurants();

        restaurantsOrdered.orderRestaurants(myRestaurantsOrdered);

    }

}
