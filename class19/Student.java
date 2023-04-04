package JAVABatch15.class32.class19;
/*
Write a Student class   that have instance variables name and address.
 Create a constructor that will initialize those variables.
 Print name & address of given  student using displayInfo method.

Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed

 */

public class Student {

    String name;
    String address;

    Student(String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("My name is "+name+", and i live in "+address);
    }

    public static void main(String[] args) {

        Student student=new Student("Alexia","USA,PA,15146");


    }



}

