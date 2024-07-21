package oop.home.home2.first;

public class Cat extends  Animal{
    boolean meow;


    public Cat(String food, String location, boolean meow) {
        super(food, location);
        this.meow= Boolean.parseBoolean(String.valueOf(meow));
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
