package JAVABatch15.class32.class8;

public class ContinueKeywordDemo {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){

            if(i%3==0){
                continue; //skip

            }else{
                System.out.println(i);
            }
        }
    }
}
