package queryAndValidations;

import graphical.Graphical;
import search.SearchAnimal;

public class AnimalSearch {

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	SearchAnimal where = new SearchAnimal();


	private int idS = 0;
	private String specie = "";
	private String animalName = "";

//	AnimalFactory factory = new AnimalFactory(null);

	public void SearchAnimals() {
		query.YesOrNo(4, "\n\n\n Would you like to search for an espesifc type of data?  \n\n type Yes or No.");
// chose a option
		if (query.getUserYesOrNoValidOptio() == 1) {
			query.MultipleChoise(3, "\n \n Grand. \nPlease chose the type of searh written bellow: \n"
					+ "           \n 1 - ID: " + "\n\n"
					+ "             |                  If you have the animal ID already you can just type the number.                                                             |"
					+ "\n" + "    \n\n 2 - SPECIE: " + "\n\n"
					+ "             |                  Here you can search for a specif species and will return all the animals in the list from the species you chose.            |"
					+ "\n" + "    \n\n 3 - NAME: " + "\n\n"
					+ "             |                  Here you can search for a specif name and will return all the animals in the list with the same name you chose.             |"
					+ "\n\n"
					+ "_____________________________________________________________________________________________________________________________________________________________"
					+ "\n"
					+ "                               *   Please press the number of the type of search would you like to do   *\n",
					1, 3);

			if (query.getUserMultipleChoiseValidOption() == 1) {
				query.GettingNumber("\n Please type the ID you looking for: ", "", 4);
				idS = query.getBunch();
				where.SearchAnimalById(idS);
			} else if (query.getUserMultipleChoiseValidOption() == 2) {
//            	  would be possible implement a method similar to YesOrNo and check all the species names to case sensitive BUT we don't afford the time to do it. 
				query.OnlyString(3, "\n Please type the Specie you looking for: "
						+ "\n\n  *BE AWARE* I will put some faith that you will type the species exactly as it shown in your device. otherwise no deal for you. :\n\n");
				specie = query.getGoodToGo();
				where.SearchSpecies(specie);
			} else if (query.getUserMultipleChoiseValidOption() == 3) {
				query.OnlyString(3, "\n Please type the name you looking for: "
						+ "\n\n  *BE AWARE* I will put some faith that you will type the species exactly as it shown in your device. otherwise no deal for you. :\n\n");
				animalName = query.getGoodToGo();
				where.SearchName(animalName);

			} else if (query.getUserYesOrNoValidOptio() == 0) {
				printer.typeWriter("Ok, see you later", 50);
			}
		}
	}
}
