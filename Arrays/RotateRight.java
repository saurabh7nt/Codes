/*
 *  Rotate element towards right
*/

import java.util.*;
public class RotateRight{
	public static void main(String[]args){
		int [] arr = {5,4,3,2,1};
		int i,j,n=1,last;
        System.out.println(Arrays.toString(arr));
		for(i=0; i<n; i++){
			last=arr[arr.length-1];
			for(j=arr.length-1; j>0; j--){
				arr[j] = arr[j-1];
			}
			arr[j] = last;
		}
        System.out.println(Arrays.toString(arr));
	}
}