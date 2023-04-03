

class Demo{

    public void method1(){
        System.out.println("Super class method gets invoked.");
    }

}

public class Downcasting extends Demo {

    public void method2(){
        System.out.println("Sub class method gets invoked");
    }
    public static void main(String[]args){
        Demo d = new Downcasting();
        d.method1();                     
        Downcasting d2 = (Downcasting) d;
        d2.method1();
        d2.method2();

    }
}
