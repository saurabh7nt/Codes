import java.util.*;

public class Program01{
    public static void main(String[]args){
        List<String> list = new LinkedList<>();  
        list.add("Red");
        list.add("Black");
        list.add("Yellow");
        
        ListIterator it = list.listIterator();
       
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Reverse printing : ");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        
        // Iterator desc = list.descendingItr
    }
}