package JAVABatch15.class32.class29;

import java.util.TreeSet;

/*
Create a Set collection in which you need to add names of the countries.
 In this set we want all objects to be sorted in alphabetical order.
 Using 2 different ways retrieve all elements from set.
 */
public class TaskSet1 {
    public static void main(String[] args) {

        TreeSet<String> countries=new TreeSet<>();
        countries .add("USA");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Portugal");

        System.out.println(countries);

        for(String s:countries){
            System.out.println(s);
        }
    }
}
