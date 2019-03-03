import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int correctNumber = random.nextInt(100001);
        double amountSpent = 0;
        String response;
        int guessedNumber;
        boolean guessedRight = false;

        System.out.println("Want to win a million dollars?");

        do {
            System.out.println("If so, guess the winning number (a number between 0 and 100000)");
            System.out.println("Insert $1.00 and enter your number or 'q' to quit: ");
            response = input.next();

            if(response.equalsIgnoreCase("q")) {
                break;
            }

            guessedNumber = Integer.parseInt(response);
            if(guessedNumber == correctNumber) {
                guessedRight = true;
                System.out.println("YOU WIN");
                break;
            }

            amountSpent += (amountSpent > 0) ? 0 : 1;

            System.out.print("Sorry, good guess, but not quite right. " );
            System.out.println("Do you want me to give you a hint (Y|N)?");

            String option = input.next();

            if(option.equalsIgnoreCase("Y")) {
                amountSpent += 2;
                System.out.println("Insert $2.00 for the hint!");
                if(guessedNumber > correctNumber) {
                    System.out.println("Your number is too high");
                }
                else {
                    System.out.println("Your number is too low");
                }
            }

        } while (true);

        if(guessedRight == false && amountSpent > 0) {
            System.out.println("You lost $" + amountSpent + ". Thanks for playing. Come again!");
        }
    }
}
