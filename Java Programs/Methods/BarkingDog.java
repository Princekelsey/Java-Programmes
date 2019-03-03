public class BarkingDog {


    public static void main(String[] args) {

        hasEqualSum(1,2,3);

        hasEqualSum(2,6,3);
    }

    public static boolean hasEqualSum (int a, int b, int c){
        if (a + b ==c ){
            System.out.println("True");
            return true;

        }else
            System.out.println("false");
        return false;

    }

}


