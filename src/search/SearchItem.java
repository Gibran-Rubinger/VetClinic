package search;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class SearchItem extends AnimalFactory {

	Animals animal;
	

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	
	

	public Animals SearchAnimalById(Animals animal, int idSearch) {
		
		if (idSearch != 0) {
			for (Animals id : listOfAnimals) {
				if (id.getIdAnimal() == idSearch) {
					printer.typeWriter("\n Your search was successfull:  ", 50);
					System.out.println(id);
					return id;
				}
			}
		} else {
			printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		}
		return null;
	}

}
