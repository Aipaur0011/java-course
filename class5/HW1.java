package JAVABatch15.class32.class5;
import java.util.Scanner;

  /*Prompt the user to enter person heights in inches.
            Person should be classified as one of the following:
            short (under 60 inch)
            medium(between 60 -72 inch)
            tall (over 72 inch)*/



public class HW1 {
    public static void main(String[] args) {

        System.out.println("Enter your height in inches");
        Scanner sc=new Scanner(System.in);

        int height=sc.nextInt();

        if(height>72){
            System.out.println("You are tall");

        }else if( height>60 ){
            System.out.println("You are medium");
        }else{
            System.out.println("You are short ");
        }





    }
}
