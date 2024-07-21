package oop.advanced.singleton;

import oop.advanced.inheritance.Rectangle;

public class Application {
    public static void main(String[] args) {
        //singleton1
        System.out.println(Config.adminLogin);
        System.out.println(Config.adminPassword);
        System.out.println(Config.baseUrl);
        System.out.println(Config.maxTime);

        //singleton2
        Rectangle r=WebDriver.getInstance();
       System.out.println(r.getSquare());
        System.out.println(r.getPerimeter());
        //singleton3
        WebDriver2.init();
        System.out.println(WebDriver2.getSquare());
    }
}
