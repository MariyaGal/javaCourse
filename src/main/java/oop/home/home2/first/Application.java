package oop.home.home2.first;


public class Application {
    public static void main(){
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("dog food", "home", true);
        animals[1] = new Cat("cat food", "home", true);
        animals[2] = new Horse("hay", "not home", true);

        for (Animal animal : animals) {
            Veterinar.treatAnimal(animal);
        }
    }
}
