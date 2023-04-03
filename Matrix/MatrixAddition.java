import java.util.*;

public class MatrixAddition{
	public static void main(String[]args){
		int[][] arr = {{1,2,3},{4,5,6}};
		int[][] brr = {{6,5,4},{3,2,1}};
		int[][] trr = new int[2][3];
		int i,j;

		for(i=0; i<2; i++){    
            for(j=0; j<3; j++){    
                trr[i][j]=arr[i][j]+brr[i][j];     
                System.out.print(trr[i][j] + "\t");
            }  
            System.out.println();
        }

    }
}