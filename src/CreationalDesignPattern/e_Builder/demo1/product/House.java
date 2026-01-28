package CreationalDesignPattern.e_Builder.demo1.product;

public class House {

    private Basement basement;
    private Structure structure;
    private Roofing roofing;
    private Interior interior;

    // setters and getters (only setters are also useful)
    public void setBasement(Basement basement) {
        this.basement = basement;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public void setRoofing(Roofing roofing) {
        this.roofing = roofing;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    // get house object

}
