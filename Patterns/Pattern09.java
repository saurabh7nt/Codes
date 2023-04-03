public class Pattern09{
	public static void main(String[]args){
		
		int sp,i;
		for(sp=5, i=1; sp>=1 && i<=5; sp--, i++){
			for(int k=1; k<=sp; k++){
				System.out.print(" ");
			}
			for(int l=1; l<=i; l++){
				System.out.print("*");
			}
			for( int n=2; n<=i; n++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}