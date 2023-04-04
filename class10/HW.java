package JAVABatch15.class32.class10;
/*1)Using Scanner create an array of integer values.
 After the array is created, calculate the sum of all stored elements in that array.*/

import java.util.Arrays;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 8 numbers ");
        int [] numbers=new int[8];
        int sum=0;

        for(int i=0; i<numbers.length; i++){
            numbers[i]= sc.nextInt();
            sum=sum+numbers[i];

            //System.out.println(Arrays.toString(sum+numbers[i]));
            }
             System.out.println(sum);

    }

}
