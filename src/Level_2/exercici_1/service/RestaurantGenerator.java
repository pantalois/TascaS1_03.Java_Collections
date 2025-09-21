package Level_2.exercici_1.service;

import Level_2.exercici_1.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantGenerator {
    private static List<Restaurant> restaurants;

    public RestaurantGenerator() {
        this.restaurants = new ArrayList<>();
    }

    public List<Restaurant> generateRestaurants() {

        Restaurant restaurant1 = new Restaurant("Restaurant1", 1);
        Restaurant restaurant2 = new Restaurant("Restaurant1", 1);
        Restaurant restaurant3 = new Restaurant("Restaurant1", 2);

        this.restaurants.add(restaurant1);
        this.restaurants.add(restaurant2);
        this.restaurants.add(restaurant3);
        return restaurants;
    }
}
