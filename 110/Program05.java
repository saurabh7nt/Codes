//5) How do you check the equality of two arrays in java?
import java.util.*;

public class Program05 {
    public static void main(String[]args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};
        boolean b = true;

        if(arr1.length != arr2.length){
                System.out.println("Not Equal...");
        }else{
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)){
                System.out.println("Arrays is equal.");
            }else{
                System.out.println("Not equal....");
            }

            //Bubble sort 

            // for(int i=0; i<arr1.length; i++){
            //     if(arr1[i] != arr2[i]){
            //         b = false;
            //         break;
            //     }
            // }
            // if(b){
            //     System.out.println("Arrays is equal.");
            // }else{
            //     System.out.println("Not equal....");
            // }

        }


    }
}
