package queryAndValidations;




import graphical.Graphical;
import search.SearchItem;

public class AnimalSearch {

	int idS = 0;

	Graphical printer = new Graphical();

	UserInteraction query = new UserInteraction();

	SearchItem where = new SearchItem();


	

	public void SearchAnimals() {
		query.YesOrNo(4, "\n\n\n\n Would you like to search for an espesifc type of data?  \n\n type Yes or No.");
// chose a option
		if (query.userYesOrNoValidOption == 1) {
			query.MultipleChoise(3,
					"\n \n Grand. \nPlease chose the type of searh written bellow: \n"
							+ "           \n 1 - ID: " + "\n\n"
							+ "             |                  If you have the animal ID already you can just type the number.                                                             |"
							+ "\n" + "    \n\n 2 - SPECIE: " + "\n\n"
							+ "             |                  Here you can search for a specif species and will return all the animals in the list from the species you chose.            |"
							+ "\n" + "    \n\n 3 - NAME: " + "\n\n"
							+ "             |                  Here you can search for a specif name and will return all the animals in the list with the same name you chose.             |"
							+ "\n" + "    \n 4 - OWNER: " + "\n"
							+ "             |                  Here you can search for a specif first name or surname and will return all the animals with the same owner name.            |"
							+ "\n\n"
							+ "_____________________________________________________________________________________________________________________________________________________________"
							+ "\n"
							+ "                               *   Please press the number of the type of search would you like to do   *\n",1,4);
			
			
              if(query.userMultipleChoiseValidOption == 1) {
            	  where.SearchAnimalById();
                }
              else if(query.userMultipleChoiseValidOption == 2) { 
            	  System.out.println("no implemented yet");
              }
              else if(query.userMultipleChoiseValidOption == 3) { 
            	  System.out.println("no implemented yet");
              }
              else if(query.userMultipleChoiseValidOption == 4) { 
            	  System.out.println("no implemented yet");
              }
              
              
		} else if (query.userYesOrNoValidOption == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}
	}


}
