package JAVABatch15.class32.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetsDemo5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);

       /* for (int i = 0; i <numbers.size() ; i++) {
            for (int j = 0; j <numbers.size() ; j++) {
                if(numbers.get(i)==numbers.get(j)){
                    numbers.remove(j);
                }
            }
        }
        System.out.println("Remove "+numbers);*/

        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);
        }
    }

