import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataFileReader {

    public ArrayList<Data> readData(String fileName) {
        ArrayList<Data> allData = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line = reader.readLine()) != null){
                String[] lineData = line.split(" ");

                ArrayList<Integer> tempInt = new ArrayList<Integer>();
                ArrayList<Double> tempDouble = new ArrayList<Double>();

                for(int i = 0; i < 4; i++){

                    tempInt.add(Integer.parseInt(lineData[i]));
                }
                for(int i = 4; i < 6; i++){

                    tempDouble.add(Double.parseDouble(lineData[i]));
                }

                allData.add(new Data(tempInt, tempDouble));
            }
        }   catch(FileNotFoundException fnfException){
            System.out.println("File not found");
        }   catch(IOException IOexception){
            System.out.println("Error reading file");
        }
        return allData;
    }
}

