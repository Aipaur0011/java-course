package JAVABatch15.class32.class5;
import java.util.Scanner;
/*
Write a program to find largest of three double values using if-else..if
and logical operators provided by a user (numbers must be distinct)
 */

public class HW5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three distinct double values:");

        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();

        if(num1>num2 && num1>num3){
            System.out.println("The largest value is "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The largest value is "+num2);
        }else if(num3>num1 && num3>num2){
            System.out.println("The largest value is "+num3);
        }else{
            System.out.println("The values are not distinct!");
        }



    }
}
