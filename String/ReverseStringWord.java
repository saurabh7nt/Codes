public class ReverseStringWord {
    
    public static String reverseString(String s){
        String[] str = s.split(" ");
        System.out.println(java.util.Arrays.toString(str));

        String result = "";

        for(int i = str.length-1; i >= 0; i--){
            if(i==0){
                result = result + str[i];
            }else{
                result = result + str[i] + " ";
            }
        }

        return result;
    }
        public static void main(String[]args){
            String str = "Welcome to goa singham";
            System.out.println(reverseString(str));
    }
}
