package com.company;

public class Warior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private Item[] item;

    public Warior(String name, int life, int speed, int muscle, Item[] item ){
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMuscle() {
        return muscle;
    }

    public Item[] getItem() {
        return item;
    }
}
