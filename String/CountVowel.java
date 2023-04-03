class CountVowel{
	public static void main(String[] args){
		String s = "SaUraBh";
		int vowel=0, consonant=0;
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || 
			s.charAt(i) == 'i' || s.charAt(i) == 'o' || 
			s.charAt(i) == 'u'){
				vowel++;
			}else{
				consonant++;
			}
		}
		System.out.println("Vowel : "+vowel +" Consonant : "+consonant);
	}
}