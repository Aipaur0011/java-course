package JAVABatch15.class32.class8;
import java.util.Scanner;
/*
Write a program that reads a range of integers (start and end point),
provided by a user and then from that range prints the sum of the even and odd integers.
 */

public class HW3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first  number");
        int start=sc.nextInt();
        System.out.println("Enter second number");
        int end=sc.nextInt();
        int even=0;
        int odd=0;

        if(start<end){
            for(int i=start; i<=end; i++){
                if(i%2==0){
                    even+=i;
                }else{
                    odd+=i;
                }
            }
            System.out.println(even);
            System.out.println(odd);

        }else{
            for(int i=start; i>=end; i--){
                if(i%2==0){
                    even+=i;
                }else{
                    odd+=i;
                }
            }
            System.out.println(even);
            System.out.println(odd);
            }







    }
}
