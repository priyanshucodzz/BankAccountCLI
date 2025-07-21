package Multithreading;

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i+=2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

