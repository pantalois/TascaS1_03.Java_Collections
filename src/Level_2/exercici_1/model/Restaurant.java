package Level_2.exercici_1.model;


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

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant restaurant = (Restaurant) obj;
        return points == restaurant.points && name.equals(restaurant.name);
    }

    @Override
    public String toString(){
        return "Restaurant [name=" + name + ", points=" + points + "]";
    }
}

