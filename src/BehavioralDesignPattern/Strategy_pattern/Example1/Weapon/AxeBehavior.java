package BehavioralDesignPattern.Strategy_pattern.Example1.Weapon;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
