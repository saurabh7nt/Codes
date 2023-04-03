import java.util.*;
public class BinarySearchUnsorted {
   public static void main(String[]args){
        int[] arr = {4,2,1,3,5};
        // Arrays.sort(arr);
        //withour using sort method
        int i,j;
        for(i=0; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        if( BinarySearch(arr,6)){
            System.out.println("Element found.");
        }else{
            System.out.println("Not found.");
        }
    } 

    static boolean BinarySearch(int[]arr, int element){
        int start = 0, end = arr.length-1, mid; 

        for(int i=0; i<arr.length; i++){
            mid = (start + end )/ 2;

            if(arr[mid] == element){
                return true;
            }
            if(element < mid){
                end = mid - 1;
            }else{
                start = start + 1;
            }
        }
        return false;
    }
}
