class Palindrome{
	public static void main(String[]args){
		int x = 12321, revNum = 0, rem;
		int demo = x;

		while(x != 0){
			// rem = x % 10;
			revNum = revNum * 10 + (x % 10);
			x /= 10;			
		}
		if(revNum == demo)
			System.out.println("Palindrome.");
		else
			System.out.println("Not a palindrome.");
		
	}
}