package JAVABatch15.class32.class15;
/*
1) Create a method that will take 2 parameters
 as a numbers and prints which number is larger.

    type=>int
    name Method=> numbers
    parameters=>int num1, int num2
    }
    if
    {
 */

public class HW1 {

    int numbers(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
        }




        //2) Create a method that will take a number
    //and prints whether the number is even or odd.
    // type=> String
    //name method=> value
    //parameters => int number


    String value(int num ){
        if( num%2==0){
            return num +" even";
        }else{
            return num +" odd";
        }
    }

     /*
        3) Create a method that will print
        whether given String is palindrome or not.
        type=> String
        name method=> palindrome
        parameters=>String word
        }
        if
        {
         */

    String palindrome(String word){
        String reverse = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reverse)) {
            return word +"Is palindrome";
        }else{
            return word +" Is not palindrome";
        }

        }




        /*
        4)Create a method that will say Hello
         in different language based on the country
         that will passed when method is executed

         type=> String
         name method=>countries
         parameters=>if

         */

    String hello (String countries){
        if(countries.equals("Cyprus")){
            return "Gia sou";
        }
        if(countries.equals("Kyrgyzstan")){
            return "Salamatsyzdarby";
        }
        if(countries.equals("Turkey")){
            return "Merhaba";
        }
        if(countries.equals("Italy")){
            return "Ciao";
        }
        return "Wrong input";

    }

   /*2 String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }*/




    /*
    5) Write a method to return
    whether given number is prime or not?

    type=> int
    name method=> given
    parameters=> if
     */

    String given(int num) {
        boolean flag = false;
        if(num>1){

            for (int i = 2; i <num; i++) {

            if (num % 2 == 0 || num % 3==0) {
                flag = false;
                return num + " Not prime";
            }
        }

        }else{
            flag=false;
            return num+" not prime";
        }
        return num+" is prime";


    }

    /*
    6)Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:

    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F

    type=> int
    name method=> getGrade
    parameters=> if
     */

    String grade(int score){
        if(score>0 && score<50){
            return "F";
        }else if(score>50 && score<70){
            return "D";
        }else if(score>70 && score<80){
            return "C";
        }else if(score>80 && score <90){
            return "B";
        }else if(score>90){
            return "A";
        }
        return "Wrong input";


    }
}






