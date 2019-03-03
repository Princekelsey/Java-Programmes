import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    private static final String TEMP = "temperature";

    public static void main(String[] args) throws FileNotFoundException {


        Scanner sr = new Scanner(new File("Temperature.txt"));

        while (sr.hasNextLine()) {
            String line = sr.nextLine();
            String[] details = line.split(" ");
            ArrayList<String> countryNameArray = new ArrayList<>();
            ArrayList<Integer> temperatures = new ArrayList<>();

            for (String data : details) {
                try {
                    Integer temp = Integer.parseInt(data);
                    temperatures.add(temp);
                } catch (NumberFormatException exception) {
                    countryNameArray.add(data);
                }
            }
            String countryName = String.join(" ", countryNameArray);
            System.out.println(countryName);
            System.out.println(temperatures);

            Integer coldestTemp = coldestTemperature(temperatures);
            System.out.println("The coldest " +TEMP+  " is: " + coldestTemp);
            Integer warmestTemp = warmestTemperature(temperatures);
            System.out.println("The warmest " +TEMP+  " is: " + warmestTemp);
            Integer averageTemp = averageTemperature(temperatures);
            System.out.println("The average " +TEMP+ " is: " + averageTemp);

            temperatures.remove(coldestTemp);
            temperatures.remove(warmestTemp);

            Integer averageTempWithoutExtremes = averageTempWithoutExtremes(temperatures);
            System.out.println("The average " +TEMP+ " without the coldest and warmest " +TEMP+ " is: " + averageTempWithoutExtremes);
        }


    }

    private static Integer coldestTemperature(ArrayList<Integer> temperatures) {
        Integer coldestTemp = temperatures.get(0);
        for (int i = 1; i < temperatures.size(); i++) {
            if (temperatures.get(i) < coldestTemp) {
                coldestTemp = temperatures.get(i);
            }
        }
        return coldestTemp;
    }

    private static Integer warmestTemperature(ArrayList<Integer> temperatures) {
        Integer warmestTemp = temperatures.get(0);
        for (int i = 1; i < temperatures.size(); i++) {
            if (temperatures.get(i) > warmestTemp) {
                warmestTemp = temperatures.get(i);
            }
        }
        return warmestTemp;
    }

    private static Integer averageTemperature(ArrayList<Integer> temperatures) {
        int avg;
        int sum = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            sum = sum + temperatures.get(i);
        }
        avg = sum / temperatures.size();
        return avg;
    }

    private static Integer averageTempWithoutExtremes(ArrayList<Integer> temperatures) {
        int avgWithoutExt;

        int sumWithoutExt = 0;
        for (int i = 1; i < temperatures.size(); i++) {
            sumWithoutExt = sumWithoutExt + temperatures.get(i);
        }
        avgWithoutExt = sumWithoutExt / temperatures.size();
        return avgWithoutExt;
    }


}
