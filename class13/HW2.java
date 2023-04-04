package JAVABatch15.class32.class13;
/*
Create a String that should be combination of letters, numbers and special characters.
 Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

 */

public class HW2 {
    public static void main(String[] args) {

        String sent="ABCDertyu12345^&*()";
        System.out.println(sent.replaceAll("[^A-Za-z0-9]","").length());




    }
}
