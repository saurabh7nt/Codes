/* Method overloading is a feature in Java that allows a class to have multiple methods with the same name but different parameters. This allows developers to provide different implementations of a method based on the type and number of arguments passed to it. */

public class Overloading{
	
	public void method1(){
		System.out.println("Patameterless method.");
	}

	public void method1(int i){
		System.out.println("Parametarized method.");
	}

	public static void main(String[]args){
		Overloading o = new Overloading();
		o.method1();
		o.method1(1);
	}
	
}

