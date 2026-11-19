import java.util.ArrayList;
import java.util.Random;

public class Data {
    private ArrayList<Integer> intData;
    private ArrayList<Double> doubleData;

    public Data() {
        intData = new ArrayList<Integer>();
        doubleData = new ArrayList<Double>();

        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            intData.add(rand.nextInt(100));
        }

        for (int i = 0; i < 2; i++) {
            doubleData.add(rand.nextInt(10000)/100.00);
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Integer i : intData){
            str.append(i);
            str.append(" ");

        }
        for(Double d : doubleData){
            str.append(d);
            str.append(" ");
        }

        return str.toString();
    }
}
