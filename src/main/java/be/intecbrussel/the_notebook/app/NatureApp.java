package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {
    public static void main(String[] args) {
        ForestNoteBook bosOntdekkingNotes = new ForestNoteBook();

        //minimum 5 planten en 9 dieren
            //DIEREN
            bosOntdekkingNotes.addAnimal(new Omnivore("Ours"));
            bosOntdekkingNotes.addAnimal(new Omnivore("Ecureuil"));
            bosOntdekkingNotes.addAnimal(new Omnivore("Raton laveur"));

            bosOntdekkingNotes.addAnimal(new Carnivore("Loup"));
            bosOntdekkingNotes.addAnimal(new Carnivore("Lynx"));
            bosOntdekkingNotes.addAnimal(new Carnivore("Renard"));

            bosOntdekkingNotes.addAnimal(new Herbivore("Sanglier"));
            bosOntdekkingNotes.addAnimal(new Herbivore("Cerf"));
            bosOntdekkingNotes.addAnimal(new Herbivore("Lapin"));

            //PLANTEN

        //roep methodes
        bosOntdekkingNotes.printNoteBook();
    }
}
