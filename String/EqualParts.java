public class EqualParts {

    public static void main(String[] args){

        String s = "aaaabbbbcccc";
        int n=3, chars = s.length()/n, temp=0;
        String[] eqString = new String[n];
        if(s.length() % n == 0){
            for(int i=0; i<s.length(); i = i+chars){
                String part = s.substring(i, i+chars);
                eqString[temp] = part;
                temp++;
            }
        }else{
            System.out.println("Cannot divide this string in equal parts.");
        }

        System.out.println("Equal parts of given string are : ");
        for(String str : eqString)
            System.out.println(str);
    }
    
}
