//11.a Matrix addition

// public class Program11 {
//     public static void main(String[]args){

//         int[][] matrix1 = { {1,2,3},{4,5,6} };
//         int[][] matrix2 = { {6,5,4},{3,2,1} };
//         int[][] result = new int[2][3];
//         int i,j;

//         for(i=0; i<2; i++){
//             for(j=0; j<3; j++){
//                 result[i][j] = matrix1[i][j] + matrix2[i][j];
//                 System.out.print(result[i][j]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }

//11.b Matrix subtraction

// public class Program11{
//     public static void main(String[]args){
//         int[][] matrix1 = {{7,6,5},{4,3,2}};
//         int[][] matrix2 = {{6,5,4},{3,2,1}};
//         int[][] result = new int[2][3];
//         int i,j;
//         for(i=0; i<2; i++){
//             for(j=0; j<3; j++){
//                 result[i][j] = matrix1[i][j] - matrix2[i][j];
//                 System.out.print(result[i][j]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }

//11.c Matrix multiplication
// First condition : No of row of first matrix should be equal to row of the second matrix
//

// public class Program11{
//     public static void main(String[]args){
//         int[][] matrix1 = {
//                             {7,6,1},
//                             {2,3,8}
//                         };
//         int[][] matrix2 = {
//                             {4,9},
//                             {1,7},
//                             {3,8}    
//                         };
//         int[][] result = new int[2][3];
        
//         for(int i=0; i<2; i++){
//             for(int j=0; j<2; j++){
//                 result[i][j]=0;
//                 for(int k=0; k<3; k++){
//                     result[i][j] += matrix1[i][k] * matrix2[k][j];
//                 }
//                 System.out.print(result[i][j]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }

public class Program11{

    public static void main(String[]args){
        int[][] matrix = {
                    {1,2,3},
                    {4,5,6},
                    };
        int row = matrix.length, col=matrix[0].length;
        
        int[][] transpose = new int[col][row];              //change dimension of the new transpose matrix
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];             //transpose
            }
        }

        for (int i=0; i < col; i++){                        //iterate from col
            for (int j=0; j < row; j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}