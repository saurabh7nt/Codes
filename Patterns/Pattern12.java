/* 
  *********
   *******
    *****
     ***
      *
     ***
    *****
   *******
  *********
*/



class Pattern12{
	public static void main(String[]args){
		int sp,i;

		for(sp=1, i=5; sp<=5 && i>=1 ;sp++, i--){
			for(int j=1; j<=sp; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			for(int l=2; l<=i; l++){
				System.out.print("*");
			}
            System.out.println();
		}

		for(sp=4, i=2; i<=5 && sp>=1 ;i++, sp--){
			for(int j=1; j<=sp; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			for(int l=2; l<=i; l++){
				System.out.print("*");
			}
            System.out.println();
		}
	}
}