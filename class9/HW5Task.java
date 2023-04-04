package JAVABatch15.class32.class9;
/*
Create an array of size 5 on integers and calculate the sum of all elements in an array.
 */

public class HW5Task {
    public static void main(String[] args) {

        int [] num=new int[5];

        num[0]=23;
        num[1]=32;
        num[2]=12;
        num[3]=43;
        num[4]=76;
        int sum=0;

        for(int i=0; i< num.length; i++){
            sum=sum+num[i];
        }
        System.out.println(sum);

    }
}
