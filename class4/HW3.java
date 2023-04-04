package JAVABatch15.class32.class4;
//You are DMV representative and you need to ask customer their age.
// If they are 18 and older you will
// issue a driver licence to them, otherwise you will offer them to get
// a learners permit.
//Create a Java program that will ask user to input //You are DMV representative and you need to ask customer their age.
//// If they are 18 and older you will
//// issue a driver licence to them, otherwise you will offer them to get
//// a learners permit.
////Create a Java program that will ask user to input city and temperature.
//// Your program should convert
//// Fahrenheit into celsius and print “The temperature is the city  is ”
////.
// Your program should convert
// Fahrenheit into celsius and print “The temperature is the city  is ”
//
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        System.out.println("How old are you?");

        int age=18;

        if(age>18){
            System.out.println("You eligible to get Driver Licence");
        }else{
            System.out.println("You eligible to get a learners permit");
        }
        Scanner box=new Scanner (System.in);

        System.out.println("Enter your city ");
        String city=box.next();

        System.out.println("Enter the temperature outside ");
        double temp=box.nextDouble();

        double temp1=(((temp-32)*5/9));


        System.out.println("The temperature in "+city+ "is " + String.format("%.2f",temp1)+ "°C" );












    }

}
