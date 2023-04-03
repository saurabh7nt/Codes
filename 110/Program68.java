//Prime number 

public class Program68{

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        if(n<=1){
            return false;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;    
    }
    public static void main(String[]args){
        int counter=0;
        for(int i=0; counter<10; i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}
