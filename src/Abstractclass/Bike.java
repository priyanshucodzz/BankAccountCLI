package Abstractclass;

public class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }


    @Override
    public void startEngine() {
        System.out.println("Started" + brand);
    }

}