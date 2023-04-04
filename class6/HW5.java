package JAVABatch15.class32.class6;
/*
Print odd numbers between 20 and 50 (2 ways)
 */

public class HW5 {
    public static void main(String[] args) {

        int num=20;
        while(num<50){

          if(num%2!=0){

              System.out.println(num);
          }
            num++;
        }

        System.out.println("*******************");

        int num1=21;
        while(num1<50){

            System.out.println(num1);

            num1+=2;
        }
    }
}
