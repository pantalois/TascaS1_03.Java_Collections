package Level_2.exercici_1.app;

import Level_2.exercici_1.model.Restaurant;
import Level_2.exercici_1.service.RestaurantGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public App(){

    }

    public static void run(){

        List<Restaurant> restaurantsGenerated;
        Set<Restaurant> restaurants = new HashSet<>();

        RestaurantGenerator restaurantGenerator = new RestaurantGenerator();
        restaurantsGenerated = restaurantGenerator.generateRestaurants();

        restaurants.addAll(restaurantsGenerated);
        System.out.println(restaurants);

    }
}
