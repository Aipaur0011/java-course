package JAVABatch15.class32.class23;
/*
Create a Class Student that will have 3 subclasses as
SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override
same of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */

public class Student {
    public void study() {
        System.out.println("studying");
    }

    public void practice() {
        System.out.println("practice the skills");
    }

    public  void homeWork() {
        System.out.println("solving homeworks");

    }
}

    class SyntaxStudent extends Student{
        @Override
        public void study() {
            System.out.println("Syntax students must study Programming ");
        }

        @Override
        public void practice() {
            System.out.println("Syntax students must solve Repls");
        }

        @Override
        public void homeWork() {
            System.out.println("Syntax students must solve home works before class");
        }
    }

    class CollegeStudent extends  Student{

        @Override
        public void study() {
            System.out.println("College students must study ");
        }

        @Override
        public void practice() {
            System.out.println("College students do more practice");
        }

        @Override
        public void homeWork() {
            System.out.println("College students must solve all home works");
        }
    }

    class SchoolStudent extends Student{

        @Override
        public void study() {
            System.out.println("School students must do study");
        }

        @Override
        public void practice() {
            System.out.println("School students must do more practice ");
        }

        @Override
        public void homeWork() {
            System.out.println("School students must do all homeworks");
        }
    }

