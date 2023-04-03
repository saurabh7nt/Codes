import java.util.*;

public class Program02 {
    public static void main(String[]args){
        Set<String> hashset = new HashSet<>();
        hashset.add("Saurabh");
        hashset.add("Rushikesh");
        hashset.add("Vaibhav");
        hashset.add("Vaibhav");
        hashset.add("Vaibhav");
        hashset.add("Aniket");
        hashset.forEach(e -> System.out.println(e));
        Set<String> treeset = new TreeSet<>(hashset);
        System.out.println("Treeset : ");
        treeset.forEach(t -> System.out.println(t));
    }    
}
