package oop.home.home2.second.com.company;

import oop.home.home2.second.com.company.details.Engine;
import oop.home.home2.second.com.company.professions.Driver;
import oop.home.home2.second.com.company.vehicles.Car;

public class Applications {
    public static void main(String[] args) {

 System.out.println(Engine.toString("лада"));

        Driver darya = new Driver();
        Engine audi = new Engine();
        Car car = new Car("mazda",  "audi", 10, darya, "dsf", audi);
 System.out.println(car);
 car.setEngine(audi);

 car.setCar("mazda", "audi", 10, darya, "", audi);
 System.out.println(car);
 car.setEngine(audi);







    }

}
