package CreationalDesignPattern.e_Builder.demo1.test;

import CreationalDesignPattern.e_Builder.demo1.factory.HouseFactory;
import CreationalDesignPattern.e_Builder.demo1.product.House;

public class BuilderDPTest {
    public static void main(String[] args) {
        // get Product/House using the factory
//        House house = HouseFactory.getInstance("igloo");
//        System.out.println(house);
        System.out.println("--------------------");
        House house = HouseFactory.getInstance("concrete");
        System.out.println(house);
    }
}
