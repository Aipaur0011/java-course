package JAVABatch15.class32.class19;

public class Furniture {

    String type;
    double price;
    String color;

    //with the help of construstor we can initialize object with specific value

    Furniture(String type, double price, String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }

    void print(){
        System.out.println(type+"price is  "+price+" and color is "+color);
    }
}
