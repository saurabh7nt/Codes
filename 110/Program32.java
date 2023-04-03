//32) Find missing number in an array

public class Program32 {

    static int sumNum(int n){
        return (n*(n+1)/2);
    }
    public static void main(String[]args){
        int n=9, sum=0;
        int[] arr = {1,2,3,4,5,6,8,9};
        int sumOfNumber = sumNum(n);
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Missing number is : "+(sumOfNumber - sum));

    }
}
