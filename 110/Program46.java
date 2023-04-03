import java.util.*;

public class Program46{
    public static void main(String[]args){
        int [] arr = {12, 9, 12, 9, 10, 9, 10, 11};
        int i;
        Map<Integer,Integer> map = new HashMap<>();
        for(i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);  //Then increament the existing element
            else
                map.put(arr[i],1);            //First time each element will go into else block
        }
        System.out.println(map);
    }
}
