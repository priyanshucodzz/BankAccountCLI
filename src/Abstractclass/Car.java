package Abstractclass;

public class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }
    @Override
    public void startEngine() {
        System.out.println("Started" + brand);
    }

}
