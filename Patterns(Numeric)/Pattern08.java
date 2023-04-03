/*
    1
   12
  123
 1234
12345

*/

class Pattern08{
	public static void main(String[]args){
		
		int i,k,sp;
		for(i=1,sp=5; i<=5 && sp>=1; i++, sp--){
			k=1;
			for(int l=2; l<=sp; l++){
				System.out.print(" ");
			}
			for(int m=1; m<=i; m++){
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}