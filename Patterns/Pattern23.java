/*
          * 
        * *
      *   *
    *     *
  *       *
    *     *
      *   *
        * *
          *
*/

public class Pattern23 {
    public static void main(String[]args){
        int sp,st;
        for(sp=5, st=1; sp>=1 && st <=5; sp--, st++){
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                if(j==1 || (st==j))
                  //System.out.print(""+j +""+ st);
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        
        for(sp=2, st=4; st>=1 && sp<=5; sp++, st--){
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                if(j==1 || (st==j))
                  //System.out.print(""+j +""+ st);
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        } 
    }
}
