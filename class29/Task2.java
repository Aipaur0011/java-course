package JAVABatch15.class32.class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        //Create an arrayList of words.
        // Remove every word that ends with “e”.

        ArrayList<String> makeup=new ArrayList<>();
        makeup.add("Lipstick");
        makeup.add("Eyeline");
        makeup.add("Blushone");
        makeup.add("Maskara");
        makeup.add("Faundation");

        makeup.removeIf(x->x.endsWith("e"));
        System.out.println(makeup);

    }
}
