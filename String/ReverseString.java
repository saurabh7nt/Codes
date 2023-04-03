import java.util.*;

class StackImpl{
	
	public String reverseStr(String str){
		Stack<Character> st = new Stack<Character>();
		String reverse = "";
		for(int i=0; i<str.length(); i++){
			st.push(str.charAt(i));
		}
		
		while(!st.isEmpty()){
			reverse = reverse + st.pop();
		}
		return reverse;
	}
}
public class ReverseString{		
	public static void main(String[] args){
		StackImpl s = new StackImpl();
		String str = "Saurabh Tajane";
		System.out.println(s.reverseStr(str));
	}
}