package oop.advanced.builder;


public class Triangle  {
int a;
int b;
int c;
int h;
String color;
public Triangle(){
}


    public double getSquare() {
        return 0.5*c*h;
    }


    public double getPerimeter() {
        return a+b+c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {

        return color;
    }
}
