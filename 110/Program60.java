//60) Write a java program to print Floyd’s Triangle? [Solution]
public class Program60 {
    public static void main(String[]args){

        int i,j,k=1;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
