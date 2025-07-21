package Java8Features;
import java.util.*;
public class client {
    public static void main(String[]args) {
        List<String> strings = Arrays.asList("Apple", "Ap", "Banana", "Apple", "And");
        long count = strings.stream()
                .filter(s -> s.startsWith("A"))
                .distinct()
                .count();
        System.out.println(count);

    }
}
