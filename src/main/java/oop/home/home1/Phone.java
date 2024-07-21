package oop.home.home1;

import java.util.Scanner;

public class Phone {
    Scanner scanner;
    private String number;
    private String model;
    private int weight;


    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("", "", Integer.parseInt(""));
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " +name);
    }


    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {

            System.out.print(STR."\{number} ");

    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("89161234567", "iPhone", 100);
        Phone phone2 = new Phone("89161234568", "Samsung");
        Phone phone3 = new Phone();




        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);



        phone1.receiveCall("Алексей");
        phone2.receiveCall("Мария");
        phone3.receiveCall("Анна");
        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println("Номер телефона 3: " + phone3.getNumber());
        phone1.sendMessage("89161234567", "89161234568", "89161234569");
    }
}