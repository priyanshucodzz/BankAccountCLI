package Abstractclass;

 public class Client {
        public static void main(String[] args) {
            System.out.println("Hello World");

            Vehicle vehicle1 = new Car("BMW");
            Vehicle vehicle2 = new Car("BE6");

            vehicle1.startEngine();
            vehicle2.startEngine();

            vehicle1.fuelup();
            vehicle2.fuelup();

            vehicle1.stopEngine();
            vehicle2.stopEngine();
        }
    }

