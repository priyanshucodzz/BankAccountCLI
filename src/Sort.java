import java.util.*;
public class Sort {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        // int arr[] = {10,20,30,40,50};

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);
        list.set(2, 99);
        System.out.println("After updating index 2 to 99: " + list);
        list.remove(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }

}
