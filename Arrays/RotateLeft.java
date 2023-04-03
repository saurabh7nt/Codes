/*
 * Rotate element towards left by n number of times. 
*/

import java.util.*;

public class RotateLeft{
    public static void main(String[]args){
		int [] arr = {5,4,3,2,1};
		int i, j, first, n = 3;
        System.out.println(Arrays.toString(arr));
		for(i = 0; i < n; i++){
			first = arr[0];
			for(j=0; j < arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		System.out.print(Arrays.toString(arr));
	}
}