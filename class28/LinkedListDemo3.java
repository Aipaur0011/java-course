package JAVABatch15.class32.class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        //when we use LinkedList=>4 ms
        //long startTime=System.currentTimeMillis();

        /*LinkedList<String> numbers=new LinkedList<>();
        for (int i = 0; i <10000 ; i++) {
            numbers.add(0, "Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);*/

        System.out.println("=====================");

        //ArrayList=>slower than LinkedList

        long startTime=System.currentTimeMillis();

        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0, "Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);



    }
}
