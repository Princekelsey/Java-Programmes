import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExaminationPractical {
    public static void main(String[] args) throws IOException {
        System.out.println("Calculatiing the area of Triangle ");


        Scanner input = new Scanner(System.in);
        File file;
        FileWriter fileWriter;


        file = new File("Prince  _JavaResults.txt");
        fileWriter = new FileWriter(file);

        System.out.println("Enter 1 if you want to calculate the area of the triangle using 3 sides of the Triangle ");
        System.out.println("Enter 2 if you want to calculate the area of the triangle using the height and base Triangle ");
        int choose = input.nextInt();

        if (choose == 1) {
            // Using 3 side of the Triangle
            System.out.println("Input the value for Side 1 of the Triangle");
            double side1 = input.nextDouble();
            fileWriter.append("side 1: " + side1 + "\n");
            System.out.println();

            System.out.println("Input the value for Side 2 of the Triangle");
            double side2 = input.nextDouble();
            fileWriter.append("side2 :" + side2 + "\n");
            System.out.println();

            System.out.println("Input the value for Side 1 of the Triangle");
            double side3 = input.nextDouble();
            fileWriter.append("side3: " + side3 + "\n");
            System.out.println();

            double Area = CalculateArea(side1, side2, side3);
            fileWriter.append("Area: " + Area + "\n");
            System.out.println("Area of the triangle is " + Area);

            if (validateTriangle(side1, side2, side3)) {
                System.out.println("Triangle is Valid");
            }
        }
//	// Using height and base
        else {
            System.out.println("Input the value for Base of the Triangle");
            double base = input.nextDouble();
            fileWriter.append("base: " + base + "\n");
            System.out.println();

            System.out.println("Input the value for Height of the Triangle");
            double height = input.nextDouble();
            fileWriter.append("height: " + height + "\n");
            System.out.println();

            double Area = CalculateArea2(base, height);
            fileWriter.append("Area: " + Area + "\n");
            System.out.println("Area of the triangle is " + Area);

        }
        fileWriter.flush();
        fileWriter.close();
    }

    public static double CalculateArea(double side1, double side2, double side3) {
        double Perimeter = (side1 + side2 + side3) / 2;
        double Area = Math.sqrt(Perimeter * ((Perimeter - side1) * (Perimeter - side2) * (Perimeter - side3)));
        return Area;
    }

    public static double CalculateArea2(double base, double height) {
        return (base * height) / 2;
    }

    public static boolean validateTriangle(double side1, double side2, double side3) {
        return side2 + side3 > side1;
    }
}


