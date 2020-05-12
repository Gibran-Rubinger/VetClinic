package search;


import java.util.ArrayList;
import java.util.Collection;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class SearchItem extends AnimalFactory {

	Animals animal;
	int check = 0;

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	
	
	
	public Animals SearchAnimalById(int idSearch) {
//		for(Animals print: listOfAnimals) {
//			System.out.println(print);
//		}
		for (Animals animal : listOfAnimals){
			
			if (idSearch == animal.getIdAnimal()){
				printer.typeWriter("\n Your search was successful:  \n", 50);
				System.out.println(animal);
				animal.info();
				return animal;
				
			}
		}
		printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		return null;
	}
	ArrayList<Animals> foundSpecie = new ArrayList<>(); 
	public Collection<Animals> SearchSpecies(String keyword) {
//		checking the all objects.
		for (Animals animal : listOfAnimals) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (animal.getSpecies().contains(keyword) ) {
				foundSpecie.add(animal);
				printer.typeWriter("\n Your search was successful:  \n", 50);
				for (Animals animalfound : foundSpecie) {
				System.out.println(animalfound);	
				}
//				counting the numbers of item in the Array.
				printer.typeWriter("\n" + "The Total of Animals in the system is:  ", 50);
				System.out.println(foundSpecie.size());
				return foundSpecie;
			}
		}
		printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		return null;
	}


}
