package JAVABatch15.class32.class21;

public class Animal {
    String name;
    String color="Black";

    }
    class Cat extends Animal{
        int age=10;
        double weight;

        void printColor(){
            System.out.println(color);
            System.out.println(this.color);
            System.out.println(super.color);

        }
    }






