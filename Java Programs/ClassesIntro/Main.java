package com.prince;

public class Main {
// Members and Fields
    public static void main(String[] args) {

        Car myCar = new Car("Toyota");
        Car anotherCar = new Car("Audi");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        anotherCar.accelerate();
        anotherCar.brake();

    }
}

class Car {
    private int speed = 0; // Fields
    private String name;

    public Car( String carName){ // Constructor
        name = carName;
    }

    public void accelerate(){
        speed++;
        showSpeed();
    }
    public void brake(){
        speed --;
       showSpeed();
    }
    private void showSpeed(){
        System.out.printf("%s is going %d miles per hour %n", name, speed);
    }
}
