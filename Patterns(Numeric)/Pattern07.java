/*
1
12
123
1234
12345

-Column printing will be managed by the inner loop so its required to set the value of the 
 variable each time
 */
class Pattern07{
	public static void main(String[]args){
		
		int i,j,k;
		for(i=1; i<=5; i++){
			k=1;
			for(j=1; j<=i; j++){
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}