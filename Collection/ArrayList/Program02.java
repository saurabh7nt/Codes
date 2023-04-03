// Write a Java program to insert an element into the array list at the first position.

import java.util.*;
public class Program02 {
    public static void main(String[]args){

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,50);             //Adding the element at specific position
        list.forEach(l -> System.out.println(l));
        System.out.println(list.get(2));    //Retriving at specific index
        list.set(2, 40);            //To update or set value at specific index
        System.out.println("List after updating : ");
        list.forEach(l -> System.out.println(l));
        list.remove(1);
        System.out.println("List after removing : ");
        list.forEach(l -> System.out.println(l));
        
    }
}
