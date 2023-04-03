class ArmstrongInArray{

	public static void main(String[]args){

		int[] arr = {151,152,145,153,165};
		int i, sum, rem, demo;
		
		for(i=0; i<arr.length; i++){
			demo = arr[i];						//storing value of each array element at each iteration
			sum = 0;							//for each element sum should be initialized with zero.
			while(arr[i] != 0){
				rem = arr[i] % 10;
				sum = sum + (rem * rem * rem);
				arr[i]/=10;
			}

			if(sum == demo)	
			System.out.println(demo+ " is a palindrome number.");
			else
			System.out.println(demo+ " is a not palindrome number.");
		}
		
	}
}