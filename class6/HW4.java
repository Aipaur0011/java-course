package JAVABatch15.class32.class6;
/*
Print even numbers from 20 to 1 (2 ways)
 */

public class HW4 {
    public static void main(String[] args) {

        int num=20;
        while(num>0){


            if (num%2==0){
                System.out.println(num);
            }
            num--;

        }
        System.out.println("**********************");

        int num1=20;
        while(num1>0){

            System.out.println(num1);

            num1-=2;

        }


    }
}
