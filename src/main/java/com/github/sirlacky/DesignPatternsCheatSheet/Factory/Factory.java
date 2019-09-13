package com.github.sirlacky.DesignPatternsCheatSheet.Factory;
/**
 Pros:
 - Allows loose-coupling,
 - Easy to extend,
 - Hides creation of object from user, returns working object,
 Cons:
 - Overused?
 */

//FACTORY CLASS responsible for choosing which object to create
public class Factory {

    public Fruit giveFruit(String color) {
        Fruit fruit;

        if (color.equals("red")) {
            fruit = new Apple();
        } else if (color.equals("yellow")) {
            fruit = new Lemon();
        } else {
            fruit = new Fruit();
        }
        return fruit;
    }
}
