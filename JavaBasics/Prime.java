import java.util.*;

class Prime{
	public static void main(String[] args){
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean flag = false;
		for(int i=2; i<x; i++){
			if(x % i == 0){
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("Number is not prime.");
		else
			System.out.println("Number is prime.");
			
		sc.close();
	}
}