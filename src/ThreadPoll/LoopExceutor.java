package ThreadPoll;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoopExceutor{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 10; i++){
            int taskId = i;
            executor.execute(() ->{
                System.out.println("Running task Id: " + taskId + "by" + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
