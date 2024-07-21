package basics;


import basic.car.Car;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestsLifecycle extends BaseTest{



    @Test
    void simpleTest(){
        Car car = new Car();
        car.color="GREEN";
        System.out.println(car.color);

assertEquals("GREEN",car.color);
    }
    @Test
    void simpleTest2(){
        assertTrue(true);
    }
}
