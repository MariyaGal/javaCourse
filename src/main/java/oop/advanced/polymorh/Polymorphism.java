package oop.advanced.polymorh;

public class Polymorphism {
public static  void main(){
    Rectangle r=new Rectangle(5,4, "green");
    Squire s=new Squire(6,"yellow");
    Triangle t=new Triangle(3,4,5,2,"white");
    SquareCalculator sc1=new SquareCalculator(r);
    SquareCalculator sc2=new SquareCalculator(s);
    SquareCalculator sc3=new SquareCalculator(t);
   System.out.println(sc1.getSquire()); ;
    System.out.println(sc2.getSquire()); ;
    System.out.println(sc3.getSquire()); ;
}
}
