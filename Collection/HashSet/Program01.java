import java.util.*;

public class Program01{

    public static void main(String[]args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);  
        set.add(3);                     //duplicates not allowed
        set.forEach(s -> System.out.println(s));
    }
}