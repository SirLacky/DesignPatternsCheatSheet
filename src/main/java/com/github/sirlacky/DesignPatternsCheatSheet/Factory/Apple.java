package com.github.sirlacky.DesignPatternsCheatSheet.Factory;
//CHILD CLASS
public class Apple extends Fruit {

    private String color = "red";

    @Override
    public String getColor() {
        return color;
    }
}
