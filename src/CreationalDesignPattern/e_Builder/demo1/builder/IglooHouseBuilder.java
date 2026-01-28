package CreationalDesignPattern.e_Builder.demo1.builder;

import CreationalDesignPattern.e_Builder.demo1.product.*;

public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder(House house) {
        System.out.println("IglooHouseBuilder:1-param constructor");
        this.house = house;
    }

    @Override
    public void buildBasement() {
        System.out.println("IglooHouseBuilder.buildBasement()");
        house.setBasement(new IceBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("IglooHouseBuilder.buildBasement()");
        house.setStructure(new IceStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("IglooHouseBuilder.buildRoofing()");
        house.setRoofing(new IceRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("IglooHouseBuilder.buildInterior()");
        house.setInterior(new IceCurvingInterior());
    }

    @Override
    public House createHouse() {
        System.out.println("IglooHouseBuilder.createHouse()");
        return house;
    }
}
