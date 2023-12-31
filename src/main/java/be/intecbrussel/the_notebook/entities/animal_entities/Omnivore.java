package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal{

    //ATTRIBUTES
    private Set<Plant> plantDiet;
    private double maxFoodSize;


    //CONSTRUCTORS
    public Omnivore(String name) {
        super(name);
    }
    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }


    //METHODES
    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }
    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }
    public double getMaxFoodSize() {
        return maxFoodSize;
    }
    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }
    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

}
