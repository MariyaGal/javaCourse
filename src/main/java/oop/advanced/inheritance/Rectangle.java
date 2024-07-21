package oop.advanced.inheritance;
//наследование
public class Rectangle extends Shape {
    int a;
    int b;
    public Rectangle(int a, int b, int cornersCount, String color) {
        super(cornersCount, color);
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
