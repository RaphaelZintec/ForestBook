package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Objects;

public class Animal {

    //ATTRIBUTES
    protected String name;
    protected double weight;
    protected double height;
    protected double length;


    //CONSTRUCTORS
    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }


    //METHODES
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) { //deze methode is voor List collections om te voorkomen dat objecten met dezelfde namen worden toegevoegd
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(name, animal.name);
    }
    @Override
    public int hashCode() { //deze methode vergelijkt sneller Set collections en hulpt om sneller opslaan hash collections
        return Objects.hash(name);
    }
}
