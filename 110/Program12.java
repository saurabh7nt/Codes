//12) How to count occurrences of each character in a string in java?
import java.util.*;
public class Program12 {

    static void occurence(String s){
        Map<Character, Integer> charOccurence = new HashMap<>();
        char[] ch = s.toLowerCase().replaceAll(" ", "").toCharArray();
        // System.out.println(Arrays.toString(ch));

        for(char c : ch){
            if(charOccurence.containsKey(c)){
                charOccurence.put(c,charOccurence.get(c)+1);
            }else{
                charOccurence.put(c,1);
            }
        }

        Set<Character>  set = charOccurence.keySet();
        
        for(char c : set){
            if(charOccurence.get(c)>0){
                System.out.println(c+" - "+charOccurence.get(c));
            }
        }

    }
    public static void main(String[]args){
        String s = "Java J2EE Java JSP J2EE";
        occurence(s);
    }
}
