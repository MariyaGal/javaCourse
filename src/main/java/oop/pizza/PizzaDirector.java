package oop.pizza;

public class PizzaDirector {
    public static Pizza getMargarita(int diameter) {
        return new PizzaBuilder()
                .setSauce("томатный")
                .setTomato("обычные")
                .setCheese("пармезан")
                .setDiameter(diameter)
                .build();
    }


//
    void getHavaii() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.setSauce("сливочный")
                .setTomato("черри")
                .setCheese("моцарелла")
                .setDiameter(30)
                .build();

    }
}
