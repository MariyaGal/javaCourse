package oop.home.home2.first;

public class Animal {
    String  food;
    String location;
public Animal(String food, String location){
    this.food=food;
    this.location=location;
}
    public void makeNoise(){
System.out.println("Такое-то животное спит");
    }
    public void eat(){
        System.out.println("животное ест "+food);

    }
public void sleep(){
    System.out.println("животное спит ");

}

}
