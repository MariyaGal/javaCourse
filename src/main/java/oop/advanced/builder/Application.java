package oop.advanced.builder;

public class Application {
    public static void main(String[] args) {
        Triangle  t = new TriangeBuilder()
        .setA(1)
        .setB(2)
        .setC(3)
        .setH(4)
        .setColor("green")
                .build()
                ;
      System.out.println(t.getPerimeter());


      Triangle abT=TriangleDirect.getEquilateralTriangle(1);
      Triangle adcT=TriangleDirect.getIsoscelesTriangle(2);
      Triangle blackT=TriangleDirect.getBlackTriangle();

      System.out.println(abT.getPerimeter());
      System.out.println(adcT.getPerimeter());
      System.out.println(blackT.getColor());

    }


}
