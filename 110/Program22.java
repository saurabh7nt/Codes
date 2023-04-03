//22) How to reverse word by word of a string in java?

public class Program22 {

    static void reverseWordByWord(String s){
        s = s + " ";
        String[] str = s.split(" ");
        String rev = "";
        for(int i=str.length-1; i>=0; i--){
           rev = rev + str[i];
        }
        System.out.println(rev);
    }
    public static void main(String[]args){
        String s = "Java Concept Of The Day";
        reverseWordByWord(s);
    }   
}
