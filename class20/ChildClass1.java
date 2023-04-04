package JAVABatch15.class32.class20;

public class ChildClass1 extends Parent {
    public static void main(String[] args) {

       ChildClass1 ch1= new ChildClass1();
       ch1.hello();
       bye();//accessing static method in a static way by using class name
       bye();//accessing static method from the parent class using child class name
       ch1.bye();
       //ch1.money(); not available because private class


        ch1.name="Aiperi";
        lastName ="Urmanbetova";

    }

}
