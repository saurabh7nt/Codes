public class Palindrome{
	public static void main(String[] args){
		String s = "naman";
		String rev = "";
		for(int i=0; i<s.length(); i++){
			rev = s.charAt(i) + rev;
		}
		if(s.equals(rev))
			System.out.println("Palindrome.");
		else
			System.out.println("Not palindrome.");
	}
}