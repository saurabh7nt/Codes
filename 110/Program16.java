//How To Remove Duplicate Elements From ArrayList In Java?
import java.util.*;

public class Program16 {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(20);

        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer>withoutDuplicateList = new ArrayList<>(set);
        withoutDuplicateList.forEach(s -> System.out.println(s));
    }
}
