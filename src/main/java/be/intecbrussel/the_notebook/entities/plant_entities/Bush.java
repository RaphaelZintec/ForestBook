package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant{

    //ATTRIBUTES
    private String fruit;
    private LeafType leafType;


    //CONSTRUCTORS
    public Bush(String name) {
        super(name);
    }
    public Bush(String name, double height) {
        super(name, height);
    }


    //METHODES
    public String getFruit() {
        return fruit;
    }
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
    public LeafType getLeafType() {
        return leafType;
    }
    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }
    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

}
