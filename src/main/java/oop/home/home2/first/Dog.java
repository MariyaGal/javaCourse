package oop.home.home2.first;

public class Dog extends  Animal{
    boolean bark;
    public Dog(String food, String location, boolean bark){
        super(food, location);
this.bark= Boolean.parseBoolean(String.valueOf(bark));
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }
}
