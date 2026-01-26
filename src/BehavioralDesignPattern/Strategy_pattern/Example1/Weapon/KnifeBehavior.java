package BehavioralDesignPattern.Strategy_pattern.Example1.Weapon;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting with a Knife");
    }
}
