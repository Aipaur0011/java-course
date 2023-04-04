package JAVABatch15.class32.class12;
/*
Write a program that reads two people's first
         names and if they expecting boy or girl?
         Based on the input suggests a name for a baby:

         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? boy
         Suggested baby name: DANRY

         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? girl
         Suggested baby name: MAIEL
 */

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mother's  name");
        String mother=sc.next();

        System.out.println("Enter father's name");
        String father=sc.next();

        System.out.println("Please enter the expected Baby gender ");


        boolean boy=sc.hasNext("boy");
        boolean girl=sc.hasNext("girl");

        String baby;

        if(boy){
            baby=(father.substring(0,3).concat(mother.substring(3)));
            System.out.println(baby.toUpperCase());
        }else if(girl){
            baby=(mother.substring(0,2).concat(father.substring(3)));
            System.out.println(baby.toUpperCase());
        }

        //generic colucion

        /*
        String dadsName="Zafar";
        String momsName="Maryum";
        String expectation="girl";
        String firstHalf="";
        String secondHalf="";
        if(expectation.equalsIgnoreCase("boy")){
             firstHalf=dadsName.substring(0,dadsName.length()/2);
             secondHalf=momsName.substring(momsName.length()/2);

        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);

         */




    }
}
