//8) How to find duplicate elements in an array?

import java.util.*;
public class Program08 {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,4,1,2,1,2,3};
        int i,j;
        Set<Integer> set = new HashSet<>();

        for(i=0; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        
        System.out.println("Duplicate Elements : ");
        set.forEach(s -> System.out.println(s));
    }
}
