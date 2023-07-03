package june19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversalExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // Using iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using forEach
        System.out.println("\nUsing forEach:");
        stringList.forEach(element -> System.out.println(element));

        // Using parallel stream
        System.out.println("\nUsing parallel stream:");
        stringList.parallelStream().forEach(element -> System.out.println(element));
    }
}

