import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        Map<String,Integer> m = new HashMap<>();
        m.put("Mango",10);
        m.put("Banana",6);
        m.put("Pineapple",5);
        m.put("Gavava",8);
        System.out.println("Initial list"+ m);

        System.out.println("Quantity of mango "+ m.get("Mango"));
        System.out.println("Contains Banana"+ m.containsKey("Banana"));



    }
}
