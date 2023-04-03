import java.util.*;

public class SecondSmallest{
	public static void main(String[]args){
		int [] arr = {50,30,20,10,40};
		int i,j;
		System.out.print(Arrays.toString(arr));
        for(i=0; i<arr.length; i++){
			for(j=i+1; j<arr.length; j++){
				if(arr[j] < arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.print("\nSecond smallest element : "+ arr[1]);
	}
}