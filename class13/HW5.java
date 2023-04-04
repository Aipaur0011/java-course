package JAVABatch15.class32.class13;
/*
 How would you check if String is palindrome or not? aba=> true
Abbc =>false
 */

public class HW5 {
    public static void main(String[] args) {

        String original = "aba";
        String reverse = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }




    }
}
