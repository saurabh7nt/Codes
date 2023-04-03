//Counting of character present in a string without counting space.

class CharacterCount{
	public static void main(String[] args){
		String s = "saurabh tajane";
		int count = 0;
		for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ')    
                count++;  
		    }
		System.out.println("Number of characters in given string : "+count);
	}
}