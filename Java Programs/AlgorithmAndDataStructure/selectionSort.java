//public class selectionSort {

//    public static void main(String[] args) {
//        int[] array = {64, 25, 12, 22, 11};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int[] sortedArray = sort(array);
//
//        for (int i = 0; i < sortedArray.length; i++) {
//            System.out.print(sortedArray[i] + " ");
//        }
//
//    }

//    private int [] Sort (int list []) {
//        int i,j,minValue,minIndex,temp = 0;
//        for (i =0; i < list.length; i++){
//            minValue = list[i];
//            minIndex = i;
//            for (j=i; j < list.length; j++){
//                if (list [j] < minValue){
//                    minValue = list [j];
//                    minIndex = j;
//                }
//            }
//            if (minValue < list [i]){
//                temp = list [i];
//                list [i] = list [minIndex];
//                list [minIndex] = temp;
//            }
//        }
//        return list;

//   public static int [] sort (int array []) {
//
//        int n = array.length;
//
//        for (int k = 0; k < n-1; k++) {
//
//            // find the minimum element
//            int min_idx = k;
//            for (int i = k + 1; i < n; i++) {
//                if (array[i] < array[min_idx]) {
//                    min_idx = i;
//                }
//            }
//            // Swap the found minimum element with the first element
//            int temp = array[min_idx]; // 11
//            array[min_idx] = array[k];
//            array[k] = temp;
//        } // end of external loop
//
//        return array;
//
//
//}
//}
