package JAVABatch15.class32.class8;
/*
Print the following pattern:
55555
4444
333
22
1


            for (int i = 0; i <6; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
 */

public class HW5 {
    public static void main(String[] args) {

        for(int i=5; i>=1; i--){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
