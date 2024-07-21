package oop.home.home2.second.com.company.vehicles;

import oop.home.home2.second.com.company.details.Engine;
import oop.home.home2.second.com.company.professions.Driver;

public class Lorry extends Car {
    int carrying;
    public Lorry(String marka, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, weight, driver, "dsf", engine);
        this.carrying = carrying;
    }

    // Метод toString для вывода информации о грузовике
    @Override
    public String toString() {
        return super.toString() + carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}

