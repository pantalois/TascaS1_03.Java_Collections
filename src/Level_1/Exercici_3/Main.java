package Level_1.Exercici_3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        FileReader reader = FileManagement.Loadfile("src/Level_1/Exercici_3/countries.txt");
        if (reader == null)
            return;

        BufferedReader buffer = FileManagement.grabBuffer(reader);
        if (buffer == null) {
            return;
        }
        HashMap<String, String> txtToHash = FileManagement.txtToHash(buffer);

        System.out.println("What is you name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Great " + name + " let´s play!!!");



        GameManagement game = new GameManagement();
        game.setCountry(txtToHash);
        game.setResponse();
        game.checkResponse(txtToHash);




    }
}
