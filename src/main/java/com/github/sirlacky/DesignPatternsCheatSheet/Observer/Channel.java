package com.github.sirlacky.DesignPatternsCheatSheet.Observer;

import java.util.ArrayList;

public class Channel implements Subject {

    private ArrayList<Observer> observers;

    public Channel(){
        observers = new ArrayList<>();
    }

    public void publishNewVideo(){
        System.out.println("Publishing new video");
        notifyObserver();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update();
        }
    }
}
