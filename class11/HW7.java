package JAVABatch15.class32.class11;
/*
Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.
 */

public class HW7 {
    public static void main(String[] args) {

        int[][]num={{3,6,8,2},{2,5,6,4},{4,8,5,9}};

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}
