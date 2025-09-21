package level_1.exercici_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        List<Integer> myOtherList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            myList.add(i);
        }
        System.out.println("Five numbers have been added to myList ");
        System.out.println("myList -> " + myList);

        ListIterator<Integer> iterator = myList.listIterator(myList.size());
        while (iterator.hasPrevious()) {
            int it = iterator.previous();
            myOtherList.add(it);
        }

        System.out.println("The elements of myList have been added to myOtherList in reverse order ");
        System.out.println("myOtherList -> " + myOtherList);

        }
}
