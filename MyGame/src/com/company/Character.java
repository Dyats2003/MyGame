package com.company;

public class Character {
    public String name;
    public int hp;
    public int xp;
    public int level;
    public int damage;
    public int armor;

    public Character(String name, int hp, int xp, int level, int damage, int armor) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.level = level;
        this.damage = damage;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void tryWeapon(int levelWeapon) {
        if (level >= levelWeapon) {
            System.out.println("Это оружие для тебя, герой!");
        } else {
            System.out.println("Попридержи коней, сынок. Тебе ещё надо поучиться!");
        }
    }
}
