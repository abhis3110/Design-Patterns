package BehavioralDesignPattern.Strategy_pattern.Example1;

import BehavioralDesignPattern.Strategy_pattern.Example1.Characters.Character;
import BehavioralDesignPattern.Strategy_pattern.Example1.Characters.King;
import BehavioralDesignPattern.Strategy_pattern.Example1.Weapon.BowAndArrowBehavior;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Character king = new King();
        king.fight(); // fight with default weapon

        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight(); // fight with new weapon changed at run time
    }
}
