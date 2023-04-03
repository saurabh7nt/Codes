import java.util.*;
  public class Program03 {
  public static void main(String[] args) {

  List<String> List1 = new ArrayList<String>();
  List1.add("1");
  List1.add("2");
  List1.add("3");
  List1.add("4");
  System.out.println("List1: " + List1);

  List<String> List2 = new ArrayList<String>();
  List2.add("A");
  List2.add("B");
  List2.add("C");
  List2.add("D");
 

  System.out.println("List2: " + List2);
  
  Collections.copy(List1, List2);           // Copy List2 to List1
  System.out.println("After copy:");
  System.out.println("List1: " + List1);
  System.out.println("List2: " + List2);
  Collections.shuffle(List2);              // After shuffling
  List2.forEach(s -> System.out.println(s));
    
 }
}
