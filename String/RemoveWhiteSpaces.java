public class RemoveWhiteSpaces {
    public static void main(String[]args){
        String s = "Hello Java String ";
        // s = s.replaceAll("\\s", "");
        // System.out.println(s);
        String w = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isWhitespace(ch)){
                w = w + ch;
            }
        }
        System.out.println(w);
    }
}
