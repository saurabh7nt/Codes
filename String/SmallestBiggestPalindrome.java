public class SmallestBiggestPalindrome {
    public static void main(String[]args){

        String s = "Wow you own racecar";
        s = s + " ";
        s = s.toLowerCase();
        String [] str = new String[4];
        String w = "", smallest = "", biggest = "";
        int temp = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isWhitespace(ch)){
                w = w + ch;
            }else {
                str[temp] = w;
                temp ++; 
                w = "";
            }
        }
        
        //Now to check each element of an string array weather it is palindrome or not.

        int count=0;
        for(int i=0; i<str.length; i++){
            String rev = "";
            for(int j=0; j<str[i].length(); j++){
                char ch = str[i].charAt(j);
                rev = ch + rev;
            }
            if(rev.equals(str[i])){
                count++;                            //If string is palindrome string then increment 
                if(count ==1){
                    smallest = biggest = str[i];    //Initialize smallest and biggest by the first palindrome word
                }else {
                    if(smallest.length() > str[i].length()){    //comparing the next palindrome word length with the first
                        smallest = str[i];
                    }
                    if(biggest.length() < str[i].length()){
                        biggest = str[i];
                    }
                }
            }
        }

        if(count==0){
            System.out.println("No palindrome found.");
        }else{
            System.out.println("smallest palindrome : "+ smallest);
            System.out.println("biggest palindrome : "+ biggest);   
        }
    }   
}
