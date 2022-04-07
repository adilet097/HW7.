package com.company;

public class Main {


    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new Medic();
        HavingSuperAbility[] array = {warrior,magic,magic};
        for (int  i= 0; i < array.length; i++) {
            array[i].applySuperAbility(("CRITICAL ATTACK"));

            Hero[] heroes = {warrior,magic,medic};
            for (i = 0; i < heroes.length; i++) {
                heroes[i].applySuperAbility("SuperHit");

            }

        }
    }
}
