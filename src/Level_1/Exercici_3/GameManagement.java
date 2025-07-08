package Level_1.Exercici_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.*;
import java.util.Map.Entry;


public class GameManagement {
    private String country;
    private String response;
    public GameManagement() {
    }


        public void setCountry(HashMap<String, String> myMap){
            List<String> countryList = new ArrayList<>(myMap.keySet());
            System.out.println(countryList);
            Random random = new Random();
            int randomIdx = random.nextInt(0, countryList.size() - 1);
            this.country = countryList.get(randomIdx);
            System.out.println("What is the capital of " + this.country);
        }

        public void setResponse(){

            Scanner scanner = new Scanner(System.in);
            this.response = scanner.nextLine();

        }

        public void checkResponse(HashMap<String, String> myMap){

            for (Entry<String, String> entry : myMap.entrySet()){
                if (entry.getKey().equalsIgnoreCase(this.country)){
                    if (entry.getValue().equalsIgnoreCase(this.response)){
                        System.out.println("You are right, the capital of " + this.country + " is " + this.response);
                        return;
                    }
                }
            }
            System.out.println("You failed, the capital of " + this.country + " is " + myMap.get(this.country));
        }
   }
