package JAVABatch15.class32.class20;
/*
1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle.
 Test your code

 */

public class Shape {

    double radius;
    Shape (double radius){
        this.radius=radius;
    }

    void print (){
        System.out.println("Radius is "+radius);
    }


    static class Circle extends Shape{
        Circle(double radius){
            super(radius);
        }

        public double getArea() {
            double area=Math.PI*super.radius*super.radius;
            return area;
        }


    }
}
class Test{
    public static void main(String[] args) {

        Shape shape=new Shape(3.7);
        shape.print();

        Shape.Circle c= new Shape.Circle(2.5);
        c.getArea();

        System.out.println("Aria of the circle is "+c.getArea());
    }
}
