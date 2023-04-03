import java.util.*;

class PrimeRange{
	public static void main(String[] args){
		System.out.println("Enter the range : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=2; i<=x; i++){
            boolean isPrime = true;
			for(int j=2; j<i; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
            if(isPrime)
                System.out.print(i+" ");
		}
        sc.close();
	}
}