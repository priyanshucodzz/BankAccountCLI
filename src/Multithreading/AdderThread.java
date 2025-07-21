package Multithreading;
public class AdderThread extends Thread {

    SharedData data;

    AdderThread(SharedData data){
        this.data = data;
    }


    //@Override
    public void run() {
        for(int i=1;i<=10;i++){
            data.add(1);
            System.out.println("added " + i + " and the sum is " + data.number);
        }
    }
}
