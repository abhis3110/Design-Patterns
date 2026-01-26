package BehavioralDesignPattern.Strategy_pattern.Example1.Weapon;

public class SwardBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Swinging a sward");
    }
}
