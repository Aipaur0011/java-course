package JAVABatch15.class32.class13;

public class ReplaceDemo2 {
    public static void main(String[] args) {
        String str="kFJVKjfvfbv6547635!@#$%^&";

        //replaces All upper case letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        //replaces All lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        //replace numbers from 0-9
        System.out.println(str.replaceAll("[0-9]","#"));
        //replace All upper case letters from A to Z and replaces All lower case letters from a to z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //replace numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // not replace use =>  "^"
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
    }
}
