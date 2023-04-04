package JAVABatch15.class32.class13;
/*
You have a String a=”Is it saturday?
Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?
 */

public class HW3 {
    public static void main(String[] args) {
        String sent="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr=sent.split("[.?!]");
        System.out.println(strArr.length);


        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[2]);
    }

}
