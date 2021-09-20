package com.company;

public class Weapon {
    public String name;
    public int level;
    public int damage;
    public int price;

    public Weapon(String name, int level, int damage, int price) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Название оружия - " + this.name);
        System.out.println("Уровень оружия = " + this.level);
        System.out.println("Урон оружия = " + this.damage);
        System.out.println("Цена оружия = " + this.price);
        System.out.println("");
    }
}
