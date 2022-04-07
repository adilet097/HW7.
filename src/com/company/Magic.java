package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic применил суперспособность " + superAbilityType);
        System.out.println("Magic применил суперспособность full impact ");
    }
}
