package com.company;

public class Enemy {
    public String name;
    public int hp;
    public int damage;
    public int armor;

    public Enemy(String name, int hp, int damage, int armor) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    public void getInfo() {
        System.out.println("Имя врага - " + this.name);
        System.out.println("Здоровье = " + this.hp);
        System.out.println("Урон врага = " + this.damage);
        System.out.println("Уровень брони врага = " + this.armor);
        System.out.println("");
    }
}
