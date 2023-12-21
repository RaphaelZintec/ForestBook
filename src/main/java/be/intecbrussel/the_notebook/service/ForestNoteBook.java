package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {

    //ATTRIBUTES
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();


    //CONSTRUCTORS
    public ForestNoteBook(){
    }


    //METHODES
    public List<Carnivore> getCarnivores() {
        return carnivores;
    }
    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }
    public List<Omnivore> getOmnivores() {
        return omnivores;
    }
    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }
    public List<Herbivore> getHerbivores() {
        return herbivores;
    }
    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }
    public int getPlantCount() {
        return plantCount;
    }
    public int getAnimalCount() {
        return animalCount;
    }
    public void addAnimal(Animal animal){ //toevoeg dier in animals list + list van zijn type bij een control

        if (animals.stream().noneMatch(a->a.getName().equals(animal.getName()))){
            animals.add(animal);
            ++animalCount;
            //controleer
            if (animal instanceof Carnivore)
                carnivores.add((Carnivore) animal);
            else if (animal instanceof Omnivore)
                omnivores.add((Omnivore) animal);
            else if (animal instanceof Herbivore)
                herbivores.add((Herbivore) animal);
        }
    }
    public void addPlant(Plant plant){
        if (plants.stream().noneMatch(a->a.getName().equals(plant.getName()))){
            plants.add(plant);
            ++plantCount;
        }
    }
    public void printNoteBook(){
        System.out.println("Dieren");
        animals.forEach(System.out::println);
        System.out.println("\tPlanten");
        plants.forEach(System.out::println);
    }
    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }
    public void sortPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));
    }
    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight));
    }
    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));
    }


}
