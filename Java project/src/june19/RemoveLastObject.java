package june19;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Before removal: " + list);

        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("After removal: " + list);
        } else {
            System.out.println("The ArrayList is empty.");
        }
    }
}

