package JAVABatch15.class32.class8;

public class NestadLoops7 {
    public static void main(String[] args) {

    /*
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
     */
        for (int i=1; i<=3; i++){ //executes the below code 3 times


            for (int j=1; j<=5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
