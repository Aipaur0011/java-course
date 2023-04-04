package JAVABatch15.class32.class17;
/*
1) Write a java class that will have a constructor:
one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
 */

public class HW1 {


static class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Constructor without parameters");
    }

    public Student(String name, int age) {
        System.out.println("Constructor with a String as parameter");


    }
}
}





