package JAVABatch15.class32.class13;
/*
How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */

public class HW4 {
    public static void main(String[] args) {

        String sent="This is sentence i want to reverse";

        String[] words = sent.split(" ");
        String revString = "";

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";

            for(int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            revString = revString + revWord + " ";
        }

        System.out.println(revString);


        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for(String word:arr){
            for (int i =word.length()-1 ; i >=0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }


        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }


        /*String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");


        for(String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }*/

    }

}
