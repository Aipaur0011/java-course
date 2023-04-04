package JAVABatch15.class32.class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

        // 10 20 30 45 50

        int [] numbers={10,20,30,45,50};
        //white code to add all numbers from on array

        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
        }
}
