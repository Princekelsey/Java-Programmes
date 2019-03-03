public class sortingTask2 {
    public static void main(String[] args) {

        System.out.println("My 2D Array: ");

        int[][] multiArray = {
                {3, 33, 8, 2, 4, 6, 66, 266},
                {1, 0, 2, 0, 25, -5, 7, 0},
                {0, 0, 0, 4, 0, 44, 5, 0},
                {6, 5, 5, 34, 6, 0, 0, 2}
        };

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("The average value is " + avgValue(multiArray));
        System.out.println("The average value in row 0 is " + avgValueRow0(multiArray));
        System.out.println("The minimum value in column 0 is " + minColumn0(multiArray));
        System.out.println("The maximum value in row 1 is " + maxRow1(multiArray));
        System.out.println("The average value in column 6 is " + avgColumn6(multiArray));


    }

    // The Average Value
    private static double avgValue(int multiArray[][]) {
        int sum = 0;
        int totalSum = 0;
        double avg;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                sum += multiArray[i][j];
                totalSum++;

            }
        }
        System.out.println(totalSum);
        System.out.println("The sum of the array is " + sum);
        avg = (double) sum / totalSum;
        return avg;
    }

    // Find average value in row 0.
    private static double avgValueRow0(int[][] multiArray) {
        int sum = 0;
        double avg;
        for (int i = 0; i <= 7; i++) {
            sum += multiArray[0][i];
        }
        System.out.println("The sum of values in row 0 is " + sum);
        avg = (double) sum / 8;
        return avg;
    }

    // Find minimum in column 0
    private static int minColumn0(int[][] multiArray) {
        int minValue = multiArray[0][0];
        for (int i = 1; i < multiArray.length; i++) {
            if (multiArray[i][0] < minValue) {
                minValue = multiArray[i][0];
            }
        }
        return minValue;
    }

    // Find maximum in row 1
    private static int maxRow1(int[][] multiArray) {
        int maxValue = multiArray[1][0];
        for (int i = 1; i <= 7; i++) {
            if (multiArray[1][i] > maxValue) {
                maxValue = multiArray[1][i];
            }
        }
        return maxValue;
    }

    // Find average value in column 6.
    private static double avgColumn6(int[][] multiArray) {
        int sum = 0;
        double avg;
        for (int i = 0; i < multiArray.length; i++) {
            sum += multiArray[i][6];
        }
        System.out.println("The sum of values in column 6 is " + sum);
        avg = (double) sum / multiArray.length;
        return avg;
    }
}


