
public class LargestElement{
	public static void main(String[]args){
		int[] arr = {10,20,30,40,30};
		int i, largest = Integer.MIN_VALUE;
		for(i=0; i<arr.length; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		System.out.println("The largest element in given array is : "+ largest);
	}
}