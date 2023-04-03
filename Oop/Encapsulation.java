/* Encapsulation is achieved in Java by declaring the variables of a class as private and providing public getter and setter methods to access and modify those variables. This ensures that the internal state of the object can only be accessed or modified by the methods provided by the class, and not directly by external code. */

class Demo {

    private String email;
    private String password;
    
    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

}

public class Encapsulation{
    public static void main(String[]args){
        Demo d = new Demo();
        d.setEmail("saurabhtajne7@gmail.com");
        d.setPassword("Pass@123");
        System.out.println(d.getEmail());
        System.out.println(d.getPassword());
    }
}
