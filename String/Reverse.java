class Reverse{
	public static void main(String[]args){
		String s = "saurabh";
		String rev = "";
		for(int i=0; i<s.length(); i++){
			rev = s.charAt(i) + rev;	
		}
		System.out.println(rev);
	}
}