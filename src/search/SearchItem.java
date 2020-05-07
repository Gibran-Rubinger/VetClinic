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

	public void SearchAnimalById(Animals animal) {

		while (check > listOfAnimals.size()) {

			// listOfAnimals.get(check).getIdAnimal();
			if (animal.equals(listOfAnimals.get(check))) {
				printer.typeWriter("\n Your search was successful:  ", 50);
			}
			printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		}

//			
//		}
//		return null;
	}

}
