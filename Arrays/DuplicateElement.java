class DuplicateElement{
	
	public static void main(String[]args){
		int[] arr = {1,2,3,3,4,5,1,7,6,5};
		int i,j;
		System.out.print("Duplicate elements are :");
		for(i = 0; i<arr.length; i++){
			for(j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.print(" "+arr[i]);
					break;
				}	
			}
		}
	}
}