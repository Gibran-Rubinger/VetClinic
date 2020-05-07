package search;

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

		for (int i = 0; i > listOfAnimals.size();i++) {
			// listOfAnimals.get(check).getIdAnimal();
			listOfAnimals.get(i).equals(animal);
				printer.typeWriter("\n Your search was successful:  ", 50);
			return listOfAnimals.get(i);	
		}
		printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		return null;
	}

}
