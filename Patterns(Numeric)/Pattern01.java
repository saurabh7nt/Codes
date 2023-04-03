class Pattern01{
	public static void main(String[]args){
		
		int i,j,k;
		for(i=1,k=5; i<=5; i++, k--){
			for(j=1; j<=i; j++){
				System.out.print(k);
			} 
            System.out.println();
		}
	}
}