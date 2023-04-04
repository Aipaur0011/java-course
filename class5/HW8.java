package JAVABatch15.class32.class5;
import java.util.Scanner;
/*
HomeWork: Using scanner class create calculator.
 Allow user to enter 2 numbers and operator(+,-,*,/).
 Based on operator provide the result to user.
 */

public class HW8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();

        System.out.println("Enter the operator:+, -, *, / ");
        char b=sc.next().charAt(0);
        double sum=0;

        switch(b){
            case '+':
                sum=num1+num2;
             break;

            case '-':
                sum=num1-num2;
                break;

            case '*':
                sum=num1*num2;
                break;

            case '/':
                sum=num1/num2;
                break;

            default:

                System.out.println("Invalid");
        }
        System.out.println(sum);











    }
}
