package JAVABatch15.class32.class8;
/*
Print the following pattern:
*

*

*
**
*
**
*

 */

public class HM6 {
    public static void main(String[] args) {



        for(int i=1; i<=9; i++){

            for (int j=1; j<=1 ;j++){

                if(i<j){
                    System.out.println("**");
                }else{
                    System.out.println(" ");
                }

            }
            System.out.println("*");
        }
        System.out.println();



        }
}
