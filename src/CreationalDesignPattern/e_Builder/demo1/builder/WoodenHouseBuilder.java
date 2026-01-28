package CreationalDesignPattern.e_Builder.demo1.builder;

import CreationalDesignPattern.e_Builder.demo1.product.*;

public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder(House house) {
        System.out.println("WoodenHouseBuilder:1-param constructor");
        this.house = house;
    }

    @Override
    public void buildBasement() {
        System.out.println("WoodenHouseBuilder.buildBasement()");
        house.setBasement(new WoodenBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("WoodenHouseBuilder.buildStructure()");
        house.setStructure(new WoodenStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("WoodenHouseBuilder.buildRoofing()");
        house.setRoofing(new WoodenRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("WoodenHouseBuilder.buildInterior()");
        house.setInterior(new WoodenInterior());
    }

    @Override
    public House createHouse() {
        System.out.println("WoodenHouseBuilder.createHouse()");
        return house;
    }
}
