package search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class SearchItem extends AnimalFactory {

	private boolean found = false;
	private int idS = 0;
	private String animalName = "";

	protected static List<Animals> foundAnimal;
	protected static List<Animals> foundPremium;

	public SearchItem() {
		foundAnimal = new ArrayList<>();
		foundPremium = new ArrayList<>();
	}

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();

//	_____________________________________________________________________________________
//	by Id.
	public Animals SearchAnimalById(int idSearch) {
		found = false;
		for (Animals animal : listOfAnimals) {

			if (idSearch == animal.getIdAnimal()) {
				printer.typeWriter("\n Your search was successful:  \n", 50);
				System.out.println(animal);
				animal.info();
				found = true;
				return animal;
			}
		}
		if (found == false) {
			printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		}
		return null;
	}

//_______________________________________________________________________________________
//	by Species
	public Collection<Animals> SearchSpecies(String keyword) {
//		checking the all objects.
		found = false;
		for (Animals animal : listOfAnimals) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (animal.getSpecies().contains(keyword)) {
				foundAnimal.add(animal);
				found = true;
			}
		}
		if (found == true) {
			AnimalsToPrint();
		}
		if (found == false) {
			printer.typeWriter("\n sorry the animal Specie you type in was not found.  ", 50);
		}
		return null;
	}

//_______________________________________________________________________________________
//	by Name.
	public Collection<Animals> SearchName(String keyword) {
//		checking the all objects.
		found = false;
		for (Animals animal : listOfAnimals) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (animal.getName().contains(keyword)) {
				foundAnimal.add(animal);
				found = true;
			}
		}
		if (found == true) {
			AnimalsToPrint();
		} else if (found == false) {
			printer.typeWriter("\n sorry the animal name you type in was not found.  ", 50);
		}
		return null;
	}

//_______________________________________________________________________________________
//	printer.

	public void AnimalsToPrint() {
		for (Animals animalfound : foundAnimal) {
			System.out.println(animalfound);
		}
		printer.typeWriter("\n Your search was successful:  \n", 50);
//			counting the numbers of item in the Array.
		printer.typeWriter("\n The Total of Animals in the system is:  ", 50);
		System.out.println(foundAnimal.size());
		SearchInSearch();
	}

	public void PremiumToPrint() {
		for (Animals animalfound : foundPremium) {
			System.out.println(animalfound);
		}
		printer.typeWriter("\n Your search was successful:  \n", 50);
//			counting the numbers of item in the Array.
		printer.typeWriter("\n The Total of Animals in the system is:  ", 50);
		System.out.println(foundPremium.size());
		SearchInSearch();
	}
//_______________________________________________________________________________________
//	calling the previous searches inside that one.

	public void SearchInSearch() {

		query.MultipleChoise(3, "\n\nAs we have " + foundAnimal.size()
				+ " animals as a result, would you like to clarify a bit more? "
				+ "\n you know how it works right? please choose one of the options below: " + "\n\n"
				+ "             |           0 - CLOSE SEARCH:        |" + "\n\n"
				+ "             |           1 - ID:                  |" + "\n\n"
				+ "             |           2 - NAME:                |" + "\n\n"
				+ "_____________________________________________________________________________________________________________________________________________________________"
				+ "\n"
				+ "                               *   Please press the number of the type of search would you like to do   *\n",
				0, 2);

		if (query.getUserMultipleChoiseValidOption() == 0) {
			printer.typeWriter("Ok, see you later", 50);
		} else if (query.getUserMultipleChoiseValidOption() == 1) {
			query.GettingNumber("\n Please type the ID you looking for: ", "", 4);
			idS = query.getBunch();
			IdInsideSpecies(idS);
		} else if (query.getUserMultipleChoiseValidOption() == 2) {
			query.OnlyString(3, "\n Please type the name you looking for: "
					+ "\n\n  *BE AWARE* I will put some faith that you will type the species exactly as it shown in your device. otherwise no deal for you. :\n\n");
			animalName = query.getGoodToGo();
			NameInsideSpecies(animalName);
		}
	}

//	________________________________________________________________________________
//search in search id	
	public Animals IdInsideSpecies(int idSearch) {
		found = false;
		for (Animals animal : foundAnimal) {

			if (idSearch == animal.getIdAnimal()) {
				printer.typeWriter("\n Your search was successful:  \n", 50);
				System.out.println(animal);
				animal.info();
				found = true;
				return animal;
			}
		}
		if (found == false) {
			printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		}
		return null;
	}

//	________________________________________________________________________________
//	search in search name	
	public Collection<Animals> NameInsideSpecies(String keyword) {
//		checking the all objects.
		found = false;
		for (Animals animal : foundAnimal) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (animal.getName().contains(keyword)) {
				foundPremium.add(animal);
				found = true;
			}
		}
		PremiumToPrint();
		if (found == false) {
			printer.typeWriter("\n sorry the animal name you type in was not found.  ", 50);
		}
		return null;
	}

}
