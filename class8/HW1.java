package JAVABatch15.class32.class8;
/*
print numbers from 1 to 50 those that are divisible by 3
 */
public class HW1 {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++){

            if(i%3==0){
                continue; //skip

            }else{
                System.out.print(i+ " ");
            }
        }



    }
}
