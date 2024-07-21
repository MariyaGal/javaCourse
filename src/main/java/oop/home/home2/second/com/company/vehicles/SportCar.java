package oop.home.home2.second.com.company.vehicles;

import oop.home.home2.second.com.company.details.Engine;
import oop.home.home2.second.com.company.professions.Driver;

public class SportCar extends Car{
double speed;
    public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine,double speed) {
        super(marka, carClass, weight, driver, "dsf", engine);
        this.speed=speed;
    }
    @Override
    public  String toString(){
        return super.toString() + speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
