package JAVABatch15.class32.class11;

public class Example {
    public static void main(String[] args) {

        int [] [] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}

        };

        for(int i=0; i< matrix.length; i++){ //matrix.length tells us how many 1D Arrays are present in this 2D Array

            for(int j=0; j< matrix[i].length; j++){ //matrix[i].length the size of each 1D Array
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //white a loop to print all the elements from this 2D Array
    }
}
