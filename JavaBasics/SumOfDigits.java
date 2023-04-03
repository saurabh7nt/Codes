class SumOfDigits{
	public static void main(String[]args){
		int num = 12345, sum = 0, rem;

		while(num!=0){
			// rem = num % 10;
			// sum += rem;
            sum += (num % 10);
			num /= 10;
		}
		System.out.print("Sum : "+sum);
	}
}