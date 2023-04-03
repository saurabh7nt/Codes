//4) How to find duplicate characters in a string in java?
import java.util.*;

public class Program04 {

    static void duplicateCharacters(String s){
        Map<Character, Integer> map = new HashMap<>();
        s = s.replace(" ", "");
        System.out.println(s);
        char[] ch = s.toCharArray();

        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        Set<Character> set = map.keySet();

        for(char c : set){
            if(map.get(c) > 1){
                System.out.println(c +" - "+ map.get(c));
            }
        }

    }
    public static void main(String[]args){
        String s = "Better Butter";
        duplicateCharacters(s);
    }    
}
