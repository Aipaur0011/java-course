package JAVABatch15.class32.class8;

/*
Write a program to ask a user to enter item they want to buy and the price of that item.
 Every time user enters money accumulate the amount and tell the user how much is left to pay off.
 If user give more money, program should return a change.
 Whenever a user done with payments program should say "Thank you for shopping!"
 */

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item what you want to buy?");
        String item=sc.next();
        double bag=258.99;
        double wallet=197.99;

        switch(item) {
            case "bag":
                System.out.println("Please pay $258.99");
                double bag1 = sc.nextDouble();

                if (bag1 > bag) {
                    bag1 -= bag;
                    System.out.println("You are getting change of $" + bag1);
                } else {
                    bag1 -= bag;
                    System.out.println("Pay balance of $" + bag1);
                }
                break;

            case "wallet":
                System.out.println("Please pay $197.99");
                double wallet1 = sc.nextDouble();

                if (wallet1 > wallet) {
                    wallet1 -= wallet;
                    System.out.println("You are getting change of $" + wallet1);
                } else {
                    wallet1 -= wallet;
                    System.out.println("Pay balance of $" + wallet1);
                }
                break;


            default:

                System.out.println("Item not available");
        }
        System.out.println("Thank you for shopping!");










    }
}
