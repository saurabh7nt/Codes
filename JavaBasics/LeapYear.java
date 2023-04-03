class LeapYear{
	public static void main(String[] args){
		int year=1600;
		if((year%4==0) && (year%100 !=0 || year%400==0))
			System.out.print(year+" is a leap Year.");
		else
			System.out.print("Not a leap year.");
	}
}