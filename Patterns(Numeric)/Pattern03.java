class Pattern03{
	
	public static void main(String[]args){
		int i,sp,k;
		
		for(sp=1, i=5, k=5; sp<=5 && i>=1; sp++, i--, k--){
			
			for(int l=1; l<=sp; l++){
				System.out.print(" ");
			}

			for(int m=1; m<=i; m++){
				System.out.print(k);
			}

			for(int n=1; n<=i; n++){
				System.out.print(k);
			}
			System.out.println();
		}
	}

}