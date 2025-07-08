package Level_1.Exercici_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> monthList = new ArrayList<Month>();
        HashSet<String> monthSet = new HashSet<>();

        monthList.add(new Month("January"));
        monthList.add(new Month("February"));
        monthList.add(new Month("March"));
        monthList.add(new Month("April"));
        monthList.add(new Month("May"));
        monthList.add(new Month("June"));
        monthList.add(new Month("July"));
        monthList.add(new Month("September"));
        monthList.add(new Month("October"));
        monthList.add(new Month("November"));
        monthList.add(new Month("December"));

        monthList.add(7, new Month("August"));
        System.out.println("Now you are watching the ArrayList in order with the August month inserted where it must be.");
        for (Month month : monthList){
            System.out.println(month.monthName);
            monthSet.add(month.monthName);
        }

        System.out.println("Now you are watching the Hashset elements, type a name that is inside it to check how this collection does not admit repeated values.");
        System.out.println(monthSet);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (monthSet.contains(userInput)){
                monthSet.add(userInput);
                System.out.println("You tried to insert a element that is already in the Hashset the collection did not add it. ");
            }
        else{
            monthSet.add(userInput);
            System.out.println("Great! You inserted a new element in the Hashset. ");

        }
        System.out.println(monthSet);
    }
}