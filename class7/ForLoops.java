package JAVABatch15.class32.class7;

public class ForLoops {
    public static void main(String[] args) {

        /*
        prints number from 0 to 9
         */
        int number=0;// creating a variable ot type int
        while(number<10){ //checks the condition if condition is true execute the code in the body of while loop
            System.out.println(number);// prints the value of number on the console
            number++; // it adds one to the number variable

        }
        /*
        initialize; condition; increment or decrement
         */
        System.out.println("*********************");

        /*for (int i=0;i<10;i++){
            System.out.println(i);*/

            System.out.println("****************");

            for(int i=1; i<20;i=+2){
                System.out.println(i);
            }
        System.out.println("&&&&&&&&&&&&&");

            for(int I=0; I<20; I++){
                if(I%2!=0){
                    System.out.println(I);
                    I++;
                }
            }


        }





}
