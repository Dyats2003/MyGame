package com.company;

import java.awt.*;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random random=new Random();
        Weapon[] arsenal=new Weapon[10];
        Enemy[] enemyArmy=new Enemy[10];
        String[] nameWeapon=new String[]{"Топор", "Лук", "Меч", "Копьё"};
        String[] nameEnemy=new String[]{"Орк", "Бандит", "Гоблин", "Демон"};
        for (int i=0; i<10; i++)
        {
            arsenal[i]=new Weapon(nameWeapon[random.nextInt(3)], random.nextInt(10), random.nextInt(10), random.nextInt(100));
            enemyArmy[i]=new Enemy(nameEnemy[random.nextInt(3)], random.nextInt(10), random.nextInt(10), random.nextInt(10));
        }
        for (Weapon item : arsenal)
        {
            item.getInfo();
        }
        for (Enemy item : enemyArmy)
        {
            item.getInfo();
        }
    }
}
