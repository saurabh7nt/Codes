//14) How to find all pairs of elements in an array whose sum is equal to given number?
public class Program14 {
    public static void main(String[]args){
        int[] arr = {4, 5, 7, 11, 9, 13, 8, 12};
        int num = 20, i,j;
        for(i=0; i<arr.length; i++){
            for( j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j]==num){
                    System.out.println(arr[i] + " + " + arr[j] +" = " + " 20");
                }
            }
        }
    }
}
