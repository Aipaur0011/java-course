package JAVABatch15.class32.class9;

public class ArrayDemo5 {
    public static void main(String[] args) {

        int number=10;

        int[] numbers=new int[5]; //an empty of size 5 will be created

        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=55;
        numbers[3]=60;
        numbers[4]=52;

        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
