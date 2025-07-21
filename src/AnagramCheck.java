import java.util.*;
public class AnagramCheck {
    public static boolean Anagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }
        for(char c : s2.toCharArray()) {
            if(!freq.containsKey(c)) {
                return false;
            }
            freq.put(c, freq.get(c) -1);
            if(freq.get(c) == 0) {
                freq.remove(c);
            }
        }

        return freq.size() == 0;
    }






    }


