package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    //ATTRIBUTES
    private double area;


    //CONSTRUCTORS
    public Weed(String name) {
        super(name);
    }
    public Weed(String name, double height) {
        super(name, height);
    }


    //METHODES
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

}
