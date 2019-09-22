package com.github.sirlacky.DesignPatternsCheatSheet.Observer;
//SUBJECT INTERFACE WITH REGISTER/UNREGISTER/NOTIFY METHODS
public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
