class SwapUsingThird{
	public static void main(String[]args){
		int x=10, y=20, temp;
		System.out.println("x = "+x+" y = "+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("x = "+x+" y = "+y);
	}
}