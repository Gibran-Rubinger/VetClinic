package search;

import java.util.ArrayList;

import animals.Animals;
import graphical.Graphical;

public class SearchItem {
	
	Animals animal = new Animals() {
	};
	
	Graphical printer = new Graphical();
	
	int idResults = -1;
	
	public void SearchAnimalById(ArrayList<Animals> listOfAnimals, int idSearch ) {

//			for loop to check the all list 
			for(int i = 0; i < listOfAnimals.size(); i++) {
//				if statement to identify the position where the item is storage on the list.
				if(listOfAnimals.contains(idSearch)) {
					idResults = i;
				}
			}
//     if client type a inexistent Id.		
		
		
		if( idResults == -1) {
			printer.typeWriter("Sorry the id: ", 35);
			System.out.print(idSearch);
			printer.typeWriter(" do not mach with any one in the system.", 35);	
		}
		else {
			printer.typeWriter(" Your search was sucessfull: ", 35);
			System.out.println(listOfAnimals.indexOf(idResults));
		}
	}
}

