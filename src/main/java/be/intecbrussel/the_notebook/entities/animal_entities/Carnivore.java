package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    //ATTRIBUTES
    private double maxFoodSize;


    //CONSTRUCTORS
    public Carnivore(String name) {
        super(name);
    }
    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    //METHODES
    public double getMaxFoodSize() {
        return maxFoodSize;
    }
    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

}
