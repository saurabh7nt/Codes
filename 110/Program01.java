//1) How to reverse a string in java ?

public class Program01{

    static String reverseString(String s){
        String rev = "";
        for(int i=0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }   
        return rev;    
    }
    public static void main(String[]args){
        String s = "Reverse";
        System.out.println(reverseString(s)); 
    }   
}