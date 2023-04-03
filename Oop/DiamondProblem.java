interface A {
    void print();
    default void method(){
        System.out.println("Default method of interface A.");
    }
}

interface B {
    default void method(){
        System.out.println("Default method of interface B.");
    }
    static void method2(){
        System.out.println("Static method of B interface.");
    }
}

class Z implements A,B {
    public void print(){
        System.out.println("Print A");
    }

    // public void method(){
    //     System.out.println("class level");
    // }
    public void method(){
        A.super.method();
        B.super.method();
    }
    
}

public class DiamondProblem {
    public static void main(String[]args){
        A a = new Z();
        // B b = new Z();
        a.print();
        // b.method();
        a.method();
        B.method2();
    }
}
