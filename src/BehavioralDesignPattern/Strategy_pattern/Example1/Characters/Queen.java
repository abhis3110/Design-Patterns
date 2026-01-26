package BehavioralDesignPattern.Strategy_pattern.Example1.Characters;

import BehavioralDesignPattern.Strategy_pattern.Example1.Weapon.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
