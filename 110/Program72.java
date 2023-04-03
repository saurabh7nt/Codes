//To remove all the vowels

public class Program72 {

    public static void removeVowel(String s){
        s = s.toLowerCase();
        String n = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                n = n + "";
            }else{
                n = n + ch;
            }
        }
        System.out.println(n);
    }
    public static void main(String[]args){
        String s = "The string without vowels";
        removeVowel(s);
    }   
}
