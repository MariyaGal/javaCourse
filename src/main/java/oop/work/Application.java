package oop.work;

public class Application {
    public static void main(String[] args) {
        Reader student1 = new Reader("Гальцова Мария Сергеевна");
        student1.takeBook();

        student1.takeBook(1);
        student1.takeBook(2);
        student1.takeBook(4);
        student1.takeBook(5);
        student1.takeBook(9);
        student1.takeBook(10);
        student1.takeBook(19);
        student1.takeBook(20);
        student1.takeBook(21);

        student1.takeBook(new String[]{"словарь", "энциклопедия"});






    }
}
