import java.util.Arrays;

class Reverse{
	
	public static void main(String[]args){
		
		int[] arr = {5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		int start=0, temp,end = arr.length-1;		
		
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
		}
        
		System.out.println(Arrays.toString(arr));
	}
}