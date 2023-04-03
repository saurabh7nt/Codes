import java.util.Scanner;

class Reverse{
	
	public static void main(String[]args){

		int rem, revNum=0;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int x = num;
		while(x!=0){
			rem = x % 10;
			revNum = revNum * 10 + rem;
            x /= 10;
		}
		System.out.println("Reverse num is : "+ revNum);
        sc.close();
	}
}