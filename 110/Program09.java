//9) How to find sum of all digits of a number in java?

public class Program09 {
    public static void main(String[]args){
        int [] arr = {10,20,30,40,50};
        int i, sum=0;
        for(i=0; i<arr.length; i++){
                sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
