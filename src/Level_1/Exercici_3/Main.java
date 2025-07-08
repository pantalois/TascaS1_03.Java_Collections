package Level_1.Exercici_3;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {



        FileReader reader = FileManagement.Loadfile("src/Level_1/Exercici_3/countries.txt");
        if (reader == null)
            return;

        BufferedReader buffer =  FileManagement.grabBuffer(reader);
        if (buffer == null){
            return;
        }


        }

    }
}