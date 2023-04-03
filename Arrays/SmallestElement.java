
public class SmallestElement{
	public static void main(String[]args){
		int[] arr = {10,20,30,40,30};
		int i, max = Integer.MAX_VALUE;
		for(i=0; i<arr.length; i++){
			if(arr[i] < max){
				max = arr[i];
			}
		}
		System.out.println("The smallest element in given array is : "+ max);
	}
}