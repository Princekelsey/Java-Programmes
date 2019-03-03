package com.prince;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name to load  data:");

        String file = scan.nextLine();
        File newFile = new File(file);

        BufferedReader read = new BufferedReader(new FileReader(newFile));

        String line;
        while ((line = read.readLine()) != null) {
            String[] dataArray = line.split(" ");
            List<String> countryNameArray = new ArrayList<>();
            List<Double> temperatures = new ArrayList<>();
            for (String data : dataArray) {
                try {
                    Double temp = Double.parseDouble(data);
                    temperatures.add(temp);
                } catch (NumberFormatException exception) {
                    countryNameArray.add(data);
                }
            }

            String countryName = String.join(" ", countryNameArray);
            System.out.println(countryName);
            System.out.println(temperatures);

            Double minTemp = minimumTemperature(temperatures);
            System.out.println("The minimum temperature is: " + minTemp);
            Double maxTemp = maximumTemperature(temperatures);
            System.out.println("The maximum temperature for this is: " + maxTemp);
            Double averageTemp = averageTemperature(temperatures);
            System.out.println("The average temperature  is: " + averageTemp);
            temperatures.remove(minTemp);
            temperatures.remove(maxTemp);
            Double averageTempWithoutExtremes = averageTempWithoutExtremes(temperatures);
            System.out.println("The average temperature without the maximum and minimum temperature is: " + averageTempWithoutExtremes);
        }
    }

    private static Double minimumTemperature(List<Double> temperatures) {
        Double minTemp = temperatures.get(0);
        for (int i = 1; i < temperatures.size(); i++) {
            if (temperatures.get(i) < minTemp) {
                minTemp = temperatures.get(i);
            }
        }
        return minTemp;
    }

    private static Double maximumTemperature(List<Double> temperatures) {
        Double maxTemp = temperatures.get(0);
        for (int i = 1; i < temperatures.size(); i++) {
            if (temperatures.get(i) > maxTemp) {
                maxTemp = temperatures.get(i);
            }
        }
        return maxTemp;
    }

    private static Double averageTemperature(List<Double> temperatures) {
        double avg ;
        double sum = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            sum = sum + temperatures.get(i);
        }
        avg =  sum / temperatures.size();
        return avg;
    }

    private static Double averageTempWithoutExtremes(List<Double> temperatures) {
        double avgWithoutExt;
        double sumWithoutExt = 0;
        for (int i = 1; i < temperatures.size(); i++) {
            sumWithoutExt = sumWithoutExt + temperatures.get(i);
        }
        avgWithoutExt =  sumWithoutExt / temperatures.size();
        return avgWithoutExt;
    }
}

