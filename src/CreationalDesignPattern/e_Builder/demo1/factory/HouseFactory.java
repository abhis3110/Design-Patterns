package CreationalDesignPattern.e_Builder.demo1.factory;

import CreationalDesignPattern.e_Builder.demo1.builder.ConcreteHouseBuilder;
import CreationalDesignPattern.e_Builder.demo1.builder.HouseBuilder;
import CreationalDesignPattern.e_Builder.demo1.builder.IglooHouseBuilder;
import CreationalDesignPattern.e_Builder.demo1.builder.WoodenHouseBuilder;
import CreationalDesignPattern.e_Builder.demo1.director.CivilEngineer;
import CreationalDesignPattern.e_Builder.demo1.product.House;

public class HouseFactory {

    // factory pattern
    public static House getInstance(String type) {
        House house = null;
        HouseBuilder builder = null;
        if(type.equalsIgnoreCase("concrete")){
            builder = new ConcreteHouseBuilder();
        } else if(type.equalsIgnoreCase("wooden")) {
            builder = new WoodenHouseBuilder();
        } else if(type.equalsIgnoreCase("igloo")){
            builder = new IglooHouseBuilder();
        } else {
            throw new IllegalArgumentException("Invalid House Type");
        }

        // Create director object
        CivilEngineer civilEngineer = new CivilEngineer(builder);

        // Construct the house /product
        civilEngineer.constructHouse();

        house = civilEngineer.getHouse();
        return house;
    }
}
