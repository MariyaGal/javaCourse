package oop.home.home2.first;

public class Horse extends  Animal {
    boolean igogo;
    public Horse(String food, String location, boolean igogo) {
        super(food, location);
        this.igogo= Boolean.parseBoolean(String.valueOf(igogo));
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
