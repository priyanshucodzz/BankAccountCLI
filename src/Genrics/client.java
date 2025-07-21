package Genrics;
import java.util.*;
public class client {
    public static void main(String[] args) {
        // T -> Integers
        GenericClass<Integer> gCInteger = new GenericClass();
        Integer[] integerArray = {1,2,3,4,5};
        gCInteger.genericPrintMethod(integerArray);

        // T -> String
        GenericClass<String> gCString = new GenericClass();
        String[] stringArray = {"A", "B", "C"};
        gCInteger.genericPrintMethod(stringArray);
    }
}
