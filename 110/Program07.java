//7) Armstrong number program in java

public class Program07 {
    public static void main(String[]args){
        int num = 153, rev, n = num , sum=0;
        
        while(n != 0){
            rev = n % 10; 
            sum = sum + (rev * rev * rev);
            n /= 10;
        }

        if(sum == num){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Not an armstrong number.");
        }
    }
}
