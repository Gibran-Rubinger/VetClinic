package search;


import java.util.ArrayList;
import java.util.Collection;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class SearchItem extends AnimalFactory {


 	private boolean found = true;
 	private int idS = 0;
 	private String animalName = "";

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
//	_____________________________________________________________________________________
//	by Id.
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
	
	ArrayList<Animals> foundAnimal = new ArrayList<>(); 
//_______________________________________________________________________________________
//	by Species
	public Collection<Animals> SearchSpecies(String keyword) {
//		checking the all objects.
		for (Animals animal : listOfAnimals) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (animal.getSpecies().contains(keyword) ) {
				foundAnimal.add(animal);
				found = true;
			}
		}
		
		AnimalsToPrint();
		if(found == false) {
			printer.typeWriter("\n sorry the animal Specie you type in was not found.  ", 50);
		}
		return null;
	}
	
//_______________________________________________________________________________________
//	by Name.
	public Collection<Animals> SearchName(String keyword) {
//		checking the all objects.
		for (Animals animal : listOfAnimals) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (animal.getName().contains(keyword) ) {
				foundAnimal.add(animal);
				found = true;
			}
		}
		
		AnimalsToPrint();
		if(found == false) {
			printer.typeWriter("\n sorry the animal name you type in was not found.  ", 50);
		}
		return null;
	}


	
//_______________________________________________________________________________________
//	printer.
	
	public  void AnimalsToPrint() {
		for (Animals animalfound : foundAnimal) {
			System.out.println(animalfound);	
			}
		printer.typeWriter("\n Your search was successful:  \n", 50);
//			counting the numbers of item in the Array.
			printer.typeWriter("\n The Total of Animals in the system is:  ", 50);
			System.out.println(foundAnimal.size());
			SearchInSearch();
	}
//_______________________________________________________________________________________
//	calling the previous searches inside that one.

	public void SearchInSearch() {
		
					query.MultipleChoise(3, "\n\nAs we have "+ foundAnimal.size() +" animals as a result, would you like to clarify a bit more? "
							+ "\n you know how it works right? please choose one of the options below: "
						    + "\n\n"
							+ "             |           0 - CLOSE SEARCH:        |"
							+ "\n\n"
							+ "             |           1 - ID:                  |"
							+ "\n\n"
							+ "             |           2 - NAME:                |"
							+ "\n\n"
							+ "_____________________________________________________________________________________________________________________________________________________________"
							+ "\n"
							+ "                               *   Please press the number of the type of search would you like to do   *\n",
							0, 2);
				
					if (query.getUserMultipleChoiseValidOption() == 0) {
						printer.typeWriter("Ok, see you later", 50);
					}else if (query.getUserMultipleChoiseValidOption() == 1) {
						query.GettingNumber("\n Please type the ID you looking for: ", "", 4);
						idS = query.getBunch();	
						SearchAnimalById(idS);	
					}else if (query.getUserMultipleChoiseValidOption() == 2) {
						query.OnlyString(3, "\n Please type the name you looking for: "
								+ "\n\n  *BE AWARE* I will put some faith that you will type the species exactly as it shown in your device. otherwise no deal for you. :\n\n");
						animalName = query.getGoodToGo();
						SearchName(animalName);
					}
	}
}
