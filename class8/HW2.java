package JAVABatch15.class32.class8;
import java.util.Scanner;
/*
Create a program that will be asking user to apply
for a credit card 10 times. As soon you get an "yes" from a user program
should stop asking.

 */

public class HW2 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Would you like to apply for credit card?");

        for(int c=0; c<=10; c++){

            boolean cardC=sc.next().equalsIgnoreCase("yes");

            if(!cardC){
                System.out.println("Would you like to apply for credit card?");
               continue;

            }else{
                System.out.println("Congratulation!");

                break;*/




                Scanner sc=new Scanner(System.in);
                for (int i=0; i<10; i++){
                    System.out.println ("Do you want to apply for credit card?");
                    String userInput=sc.next();
                    if(userInput.equalsIgnoreCase("yes")){
                        break;
                    }
                }











    }
}
