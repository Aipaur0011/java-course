package JAVABatch15.class32.class5;
import java.util.Scanner;
//Write a program to find largest number
// among three numbers using nested if provided
// by a user (numbers must be distinct)

public class task5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Please enter three numbers");

        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();

        if(number1>number2&& number1>number3){
            System.out.println("The largest number is "+number1);

        }else if (number2>number3&& number2>number1){
            System.out.println("The largest number is "+number2);
        }else if (number3>number1&& number3>number2){
            System.out.println("The largest umber is "+number3);
        }



    }
}
