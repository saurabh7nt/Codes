/*
 *********
  *     *
   *   *
    * *
     *
*/

public class Pattern26 {
    public static void main(String[]args){
        int st, sp;
        for(sp=1, st=5; sp<=5 && st>=1; sp++, st--){
            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                // System.out.print(j+""+st);
                if(j==1||st==5)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            for(int j=2; j<=st; j++){
                if(st==5 || (st==j)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}