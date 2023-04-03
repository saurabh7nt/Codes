/*
 *****
  ****
   ***
    **
     *
    **
   ***
  ****
 *****
*/

class Pattern08{
	public static void main(String[] args){
		int i,sp;
		for(i=5,sp=1; i>=1 && sp<=5; i--, sp++){
			for(int k=1; k<=sp; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}	
			System.out.println();
		}
		for(i=2, sp=4; i<=5 && sp>=1; i++, sp--){
			for(int j=1; j<=sp; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}