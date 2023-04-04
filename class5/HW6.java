package JAVABatch15.class32.class5;
import java.util.Scanner;

        /*
        Write a program to find largest number among three numbers
        using nested if provided by a user (numbers must be distinct)
        */

public class HW6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c) {
            System.out.println("The largest number is " + a);
        }else if(b>c && b>a) {
            System.out.println("The largest number si " + b);
        }else {
                System.out.println("The largest number is "+c);
        }


    }
}
