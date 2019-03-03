public class sortingTask1 {
    public static void main(String[] args) {

        System.out.println("My Array is :");
        int[] myArray = {77, 20, 2, 33, 1991, -5, 87};
        for (int aMyArray : myArray) System.out.print(aMyArray + " ");

        System.out.println();
        System.out.println("Minimum number is " + minNumber(myArray));
        System.out.println("Maximum number is " + maxNumber(myArray));
        System.out.println("Average number is " + avgNumber(myArray));


        System.out.println("My Array using selection sort is :");
        int[] sortedArray = selectionSort(myArray);

        for (int aSortedArray : sortedArray) {
            System.out.print(aSortedArray + " ");
        }

        System.out.println();
        System.out.println("My initial array is  :");
        myArray[0] = 77;
        myArray[1] = 20;
        myArray[2] = 2;
        myArray[3] = 33;
        myArray[4] = 1991;
        myArray[5] = -5;
        myArray[6] = 87;
        for (int aMyArray : myArray) System.out.print(aMyArray + " ");

        System.out.println();
        System.out.println("My Array using bubble sort is :");
        int[] sorted = bubbleSort(myArray);

        for (int aSorted : sorted) {
            System.out.print(aSorted + " ");
        }
        System.out.println();
        System.out.println("Reversed array : ");

        for (int k = 0; k < myArray.length / 2; k++) {
            int tem = myArray[k];
            myArray[k] = myArray[myArray.length - (1 + k)];
            myArray[myArray.length - (1 + k)] = tem;

        }
        for (int aMyArray : myArray) {
            System.out.print(aMyArray + " ");
        }

    }

    private static int minNumber(int[] myArray) {

        int minValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        return minValue;
    }

    private static int maxNumber(int[] myArray) {
        int maxValue = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
        }
        return maxValue;
    }

    private static double avgNumber(int myArray[]) {
        int sum = 0;
        double avg ;
        for (int aMyArray : myArray) {
            sum = sum + aMyArray;
        }
        avg = (double) sum / myArray.length;
        return avg;
    }

    private static int[] selectionSort(int myArray[]) {
        int n = myArray.length;
        for (int k = 0; k < n - 1; k++) {

            int minIndex = k;
            for (int i = k + 1; i < n; i++) {
                if (myArray[i] < myArray[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = myArray[minIndex];
            myArray[minIndex] = myArray[k];
            myArray[k] = temp;
        }
        return myArray;
    }

    private static int[] bubbleSort(int myArray[]) {

        int n = myArray.length;
        int temp ;
        for (int j = 0; j < n - 1; j++) {

            for (int i = 0; i < n - j - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;

                }

            }

        }
        return myArray;
    }

}
