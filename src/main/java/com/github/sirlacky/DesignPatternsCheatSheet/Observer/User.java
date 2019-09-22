package com.github.sirlacky.DesignPatternsCheatSheet.Observer;
//USER CLASS IMPLEMENTING OBSERVER INTERFACE
public class User implements Observer {

    private String name;
    private int videosToWatch;

    public User (String name){
        this.name = name;
        videosToWatch = 0;
    }

    @Override
    public void update() {
        videosToWatch++;
        System.out.println("Hey "+name+" there is new video for you. Total videos to watch: "+videosToWatch);
    }
}
