package Level_1.Exercici_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class FileManagement {


    public FileManagement() {
    }

    public static FileReader Loadfile(String file) {
        try {
            return new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static BufferedReader grabBuffer(FileReader reader) {
        try {
            return new BufferedReader(reader);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static HashMap<String, String> txtToHash(BufferedReader buffer){

        HashMap<String, String> myMap = new HashMap<String, String>();
        try{
            String line;
            while ((line = buffer.readLine()) != null){
                String[] lineSeparated = line.split(" ");
                myMap.put(lineSeparated[0], lineSeparated[1]);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return myMap;
    }
}

