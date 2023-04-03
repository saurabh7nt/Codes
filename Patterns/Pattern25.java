/*
     *
    * *
   *   *
  *     *
 *********
*/

public class Pattern25 {
    public static void main(String[]args){
        int st, sp;
        for(sp=5, st=1; sp>=1 && st<=5; sp--, st++){
            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                if(j==1 || st==5)
                     System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=2; k<=st; k++){
                // System.out.print(k+""+st);
                if(k==st || st == 5)
                     System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }   
}
