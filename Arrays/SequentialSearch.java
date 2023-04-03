class SequentialSearch{
	
	public static void main(String[]args){
		int[] arr = {5,4,3,2,1};
		int i, key = 2;
		for(i=0; i<arr.length; i++){
			if(arr[i] == key){
				System.out.println("Key found at index "+ i);
				break;
			}
		}
	}
}