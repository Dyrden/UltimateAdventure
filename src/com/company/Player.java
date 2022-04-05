package com.company;

public class Player {

    private double life;
    private double totalDamage;
    private boolean poisoned;






    public Player(double life) {
        double baseDamage = 1;
        this.life = life;
        this.poisoned = false;
    }











    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }
}
