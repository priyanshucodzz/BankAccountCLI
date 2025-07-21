import java.util.*;
public class Hashset {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("gavava");
        fruits.add("Papaya");
        System.out.println("Initial list"+ fruits);
        fruits.remove("gavava");
        System.out.println("After remove "+ fruits);
        System.out.println("Conatains Mango ? "+ fruits.contains("Mango"));
        fruits.clear();
        System.out.println("clear all fruits"+ fruits);



    }
}
