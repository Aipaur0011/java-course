package JAVABatch15.class32.class8;

public class NestadLoops9 {
    public static void main(String[] args) {

    /* 0 1 2 3 4 5
     0 2 4 6 8 10
     0 3 6 9 12 15
     */


        /*for (int i = 0; i <=5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

            for (int j = 0; j <=5; j++) {
                System.out.print(2*j+" ");
            }
            System.out.println();

            for (int l=0; l<=5; l++){
                System.out.print(3*l+ " ");
            }
        System.out.println();*/
        for (int i=0; i<=3; i++){
            for (int j=0; j<=5; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }






    }
}
