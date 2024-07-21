package oop.pizza;

public class Application {
 public static void main(String[] args){
     Pizza pizza = PizzaDirector.getMargarita(30);
     pizza.printRecipe();


 }
}
