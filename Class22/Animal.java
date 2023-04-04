package JAVABatch15.class32.Class22;

public class Animal {

        String name;
        String color;
        int age;
        double weigh;

        void speak(){
            System.out.println("Speaking");
        }
        void eat(){
            System.out.println("Eating");
        }
    }class Cat extends Animal{
        // we are overriding speak method in Cat class
        void eat(){
            super.speak();
            System.out.println("Meow ...Meow....");
        }
        void printName(){
            System.out.println(name);
        }
    }
    class Dog extends Animal{

    }
    class Horse extends Animal{

    }
    class Tester{
        public static void main(String[] args) {
            Cat cat=new Cat();

        }
    }

