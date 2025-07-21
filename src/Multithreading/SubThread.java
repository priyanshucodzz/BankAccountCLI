package Multithreading;



public class SubThread extends Thread {

    SharedData data;

    SubThread(SharedData data){
        this.data = data;
    }


    //@Override
    public void run() {
        for(int i=1;i<=10;i++){
            data.sub(1);
            System.out.println("subtracted " + i + " from the sum " + data.number);
        }
    }
}