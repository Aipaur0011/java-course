package JAVABatch15.class32.class9;
//Create an array and store 10,20,30,4,5,6,7,80 add all the
// elements which are multiple of 2

public class ArrayDemo7 {
    public static void main(String[] args) {

        int [] numbers={10,20,30,4,5,6,7,80};
        int sum=0;

        for(int i=0; i< numbers.length; i++) {

            if(numbers[i]%2==0){
                sum = sum + numbers[i];
            }

            }
            System.out.println(sum);


       /* int sum=0;
        int[] numbers=new int[5];

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=80;

        for(int i=0; i>numbers.length; i++){
            System.out.println(numbers[i]);
        }*/



        }
}

