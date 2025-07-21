package Multithreading;

public class client {
    public static void main(String[] args) {

        SharedData sharedNumber = new SharedData();


        System.out.println("Intialized with " + sharedNumber.number);
        Thread t1 = new AdderThread(sharedNumber);

        Thread t2 = new SubThread(sharedNumber);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("ended with " + sharedNumber.number);
    }

}