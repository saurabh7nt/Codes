/* Method overriding is a feature in Java that allows a subclass to provide its own implementation for a method that is already defined in its superclass. */



class Demo{
	public void method1(){
		System.out.println("Method of super class.");
	}
}

public class Overriding extends Demo{

	@Override
    public void method1(){
		System.out.println("Method of sub class.");
	}

	public static void main(String[]args){
		Overriding o = new Overriding();
        o.method1();
	}
}