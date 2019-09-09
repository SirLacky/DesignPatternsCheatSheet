package com.github.sirlacky.DesignPatternsCheatSheet.Singleton;
/**
Pros:
 - Resorces friendly
 - Easy to implement with builder pattern
Cons:
  - Hard to test
  - Breaks Single Responsibility Principle (two tasks: class own logic and instance controlling)
  - Breaks Open-Close Principle unless implemented with Builder pattern.
*/
public class Singleton {

    //private static Singleton field
    private static Singleton instance = null;
    //rest of class fields (public)
    public String name;

    //private empty constructor
    private Singleton(){
        }
        //Method to check if object was already created.
        public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
        }
}
