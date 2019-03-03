public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        System.out.println();
        printYearsAndDays(-2000);


    }

    private static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainingDay = day % 365;

            System.out.printf("%d min = %d y and %d d", minutes, year, remainingDay);


        }


    }
}
