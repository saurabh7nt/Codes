//6) Anagram program in java
import java.util.*;

public class Program06 {

    static boolean isAnagram(String s1, String s2){
        
        s1 = s1.toLowerCase().replaceAll(" ", "");
        s2 = s2.toLowerCase().replaceAll(" ", "");
        
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
        
    }

    public static void main(String[]args){
        String s1 = "Mother in Law";
        String s2 = "Hitler Woman";
        if(isAnagram(s1,s2)){
            System.out.println("Its an anagram.");
        }else{
            System.out.println("Its not an Anagram.");
        }
    }    
}
