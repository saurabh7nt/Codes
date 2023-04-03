import java.util.*;

public class ParanthesisMatching{
	public static void main(String[]args){
        String s = "({[]})";
        ParanthesisMatching ps = new ParanthesisMatching();
        boolean b = ps.isParanthesisMatching(s);
        System.out.println("paranthesis matched : "+b);
    }
    public  boolean isParanthesisMatching(String s) { 
		Stack<Character> st = new Stack<>();

		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '{'  || s.charAt(i) == '['){
				st.push(s.charAt(i));
			}
			else{
				if(st.isEmpty()){
					return false;
				}
				else if((s.charAt(i) == ')' && st.peek() == '(' || s.charAt(i) == '}' && st.peek() == '{' ||
						 s.charAt(i) == ']' && st.peek() == '[' )){
					return true;
				}
				else{
					st.pop();
				}
			}
		}
        return st.isEmpty();
	}
}


