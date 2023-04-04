package JAVABatch15.class32.class5;
import java.util.Scanner;

public class class5scannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /*
        Scanner=>name of the class
        scan is just a variable like we create primitive variables
        = =>assignment operator
        System.in=> tells the computer we want to read the data from keyboard.
         */

        /*System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old ");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight+" Kg");
        System.out.println("Are you  hungry?");
        boolean hungry =scan.nextBoolean();
        System.out.println("Hungry " +hungry);

        //System.out.println("Please enter your gender");
        //char gender=scan.nextChar();
        //System.out.println("Your gender is "+gender);

        System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("your name is "+name);*/

        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);



    }
}
