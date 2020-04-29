package search;

import java.util.ArrayList;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class SearchItem {

	Animals animal = new Animals() {
	};

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	AnimalFactory born = new AnimalFactory();

	int idSearch = 0;
	boolean found = false;

	
	public void SearchAnimalById() {

		ArrayList<Animals> idResults = new ArrayList<>();

		query.GettingNumber("Please type the ID you looking for: ", 4);
		idSearch = query.getBunch();
		 //			for loop to check the all list 
		for(int i = 0; i < born.getListOfAnimals().size(); i++) {
		
			if(born.getListOfAnimals().get(i).equals(idSearch)) {  
				idResults.add(i, animal);
			}
		}
//		for (Animals id : idResults) {
//			if (id.equals(idSearch)) {
//				found = true;
//				printer.typeWriter("\n" + "\n Successfully search: \n", 50);
//				System.out.println(id);
//			}
//
//			else if (found = false) {
//				printer.typeWriter("\n Unfortunately, your item was not found: \n", 50);
//			}
//		}

	}

}
