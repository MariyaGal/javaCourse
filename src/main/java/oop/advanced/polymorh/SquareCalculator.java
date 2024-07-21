package oop.advanced.polymorh;

public class SquareCalculator {
    double squire;
    public SquareCalculator(Shape shape){
       this.squire= shape.getSquare();
    }
    public  double getSquire(){
        return squire;
    }
}
