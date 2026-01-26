package BehavioralDesignPattern.Strategy_pattern.Example1.Characters;

import BehavioralDesignPattern.Strategy_pattern.Example1.Weapon.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon; // character using weapon

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }

    public void fight() {
        weapon.useWeapon();
    }
}
