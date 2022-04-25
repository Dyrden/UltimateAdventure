package com.company;

public class Player {

    private double life;
    private double totalDamage;
    private boolean poisoned;
    private int speed;
    private Room currentRoom;


    public Player(double life, int speed) {
        double baseDamage = 1;
        this.life = life;
        this.speed = speed;
        this.poisoned = false;
    }


    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }


    public void move(String direction) {
        Room roomToGoTo = null;



    }
}
