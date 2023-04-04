package JAVABatch15.class32.class10;
/*
9)Maximum and minimum number in the array?
 */

public class HW9 {
    public static void main(String[] args) {


        int [] arr = new int [] {2,6,9,13,36};

        int min = arr[0];
        int max=arr[0];


        for (int i = 0; i < arr.length; i++) {

            if(arr[i] <min) {
                min = arr[i];
                System.out.println("The minimum value is  " + min);
            }else{
                System.out.println("The maximum value is "+max);
            }
            System.out.println();




        }

    }
}
