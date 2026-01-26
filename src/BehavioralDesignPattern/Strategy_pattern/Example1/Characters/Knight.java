package BehavioralDesignPattern.Strategy_pattern.Example1.Characters;

import BehavioralDesignPattern.Strategy_pattern.Example1.Weapon.AxeBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new AxeBehavior();
    }
}
