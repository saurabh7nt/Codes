class BinarySearch{
	public static void main(String[]args){
		int[] arr = {1,2,3,4,5,6,7};
		int start=0, mid, end=arr.length-2, key=3;

		while(start < end){
            mid = start + end /2;
			if(arr[mid] == key){
				System.out.println("Key is found...");
				break;
			}
			if(key < mid)
				end = mid - 1;
			else
				start = mid + 1;
		}
	}
}