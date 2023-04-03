public class ReverseWordByWord {
    public static void main(String[]args){
        String s = "Hello I am Java version 8.";
        String rev = "";
        System.out.println(s);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);

    }    
}
