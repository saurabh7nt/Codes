import java.util.*;

public class Program01{
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"saurabh");
        map.put(2, "rushikesh");
        map.put(3, "vaibhav");
        for(Map.Entry x : map.entrySet()){
            System.out.println(x.getKey() + ". " + x.getValue());
        }
    }
}