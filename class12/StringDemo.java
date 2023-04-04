package JAVABatch15.class32.class12;

public class StringDemo {
    public static void main(String[] args) {

        //Creating an object of the String class
        String strobj2 =new String ("Java");
        // another way of creating an object of String class a shorter way
        // mostly this is how we create the objects of String class
        System.out.println(strobj2.length());
        String str = "Banana ";
        int len = str.length();
        System.out.println(len);
        String name = "Rafik";
        if (name.length() > 10) {
            System.out.println("Name can't be more than 10 letters");

        }
    }
}
