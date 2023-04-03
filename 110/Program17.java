// Java Program To Check Whether Given Number Is Binary Or Not

public class Program17 {

    public static void isBinaryOrNot(int n){

        int num = n;
        int dig;
        boolean b = true;
        while(num != 0){
            dig = num % 10;
            if(dig > 1){
                b = false;
                break;
            }else{
                num /= 10; 
            }
        }

        if(b){
            System.out.println(n + " is binary.");
        }else{
            System.out.println(n + " is not binary.");
        }

    }
    public static void main(String[]args){
        isBinaryOrNot(128956);
 
        isBinaryOrNot((101110));
 
        isBinaryOrNot((42578));
 
        isBinaryOrNot((10110101));
    }
}
