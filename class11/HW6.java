package JAVABatch15.class32.class11;
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
 */

public class HW6 {
    public static void main(String[] args) {
        int [][] num={{2,4,6},
                {3,5,7},
                {3,6,9,}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num[i].length; j++) {
                System.out.println(num[i][j]);
            }
        }
        System.out.println();


    }

}
