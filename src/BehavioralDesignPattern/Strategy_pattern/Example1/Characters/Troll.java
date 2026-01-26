package BehavioralDesignPattern.Strategy_pattern.Example1.Characters;

import BehavioralDesignPattern.Strategy_pattern.Example1.Weapon.KnifeBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new KnifeBehavior();
    }
}
