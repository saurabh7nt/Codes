/*
     *
    **
   ***
  ****
 *****
 
*/
class Pattern03{
	
	public static void main(String[] args){
		
		int i,sp;
		for(i=1, sp=5; i<=5 && sp>=1; i++, sp--){
			for(int k=1; k<=sp; k++){
				System.out.print(" ");
			}
			for(int l=1; l<=i; l++){
				System.out.print("*");
			}
			System.out.println();
		} 
	}
}
