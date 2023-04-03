class ReplaceLowerCase{
	public static void main(String[] args){
		String s = "sAURABH tAJANE";
		char[] ch = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			if(ch[i]>=65 && ch[i]<= 90){
				ch[i] = (char)(ch[i] + 32);
			}else if(ch[i]>=97 && ch[i]<=122 ){
				ch[i] = (char)(ch[i] - 32);
			}  
		}
		s = new String(ch);
		System.out.println("Converted string : "+s);
	}
}