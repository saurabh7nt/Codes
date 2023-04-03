//Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.*;

class Program01{

    public static void main(String[]args){
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("blue");
        list.add("yellow");
        list.forEach(l -> System.out.println(l) );    //prefer foreach with lambda expression to iterate over collection
        // for(String str : list)
        //     System.out.println(str);
    }
}