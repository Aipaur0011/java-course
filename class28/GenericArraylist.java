package JAVABatch15.class32.class28;

import JAVABatch15.class32.class15.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArraylist {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();

        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        // no one now uses the arrays like this

        ArrayList name=new ArrayList();
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","Unknow"));

        for (Object j:name) {
        ((String)j).trim();
        }
    }
}
