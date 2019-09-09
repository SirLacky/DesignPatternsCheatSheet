package com.github.sirlacky.DesignPatternsCheatSheet;

import com.github.sirlacky.DesignPatternsCheatSheet.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        /*Singleton creation
        <=================================================>*/
        Singleton singleton = Singleton.getInstance();
        singleton.name = "This is Singleton";
        System.out.println(singleton.name);

        /*Singleton testing
        <=================================================>*/
        Singleton singleton1 = Singleton.getInstance();
        singleton1.name = "Singleton 2";
        System.out.println(singleton1.name);
        System.out.println(singleton.name);


    }
}
