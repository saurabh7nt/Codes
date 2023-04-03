class MaxOfArray{
	public static void main(String[] args){
		int[] arr = {10,20,30,50,40};
		int max=arr[0], i;
		
		for(i=0; i<arr.length; i++){
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Max element of given array : "+max);
	}
}