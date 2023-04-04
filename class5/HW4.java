package JAVABatch15.class32.class5;
import java.util.Scanner;
      /*
      Write a program for user to enter his/hers birth month.
       Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __"
      */


public class HW4 {
    public static void main(String[] args) {
        System.out.println("Enter month when you were born");
        Scanner sc = new Scanner(System.in);

        String month = sc.next();

        switch (month){

              case "December":
              case "January":
              case "February":
                  System.out.println("You were born in winter");
                  break;

              case "March":
              case "April":
              case "May":
                  System.out.println("You were born in spring");
                  break;

              case "June":
              case "July":
              case "August":
                  System.out.println("You were born in summer");
                  break;

              case "September":
              case "October":
              case "November":
                  System.out.println("You were born in autumn");
                  break;

              default:
                  System.out.println("Invalid month");




          }




          /*if (month.equalsIgnoreCase ("December") ||month.equalsIgnoreCase ("January") || month.equalsIgnoreCase("February")){
            System.out.println("You were born in Winter");

        }else if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase ("April")||month.equalsIgnoreCase( "May")){
            System.out.println("You were born in Spring");

            }else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
            System.out.println("You were born in Summer");

        }else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
            System.out.println("You were born in Autumn ");}*/



         /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth month (e.g. January, February, etc.):");
        String month = sc.nextLine();

        switch (month) {

            case "December", "January", "February":
                System.out.println("Winter");
                break;

            case "March", "April", "May":
                System.out.println("Spring");
                break;

            case "June", "July", "August":
                System.out.println("Summer");
                break;
            case "September", "October", "November":
                System.out.println("Fall");
                break;

            default:
                System.out.println("Invalid month");
                break;
         */




    }
}
