package Level_2.exercici_2.Service;

import Level_2.exercici_1.model.Restaurant;

import java.util.Comparator;
import java.util.List;

public class OrderRestaurants {

    public OrderRestaurants() {
    }

    public List<Restaurant> orderRestaurants(List<Restaurant> restaurants) {
        restaurants.sort(Comparator.comparingInt(Restaurant::getPoints).reversed());
        System.out.println(restaurants);
        return restaurants;
    }
}
