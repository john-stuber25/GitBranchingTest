import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataFileWriter {

    public DataFileWriter(String fileName, ArrayList<Data> allData) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){

            for(Data data : allData){
                writer.write(data.toString());
                writer.newLine();
            }

            System.out.println("Successfully wrote to the file.");
        }   catch (IOException e) {
            e.printStackTrace();
        }

    }
}
