package Exception;
import java.util.*;
public class client {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: Division by zero is not allowed.");
            System.out.println("Error message: " + e.getMessage());
            }


    }
}
