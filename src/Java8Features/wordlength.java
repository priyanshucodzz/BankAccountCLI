package Java8Features;
import java.util.*;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;

public class wordlength {
    public static void main(String[]args) {
                List<String> strings = Arrays.asList("Cat", "Apple", "Dog", "Bear", "Ant");

                List<String> result = strings.stream()
                        .filter(s -> s.length() > 3)
                        .collect(Collectors.toList());

                System.out.println(result); // Output: [Apple, Bear]
            }
        }



