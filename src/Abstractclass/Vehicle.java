package Abstractclass;
    public abstract class Vehicle {
        String brand;
        Vehicle(String brand){
            this.brand = brand;
        }

        public abstract void startEngine();

        public void fuelup(){
            System.out.println("fueling up" + brand);
        }

        public void stopEngine(){
            System.out.println("Stopping engine of" + brand);
        }

    }

