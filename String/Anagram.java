import java.util.*;

class Anagram{
	public static void main(String[] args){
		
		String s1 = "Grab";
		String s2 = "Brag";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		for(int i=0; i<s1.length(); i++){
			for(int j=i+1; j<s1.length(); j++){
				if(str1[i]>str1[j]){
					char temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		} 

		for(int i=0; i<s2.length(); i++){
			for(int j=i+1; j<s2.length(); j++){
				if(str2[i]>str2[j]){
					char temp = str2[i];
					str2[i] = str2[j];
					str2[j] = temp;
				}
			}
		} 

		// System.out.println(str1);
		// System.out.println(str2);

		s1 = new String(str1);
		s2 = new String(str2);

		if(s1.equals(s2)){
			System.out.println("Both string are anagrams.");
		}else{
			System.out.println("Both string are not anagrams.");
		}		
		
		// Arrays.sort(str1);
		// Arrays.sort(str2);

		// if(Arrays.equals(str1, str2) == true){
		// 	System.out.println("Both string are anagrams.");
		// }else{
		// 	System.out.println("Both string are not anagrams.");
		// }		
	}
}


