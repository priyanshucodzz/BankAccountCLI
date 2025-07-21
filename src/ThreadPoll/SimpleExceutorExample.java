package ThreadPoll;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExceutorExample{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Runnable task1= () ->{
            System.out.println("Task 1 executed by" + Thread.currentThread().getName());
        };
        Runnable task2= () ->{
            System.out.println("Task 2 executed by" + Thread.currentThread().getName());
        };
        Runnable task3= () ->{
            System.out.println("Task 3 executed by" + Thread.currentThread().getName());
        };
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        executor.shutdown();
    }
}
