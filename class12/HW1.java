package JAVABatch15.class32.class12;
/*
Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
        For Example String str=hello =>
 */

import java.io.PrintStream;

public class HW1 {
    public static void main(String[] args) {

        String str="Hello";

            if ((!str.isEmpty()) && (str.length() % 2 != 0) && (str.length() > 3)) {

                //str.lenght()%2!=0 checks if number of charachter are odd
                int mid = (str.length() / 2);

                System.out.println(str.charAt(mid));


        }
    }
}
