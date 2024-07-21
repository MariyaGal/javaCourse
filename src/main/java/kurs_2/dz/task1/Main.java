package kurs_2.dz.task1;

public class Main {
    public static void main(String[] args) {
        person person1 = new person();
        System.out.println(person1);

        // Создание объекта с использованием конструктора с параметрами
        person person2 = new person("Иван Иванов", 30);
        System.out.println(person2);

        person1.talk();
        person2.talk();
        person person3 = new person("Даздраперма Ивановна",  30);
        person3.move("Даздраперма Ивановна");
    }
}
