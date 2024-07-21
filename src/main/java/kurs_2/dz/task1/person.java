package kurs_2.dz.task1;

public class person {
    String fullName;
    int age;

    public person() {
        this.fullName = "Такой-то";
        this.age = 18;
    }

    public person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move(String Name){
        System.out.println(STR."\{Name} Person "+" говорит");
    }

    void talk() {
        System.out.println(STR."\{this.fullName} Person "+" говорит");

    }
}
