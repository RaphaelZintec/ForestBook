package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant{

    //ATTRIBUTES
    private LeafType leafType;


    //CONSTRUCTORS
    public Tree(String name) {
        super(name);
    }
    public Tree(String name, double height) {
        super(name, height);
    }


    //METHODES
    public LeafType getLeafType() {
        return leafType;
    }
    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

}
