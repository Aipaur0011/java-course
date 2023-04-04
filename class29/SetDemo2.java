package JAVABatch15.class32.class29;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo2 {
    public static void main(String[] args) {

        //doen not allow duplicates and retains the insertion order
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
