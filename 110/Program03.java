//3) How do you remove all white spaces from a string in java?

public class Program03 {
    public static void main(String[]args){
        String s = "Saurabh Tajane    1";
        String newStr = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isWhitespace(ch))
                newStr = newStr + ch;
        }
        System.out.println(newStr);
    }    
}
