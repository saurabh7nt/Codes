/*
    1
   222
  33333
 4444444
555555555
 6666666
  77777
   888
    9

*/

class Pattern06{
	public static void main(String[]args){
		int i,sp,k=1;
		for(i=1,sp=5;i<=5 && sp>=1;i++, sp--,k++){
			for(int l=2; l<=sp; l++){
				System.out.print(" ");
			}
			for(int m=1; m<=i; m++){
				System.out.print(k);
			}
			for(int n=2; n<=i; n++){
				System.out.print(k);
			}
            System.out.println();
		}

        for(i=4,sp=1;sp<=4 && i>=1;i--,sp++,k++){
			for(int l=1; l<=sp; l++){
				System.out.print(" ");
			}
			for(int m=1; m<=i; m++){
				System.out.print(k);
			}
			for(int n=2; n<=i; n++){
				System.out.print(k);
			}
            System.out.println();
		}
	}
}