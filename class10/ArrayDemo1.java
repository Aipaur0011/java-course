package JAVABatch15.class32.class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int []arr={10,20,30,40,50};
        System.out.println(arr[1]);
        System.out.println(arr[1]+" "+arr[4]);

        for(int i=0; i<arr.length; i++){
            System.out.println(i);
        }

        System.out.println("********************");

        //Enhanced for loop
        //whenever possible use bellow loop
        for(int number:arr){
            System.out.println(number);
        }
    }
}