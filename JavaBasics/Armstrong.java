import java.lang.Math;

class Armstrong{
	public static void main(String[]args){
		int arm = 153, rem, sum = 0;
		int demo = arm;

		while(arm != 0){
			rem = arm % 10;
			// sum = sum + (rem * rem * rem);
			sum = sum + (int) Math.pow(rem,3);
			arm /= 10;
		}
		if(sum == demo)
			System.out.print("Armstrong Number.");
		else
			System.out.print("Not an Armstrong number.");
	}
}