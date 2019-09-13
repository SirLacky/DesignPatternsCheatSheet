package com.github.sirlacky.DesignPatternsCheatSheet.Factory;
//CHILD CLASS
public class Lemon extends Fruit{

    private String color = "yellow";

    @Override
    public String getColor() {
        return color;
    }
}
