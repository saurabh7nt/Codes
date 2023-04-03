class Demo{
	public void supermethod(){
		System.out.println("Super class method.");
	}
}

class Inheritance extends Demo {
	public static void main(String[] args){
		Inheritance i = new Inheritance();
		i.supermethod();
	}
}