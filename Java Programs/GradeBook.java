import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String studentName;
        double score;
        double totalScore = 0;

        File file;
        FileWriter fileWriter;

        System.out.println("Enter student's name");
        studentName = input.next();

        file = new File(studentName + "_JavaResults.txt");
        fileWriter = new FileWriter(file);

        score = getScore("home task 1", 0, 10);
        fileWriter.append("home task 1 score: " + score + "\n");
        totalScore += score;

        score = getScore("home task 2", 0, 10);
        fileWriter.append("home task 2 score: " + score + "\n");
        totalScore += score;

        score = getScore("mid term test", 0, 30);
        fileWriter.append("mid term test score: " + score + "\n");
        totalScore += score;

        score = getScore("examination", 0, 50);
        fileWriter.append("examination score: " + score + "\n");
        totalScore += score;

        fileWriter.append("Student's total score: " + totalScore);

        fileWriter.flush();
        fileWriter.close();
    }

    public static double getScore(String scoreType, int min, int max) {
        Scanner input = new Scanner(System.in);
        double score;
        do {
            System.out.println("Enter student's " + scoreType + " score");
            score = input.nextDouble();
            if(score >= min && score <= max) {
                return score;
            }
            System.out.println("Ensure " + scoreType + " score is between " + min + " and " + max);
        } while (true);
    }
}
