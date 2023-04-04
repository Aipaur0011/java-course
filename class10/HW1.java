package JAVABatch15.class32.class10;
/*
1)Using Scanner create an array of integer values.
 After the array is created, calculate the sum of all stored elements in that array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int[] a=new int [3];

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];

            System.out.println(Arrays.toString(a));
            System.out.println(sum);

        }



    }
}
