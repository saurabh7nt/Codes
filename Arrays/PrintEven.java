

public class PrintEven{
	public static void main(String[]args){
		int [] arr = {1,2,3,4,5};
		int i;
		for(i=1; i<arr.length; i+=2){
			System.out.print(" "+arr[i]);
		}	
	}
}