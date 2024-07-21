package oop.advanced.polymorh;

//наследование
public class Rectangle extends Shape {
    int a;
    int b;
    public Rectangle(int a, int b, String color) {
        super( color);
        this.a=a;
        this.b=b;
    }



    @Override
    public double getSquare() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
}
