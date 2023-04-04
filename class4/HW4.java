package JAVABatch15.class32.class4;
/*Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them.
        If they do have one ask what is balance on the card? If balance of
        the card is larger than 1000,
        tell them to pay off immediately, otherwise you can tell them that
         they can spend more.

        Write a program to ask user to enter numbers of worked years and
        annual salary.
        If user worked for more or equals to 5 years than user is eligible
        for the bonus,
        otherwise he is not. Once user is eligible and salary is larger
        than 50000 than bonus = 5000,
        otherwise bonus=3000.

 */
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner box=new Scanner(System.in);

        System.out.println("Do you have a credit card?");
        boolean card=box.nextBoolean();

        if(card){
            System.out.println("What is balance on the card?");
            int balance=box.nextInt();

            if(balance>1000){
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more.");
            }
        }else{
            System.out.println("I suggest you to open a credit card.");
        }

        System.out.println("How many years you work?");
        int years=box.nextInt();

        if(years>=5){
            System.out.println("You are eligible for a bonus ");

            System.out.println("What is your annual salary?");
            int salary=box.nextInt();

            if(salary>50000){
                System.out.println("You will get a bonus of 5000");
            }else{
                System.out.println("You will get a bonus of 3000");
            }
        }





    }



}
