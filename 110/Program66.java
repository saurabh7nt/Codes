public class Program66 {

    public static boolean checkPalindroe(String s){
        char[] ch = s.toLowerCase().toCharArray();
        int forward = 0, backword = ch.length-1;
        while(forward <= backword){
            if(ch[forward]!= ch[backword])
                return false;
            else
                forward++;
                backword--;
        }
        return true;
    }
    public static void main(String[]args){
        String s = "Rotator";
        if(checkPalindroe(s))
            System.out.println("Palindrome String.");
        else
            System.out.println("Not palindrome.");

    }
}
