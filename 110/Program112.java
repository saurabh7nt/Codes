//Magic Number Program In Java

public class Program112 {
    public static void main(String[]args){
        int num = 1252, i=0, sum=0;
        while(num != 0){
            sum = sum + (num%10);
            num/=10;
        }
        while(sum != 0){
            i = i + (sum % 10);
            sum /= 10;
        }
        if(i==1)
            System.out.println("Its a magic number.");
        else
            System.out.println("Its not a magic number.");
    }
}
