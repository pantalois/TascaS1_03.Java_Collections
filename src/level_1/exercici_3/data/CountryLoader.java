package level_1.exercici_3.data;

import level_1.exercici_3.util.FileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class CountryLoader {

    private final Map<String, String> countries;

    public CountryLoader(String pathName) {
        FileManagement fileManagement = new FileManagement(pathName);
        FileReader fileReader = fileManagement.loadFile();
        BufferedReader bufferedReader = fileManagement.createBufferedReader(fileReader);

        this.countries = loadCountriesFromBufferIntoaHashMap(bufferedReader);
    }

    private Map<String, String> loadCountriesFromBufferIntoaHashMap(BufferedReader bufferedReader) {
        Map<String, String> map = new HashMap<>();
        try{
            String line;
            int row = 0;
            while ((line = bufferedReader.readLine()) != null){
                String[] parts = line.split(" ");
                if (warningCheckForWrongCountryFormat(parts, row)){
                    map.put(parts[0], parts[1]);
                }
                row = row + 1;
            }
        } catch (IOException e) {
            System.out.println("Error reading countries from file" + e.getMessage());
        }
        return map;
    }

    private boolean warningCheckForWrongCountryFormat(String[] parts, int row) {
        if (parts.length == 2) {
            return true;
        }
        else{
            System.out.println("Error in countries format from buffer in row" + row + ": " + Arrays.toString(parts));
            return false;
        }
    }

    public Map<String, String> getCountries() {
        return countries;
    }
}
