package JAVABatch15.class32.class9;
/*
Create an array of words: Java, Saturday, day, coding, is.
 Print the following sentence using elements of array: “Saturday is Java coding Day”.
 */

public class HW3 {
    public static void main(String[] args) {

        String [] words={"Java", "Saturday", "day", "coding", "is"};
        for(int i=4; i< words.length; i++){
            System.out.println(words[1]+ words[4]+ words[0]+ words[3]+ words[2]);
        }

        System.out.println("########################################################");

        String [] words1= new String[5];

        words[0]="Java";
        words[1]="Saturday";
        words[2]="day";
        words[3]="coding";
        words[4]="is";

        System.out.println(words[1]+ words[4]+ words[0]+ words[3]+ words[2]);

    }
}
