package search;

import java.util.List;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class SearchItem extends AnimalFactory {

	Animals animal;

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();

	
	
	
	public Animals SearchAnimalById(int idSearch){
		
		
		 //			for loop to check the all list.
		for(Animals id : listOfAnimals) {
			
			if(id.hashCode(idSearch)) {
				 printer.typeWriter("\n Your search was sucefull:  ", 50);
				 System.out.println(id);
				 return id;
				
			}
		}
		printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		return null;
		

	}

}
