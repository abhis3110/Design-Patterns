package CreationalDesignPattern.e_Builder.demo1.builder;

import CreationalDesignPattern.e_Builder.demo1.product.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoofing();
    public void buildInterior();
    public House createHouse();
}
