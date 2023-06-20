package june19;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2Array {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        String[] array = arrayList.toArray(new String[arrayList.size()]);

        System.out.println(Arrays.toString(array));
    }
}

