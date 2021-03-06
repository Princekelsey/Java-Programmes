public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-5.0,4.0));

    }

    private static double area (double radius){
        if (radius < 0){
            return -1.0;
        }

        double PI = 3.14159;
        double areaOfCircle = radius * radius * PI;
        return areaOfCircle;
    }

    private static double area (double x, double y){
        if ((x < 0) || (y < 0)){
            return -1.0;
        }

        double areaOfARectangle = x * y;
        return areaOfARectangle;
    }
}
