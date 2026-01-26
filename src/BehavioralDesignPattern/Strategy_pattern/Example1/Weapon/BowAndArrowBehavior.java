package BehavioralDesignPattern.Strategy_pattern.Example1.Weapon;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Shooting and arrow with Bow");
    }
}
