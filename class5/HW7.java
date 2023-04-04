package JAVABatch15.class32.class5;
import java.util.Scanner;

        /*
        Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.

        Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.
        */

public class HW7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your country: Kyrgyzstan, Cyprus, Russia, USA");
        String country =sc.next();

        switch(country){

            case "Kyrgyzstan":
                System.out.println("Your language is kyrgyz");
                        break;
            case "Cyprus":
                System.out.println("Your language is greek");
                break;
            case "Russia":
                System.out.println("Your language is russian");
                break;
            case "USA":
                System.out.println("Your language is english");
                break;
            default:
                System.out.println("Not acceptable");
        }



        System.out.println("*******************");

        System.out.println("Enter your grade");
        char grade=sc.next().charAt(0);

        switch(grade){
            case 'A':
            case 'a':
                System.out.println("Your grade is Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Your grade is Good");
                break;
            case 'C':
            case 'c':
                System.out.println("Your grade is Average");
                break;
            case 'D':
            case 'd':
                System.out.println("Your grade is Bad");
                break;
                default:
                System.out.println("The grade you entered is not acceptable ");


        }



        /*if(country.equalsIgnoreCase ("Kyrgyzstan")){
            System.out.println("You have selected " + country);
            System.out.println("Upayinyzdy kattanyz");

            int grade1=sc.nextInt();

            if(grade1>=90){
                System.out.println("Sizdin upayinyz "+grade1+" Sizdin baanyz  'A'");
            }else if(grade1>=70 && grade1<=90){
                System.out.println("Sizdin upayinyz "+grade1+ " Sizdin baanyz 'B'");
            }else if (grade1>=50 && grade1<=70){
                System.out.println("Sizdin upayinyz "+grade1+ " Sizdin baanyz 'C'");
            }else if(grade1>=0 && grade1<=50){
                System.out.println("Sizdin upayinyz "+grade1+ " Sizdin baanyz 'D'");
            }else{
                System.out.println("Sizdin upayinyz "+grade1+ "kabyl alynbayt");
            }


        }*/



    }
}
