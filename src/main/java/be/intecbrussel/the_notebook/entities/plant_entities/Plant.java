package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Plant {

    //ATTRIBUTES
    protected String name;
    protected double height;


    //CONSTRUCTORS
    public Plant(String name){
        this.name = name;
    }
    public Plant(String name, double height){
        this.name = name;
        this.height = height;
    }


    //METHODES
    public String getName(){ return name;}
    public double getHeight(){ return height;}
    public void setHeight(double height){
        this.height=height;
    }

    @Override
    public boolean equals(Object o) { //deze methode is voor List collections om te voorkomen dat objecten met dezelfde namen worden toegevoegd
        if (!(o instanceof Plant plant)) return false;
        return Objects.equals(name, plant.name);
    }
    @Override
    public int hashCode() { //deze methode vergelijkt sneller Set collections en hulpt om sneller opslaan hash collections
        return Objects.hash(name);
    }

}
