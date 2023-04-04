package JAVABatch15.class32.class5;
import java.util.Scanner;

        /*
Write a program that will read three inputs of scores (quiz, mid term, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
        */

public class HW3 {
    public static void main(String[] args) {

        System.out.println("Enter your score");
        Scanner sc=new Scanner(System.in);

        int score=sc.nextInt();

        if(score>=90){
            System.out.println("Your grade is 'A' ");
        }else if(score>=70){
            System.out.println("Your grade is 'B' ");
        }else if(score>=50){
            System.out.println("Your grade is 'C' ");
        }else{
            System.out.println("Your grade is 'F' ");
        }



    }
}
