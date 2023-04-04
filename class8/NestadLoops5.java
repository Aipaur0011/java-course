package JAVABatch15.class32.class8;

public class NestadLoops5 {
    public static void main(String[] args) {

        for (int i=0; i<3; i++){ //outer for loop

            if (i==1){
                System.out.println();
                continue;
            }
            for (int j=0; j<5; j++ )
                System.out.print("*" );
        }


    }
}
