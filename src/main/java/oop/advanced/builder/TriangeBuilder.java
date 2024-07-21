package oop.advanced.builder;

public class TriangeBuilder {
    Triangle triangle = new Triangle();

    public TriangeBuilder setA(int a) {
        triangle.setA(a);
        return this;
    }

    public TriangeBuilder setB(int b) {
        triangle.setB(b);
        return this;
    }

    public TriangeBuilder setC(int c) {
        triangle.setC(c);
        return this;
    }

    public TriangeBuilder setH(int h) {
        triangle.setH(h);
        return this;
    }

    public TriangeBuilder setColor(String color) {
        triangle.setColor(color);
        return this;
    }
    public Triangle build(){
        return triangle;
    }
}
