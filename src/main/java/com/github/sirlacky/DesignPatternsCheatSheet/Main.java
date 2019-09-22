package com.github.sirlacky.DesignPatternsCheatSheet;

import com.github.sirlacky.DesignPatternsCheatSheet.Builder.Drink;
import com.github.sirlacky.DesignPatternsCheatSheet.Factory.Factory;
import com.github.sirlacky.DesignPatternsCheatSheet.Observer.Channel;
import com.github.sirlacky.DesignPatternsCheatSheet.Observer.User;
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

        /*Factory v. simple - example
        <=================================================>*/
        Factory factory = new Factory();
        System.out.println(factory.giveFruit("red").getClass().getName());    //Apple object
        System.out.println(factory.giveFruit("yellow").getClass().getName()); //Lemon object

        /*Builder v. fluent - example
        <=================================================>*/
        Drink drink = new Drink.Builder("Mohito") //requied final field from constructor
                .volume(500)
                .price(10.5)
                .build();
        System.out.println(drink.getName() + " " + drink.getNumber() + "ml, price: " + drink.getPrice());

        /*Observer - testing
        <=================================================>*/
        Channel channel = new Channel();

        User user = new User("SirLacky");
        channel.register(user); //User subscribes Channel
        channel.publishNewVideo(); //Channel publishing new video (total 1)
        channel.publishNewVideo(); //Channel publishing another video (total 2)

    }
}
