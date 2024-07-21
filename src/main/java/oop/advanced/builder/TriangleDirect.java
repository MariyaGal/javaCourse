package oop.advanced.builder;

public class TriangleDirect {
   public static  Triangle getIsoscelesTriangle(int measure){
       return new TriangeBuilder()
               .setA(measure)
               .setB(measure)
               .setC(5)
               .setH(4)
               .build();

   }
    public static  Triangle getEquilateralTriangle(int measure){
        return new TriangeBuilder()
                .setA(measure)
                .setB(measure)
                .setC(measure)
                .setH(4)
                .build();

    }
    public static  Triangle getBlackTriangle(){
        return new TriangeBuilder()
                .setA(3)
                .setB(4)
                .setC(5)
                .setH(4)
                .setColor("black")
                .build();

    }


}
