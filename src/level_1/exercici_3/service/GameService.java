package level_1.exercici_3.service;

import level_1.exercici_3.data.CountryLoader;
import level_1.exercici_3.model.Player;

import java.util.*;

public class GameService {
    private Map<String, String> loadedCountries;
    private Set<String> loadedCountriesSet;
    private String selectedCountry;

    public GameService() {
        this.loadedCountries = new CountryLoader("src/level_1/exercici_3/countries.txt").getCountries();
        this.loadedCountriesSet = new HashSet<>();

    }

    public Map<String, String> getLoadedCountries() {
        return this.loadedCountries;
    }

    public String getRandomCountry() {
            Random rand = new Random();
            List<String> listOfTheCountries = new ArrayList<>(loadedCountries.keySet());
            int randomIndex = rand.nextInt(listOfTheCountries.size() - 1);
            String country;
            this.selectedCountry = listOfTheCountries.get(randomIndex);
            System.out.println(this.selectedCountry);

            while (!this.loadedCountriesSet.add(this.selectedCountry)){
                System.out.println("Country already in use");
                randomIndex = rand.nextInt(listOfTheCountries.size() - 1);
                this.selectedCountry = listOfTheCountries.get(randomIndex);
            }
            return this.selectedCountry;

    }


    public boolean askUserForAnswer(String country) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the capital of this country? " + country + "\n");
        String capital = sc.nextLine();
        String correctCapital = this.loadedCountries.get(this.selectedCountry);
        if (correctCapital.equalsIgnoreCase(capital)) {
            System.out.println("That is true, you won 1 point ");
            return true;
        }
        System.out.println("That is not true, the capital is of " + country + " is " + this.loadedCountries.get(country));
        return false;
    }
}
