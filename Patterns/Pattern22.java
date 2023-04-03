/*
* * * * * 
*     *
*   *
* *
*
* *
*   *
*     *
* * * * *
*/

public class Pattern22 {
    public static void main(String[]args){
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                if(i==1||j==1 || (i+j==6))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(i=2; i<=5; i++){
            for(j=1; j<=5; j++){
                if(i==5||j==1|| (i==j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
