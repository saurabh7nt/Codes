//How To Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String?

public class Program30{

    public static void characterPercentage(String s){

        int characterCount = s.length();
        int digit = 0;
        int uppercase = 0;
        int lowercase = 0;
        int other = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i); 
            if(Character.isUpperCase(ch))
                uppercase++;
            else if(Character.isLowerCase(ch))
                lowercase++;
            else if(Character.isDigit(ch))
                digit++;
            else
                other++;
        }

        double uppercasePercentage = (uppercase * 100.0)/characterCount;
        double lowercasePercentage = (lowercase * 100.0)/characterCount;
        double digitPercentage = (digit * 100.0)/ characterCount;
        double otherPercentage = (other * 100.0) / characterCount;
        
        System.out.println("Percentage of upppercase : "+ uppercasePercentage);
        System.out.println("Percentage of lowercase : "+ lowercasePercentage);
        System.out.println("Percentage of digit : "+ digitPercentage);
        System.out.println("Percentage of other : "+ otherPercentage);
    } 
    public static void main(String[]args){
        characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
    }
}