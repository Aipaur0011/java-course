package JAVABatch15.class32.class10;
/*
6)Write a program to swap 2 numbers without a temporary variable?
 */

public class HW6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
