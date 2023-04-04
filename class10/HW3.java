package JAVABatch15.class32.class10;
/*
3) Create a 2D array of integer values. Print the sum of all numbers.
 */


public class HW3 {
    public static void main(String[] args) {

        int sum=0;
        int [] [] abc={{2 ,3 ,4 },
                       {1 ,2 ,3 },
                       {4 ,5 ,6 }
        };

        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j< abc.length ; j++) {

                sum = sum + abc[i][j];
            }
        }
        System.out.println(sum);








    }
}
