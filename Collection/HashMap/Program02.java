import java.util.*;

public class Program02 {
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"red");
        map.put(2,"red");
        map.put(null,"red");

        if(map.containsValue("red")){
            System.out.println("Yes");
        }

        Set set = map.entrySet();
           System.out.println(set);
           
        // for(Map.Entry x : map.entrySet()){
        //     System.out.println(x);
        // }
    }
}
