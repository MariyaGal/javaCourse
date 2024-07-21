package oop.pizza;

public class PizzaBuilder {
    
   public Pizza pizza= new Pizza();


    public PizzaBuilder setDiameter(int diameter) {
pizza.setDiameter(diameter);

        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        pizza.addIngredient(sauce, 1);
        return this;
    }

    public PizzaBuilder setCheese(String    cheese) {
        pizza.addIngredient(cheese, 2);
        return this;
    }

    public PizzaBuilder setSausage(String sausage) {
        pizza.addIngredient(sausage, 3);
        return this;
    }

    public PizzaBuilder setTomato(String tomato) {
        pizza.addIngredient(tomato, 3);
        return this;
    }

    public PizzaBuilder setMushrooms(String mushrooms) {
        pizza.addIngredient(mushrooms, 3);
        return this;
    }

    public PizzaBuilder setPineapple(boolean pineapple) {
        pizza.addIngredient("ананас", 3);
        return this;
    }



    public Pizza build() {
        return pizza;
    }
}
