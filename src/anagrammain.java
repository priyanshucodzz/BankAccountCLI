import java.util.*;
public class anagrammain {
    public static void main(String[] args) {
        System.out.println("Welecome to the Map");
        String s1 = "silent";
        String s2 = "listen";
        boolean res = AnagramCheck.Anagram(s1,s2);
        System.out.println(res);
    }
}
