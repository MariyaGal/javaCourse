package oop.home.home2.second.com.company.vehicles;

import oop.home.home2.second.com.company.details.Engine;
import oop.home.home2.second.com.company.professions.Driver;

public class Car {
    String marka;
    static String carClass;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String marka, String carClass, int weight, Driver driver, String dsf, Engine engine) {
        this.marka=marka;
        this.carClass=carClass;
        this.weight=weight;
        this.driver=driver;
        this.engine=engine;

    }

    


    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public String toString(){
        return STR."Марка: \{marka}, модель: \{carClass}, вес: \{weight}, водитель: \{driver}, мотор: \{engine}";

    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public static void setCarClass(String carClass) {
        Car.carClass = carClass;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCar(String mazda, String audi, int i, Driver darya, String s, Engine audi1) {
    }
}
