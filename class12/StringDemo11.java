package JAVABatch15.class32.class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. More java";

        String newStr=str.substring(5);
        System.out.println(newStr);

        //we can also specify the starting point and the end the ending point
        System.out.println(str.substring(0,27));

    }
}
