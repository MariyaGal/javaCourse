package oop.pizza;

import java.util.HashMap;

public class Pizza {
    int diameter;
    HashMap<String, Integer> ingredients = new HashMap<>();


    public void printRecipe() {
        int counter = 1;
        System.out.println(counter + "взять основу" + diameter);

        if (ingredients.containsValue(1)) {
            counter++;
            int finalCounter = counter;
            ingredients.keySet().forEach(key -> {
                if (ingredients.get(key) == 1) {
                    System.out.println(STR."\{finalCounter}добавить соус\{key}");
                }
            });

        }

        for (String key : ingredients.keySet()) {
            if (ingredients.get(key) == 2) {
                counter++;
                System.out.println(STR."\{counter}добавить ингредиент\{key}");

            }


            System.out.println(STR."\{counter}выпекать в духовке");

        }



    }
    public void addIngredient (String name, int priority){
        ingredients.put(name, priority);


    }
    public void setDiameter ( int diameter){
        this.diameter = diameter;
    }

}
