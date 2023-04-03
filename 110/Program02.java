//How To Create Pyramid Of Numbers In Java?
import java.util.*;

public class Program02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt(),st, sp, k=1;
        for(sp=row, st=1; sp>=1 && st<=row; sp--, st++){
            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                System.out.print(k+" ");                
            }
            System.out.println();
            k++;
        }
    }
}
