package JAVABatch15.class32.class7;
import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean  condition=true;
        Scanner sc=new Scanner(System.in);
        int number=15;
        while(condition){
            System.out.println("Please enter a number between 10 to 20");
            int userInput=sc.nextInt();

            if(userInput>number){
                System.out.println("Your entered number is greater");
            }else if(userInput<number){
                System.out.println("You entered smaller number");
            }else{
                System.out.println("You won!!!");

                condition=false;
            }

        }
    }
}
