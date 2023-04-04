package JAVABatch15.class32.class10;
/*
4) Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.
 */

public class HW4 {
    public static void main(String[] args) {

        int[][] abc = {{5, 7, 8},
                {4, 5, 16},
                {3, 4, 9}
        };

        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (abc[i][j] % 2 == 0) {

                    System.out.println(abc[i][j]);
                }
            }
        }
    }
}