class MinOfArray{
	public static void main(String[] args){
		int[] arr = {-1,10,20,-3,50,40};
		int min=arr[0], i;
		
		for(i=0; i<arr.length; i++){
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Min element of given array : "+min);
	}
}