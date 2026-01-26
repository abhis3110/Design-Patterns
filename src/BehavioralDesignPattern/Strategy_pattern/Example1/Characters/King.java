package BehavioralDesignPattern.Strategy_pattern.Example1.Characters;

import BehavioralDesignPattern.Strategy_pattern.Example1.Weapon.SwardBehavior;

public class King extends Character {
    public King() {
        weapon = new SwardBehavior(); // by default weapon
    }
}
