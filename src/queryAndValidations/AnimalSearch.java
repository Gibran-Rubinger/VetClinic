package queryAndValidations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import animals.AnimalFactory;
import animals.Animals;
import graphical.Graphical;
import search.SearchItem;

public class AnimalSearch{

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	SearchItem where = new SearchItem();
	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));	
	AnimalFactory fac = new AnimalFactory();

	int idS = query.getBunch();
	String specie = query.getUserInput();
	
//	AnimalFactory factory = new AnimalFactory(null);

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
            	  query.GettingNumber("\n Please type the ID you looking for: ", 4);
            	Animals animalTester1 = new  Animals(idS, null, 0, null, null, null); 
            	  where.SearchAnimalById(animalTester1);
                }
              else if(query.userMultipleChoiseValidOption == 2) { 
            	  query.GettingNumber("\n Please type the Specie you looking for: ", 4);
            	 try {
					String userInput = myReader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	  where.SearchSpecies(specie);
              }
              else if(query.userMultipleChoiseValidOption == 3) { 
            	  System.out.println("\n no implemented yet");
            	  System.out.println(fac.getListOfAnimals());
              }
              else if(query.userMultipleChoiseValidOption == 4) { 
            	  System.out.println("\n no implemented yet");
              }
              
              
		} else if (query.userYesOrNoValidOption == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}
	}

}
