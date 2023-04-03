/*
 *  Java Program to copy all elements of one array into another array.
*/

import java.util.*;

public class CopyElement{
	public static void main(String[]args){
		int [] arr = {5,4,3,2,1};
		int [] brr = new int[arr.length];
		int i=0;
        System.out.println("Element in first array : "+Arrays.toString(arr));
		for(i=0; i<arr.length; i++){
			brr[i] = arr[i];	
		}
		System.out.println("Element in second array : "+Arrays.toString(brr));
	}
}