//Array Rotation Program In Java
import java.util.*;

public class Program67 {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        int i,j, n=2, temp;

        for(i=0; i<n; i++){
            temp = arr[0];
            for(j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
