package JAVABatch15.class32.class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        //Removes duplicates ant put by alphabetic
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}
