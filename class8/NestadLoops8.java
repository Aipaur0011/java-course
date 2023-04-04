package JAVABatch15.class32.class8;

public class NestadLoops8 {
    public static void main(String[] args) {

    /* 0 1 2 3 4 5
     1 2 3 4 5
     2 3 4 5
     */

        /*for(int i=0; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int j=1; j<=5; j++){
            System.out.print(j+" ");
        }
        System.out.println();

        for(int l=2; l<=5; l++){
            System.out.print(l+ " ");
        }
        System.out.println();*/

        for (int i = 0; i <6; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}
