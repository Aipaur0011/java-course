package JAVABatch15.class32.class10;
/*
5)Create a 2D array of integers.
 Develop a program which will calculate the sum of  even and odd numbers for that array.
 */

public class HW5 {
    public static void main(String[] args) {

        int sum1=0;
        int sum2=0;

        int [][] abc={{23 ,34 ,25, 37},
                {17 ,43 ,25 ,49},
                {34, 39, 23, 15}
        };

        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (abc[i][j] % 2 == 0) {
                    sum1 = abc[i][j];
                } else {
                    sum2 = abc[i][j];
                }
            }
        }

                System.out.println("Even numbers " + sum1);
                System.out.println("Odd numbers " + sum2);

    }
}
