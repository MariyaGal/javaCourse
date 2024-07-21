package basics;


import basic.car.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasicsTest {
    @Test
    void simpleTest(){
        Car car = new Car();
        car.color="GREEN";
        System.out.println(car.color);

assertEquals("GREEN",car.color);
    }
}
