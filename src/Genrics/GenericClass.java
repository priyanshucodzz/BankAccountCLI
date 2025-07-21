package Genrics;

public class GenericClass <T>{
    public static <T> void genericPrintMethod(T[] arr) {
        for (T element : arr) {
            System.out.print(element);
        }
        System.out.println();
    }
}