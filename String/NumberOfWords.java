//Java Program to find the number of the words in the given text line.

public class NumberOfWords {
    
    public static void main(String[]args){
        String s = "Hello, I am JDK 18.";
        s = s + " ";
        String w = "";
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                w = w + ch;
            }else{
                count++;
            }
        }
        System.out.println("Number of words in given program is : "+count);

    }
}
