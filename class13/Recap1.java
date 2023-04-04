package JAVABatch15.class32.class13;

public class Recap1 {
    public static void main(String[] args) {
        String str="Java is great";

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)); //charAt()=>method it is int output is a char
        }

        //count how many times the letter 'a' has appeared in the above String

        int count=0;
        for (int j = 0; j <str.length() ; j++) {
            if(str.charAt(j)=='a'){
                count++;
            }
        }
        System.out.println("Letters 'a' has appeared "+count+" Many times");

    }
}
