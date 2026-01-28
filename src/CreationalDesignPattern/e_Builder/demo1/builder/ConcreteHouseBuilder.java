package CreationalDesignPattern.e_Builder.demo1.builder;

import CreationalDesignPattern.e_Builder.demo1.product.*;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        System.out.println("ConcreteHouseBuilder:0-param constructor");
        house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("ConcreteHouseBuilder.buildBasement()");
        house.setBasement(new ConcreteBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("ConcreteHouseBuilder.buildBasement()");
        house.setStructure(new ConcreteStructure());
    }

    @Override
    public void buildRoofing() {
        System.out.println("ConcreteHouseBuilder.buildRoofing()");
        house.setRoofing(new ConcreteRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("ConcreteHouseBuilder.buildInterior()");
        house.setInterior(new GlassInterior());
    }

    @Override
    public House createHouse() {
        System.out.println("ConcreteHouseBuilder.createHouse()");
        return house;
    }
}
