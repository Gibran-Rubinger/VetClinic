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
	

	public Animals SearchAnimalById(Animals animal) {
		for (Animals id : listOfAnimals){
			// listOfAnimals.get(check).getIdAnimal();
			if (animal.equals(id)){
				printer.typeWriter("\n Your search was successful:  ", 50);
				return animal;
			}
				
			return listOfAnimals.get(i);	
		}
		printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		return null;
	}
	ArrayList<Animals> foundSpecie = new ArrayList<>(); 
	public Collection<Animals> SearchSpecies(String keyword) {
//		checking the all objects.
		for (int i = 0; i < listOfAnimals.size(); i++) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (listOfAnimals.get(i).getSpecies().contains(keyword) ) {
				foundSpecie.add(listOfAnimals.get(i));
				printer.typeWriter("\n Your search was successful:  ", 50);
				return foundSpecie;
			}
		}
		printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		return null;
	}


}
