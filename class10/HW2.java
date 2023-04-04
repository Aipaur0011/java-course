package JAVABatch15.class32.class10;
/*
2)Using Scanner create an array of countries.
When an array is created, retrieve all values from it and while retrieving those values
print capital for each country.(use 2 different loops).
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter three counties ");

        String [] countries= new String[3];
        for (int i = 0; i < countries.length ; i++) {
            countries[i] = sc.next();

        }
        System.out.println(Arrays.toString(countries).toUpperCase());

        System.out.println();



        System.out.println("****************************");

        for(String word:countries){
            System.out.println(word);
        }

    }
}
