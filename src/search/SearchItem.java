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
		System.out.println(listOfAnimals);
		System.out.println(listOfAnimals.get(2).getName());
		for (int i = 0; i > listOfAnimals.size();i++){
			// listOfAnimals.get(check).getIdAnimal();
			listOfAnimals.get(i).equals(animal);
				printer.typeWriter("\n Your search was successful:  ", 50);
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
