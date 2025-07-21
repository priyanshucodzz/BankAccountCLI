import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String s,int start,int end){
        if(start >= end){
            return true;
        }
        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    }

