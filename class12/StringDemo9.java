package JAVABatch15.class32.class12;
//we want to count how many letters we have
public class StringDemo9 {
    public static void main(String[] args) {

        String str="ghjgj 556754567890876543 !@#$^&";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in Str "+counter);

    }
}
