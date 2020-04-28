package queryAndValidations;

import animals.AnimalFactory;
import graphical.Graphical;
import search.SearchItem;

public class AnimalsQuery {

	UserInteraction query = new UserInteraction();
	AnimalFactory myAnimals = new AnimalFactory();
	Graphical printer = new Graphical();
	SearchItem where = new SearchItem();
	int quantityOfAnimals = 0;
	public void AnimalsChoise() {
		query.YesOrNo(3, "\n\n\n\n Would you like to create a bunch of animals now?  \n\n type Yes or No.");
		if (query.userYesOrNoValidOption == 1) {
			query.MultipleChoise(3,
					"\n \n Grand. \nThe animals in our database is devided in 6  sub categories written bellow: \n"
							+ "           \n 1 - COMMON PETZ: " + "\n"
							+ "             |    DOGS       |       CATS         |       DOMESTIC PIG     |        RABBIT     |     HAMISTER     |        GUINEA PIG        |"
							+ "\n" + "    \n 2 - BIRDS: " + "\n"
							+ "             |   COKCATIEL   |    GOUDIAN FINCH   |         PARROT         |      COCKATOO     |     BUDGERIGAR   |           DOVE           |"
							+ "\n" + "    \n 3 - FISH: " + "\n"
							+ "             |   OSCAR       |     NEON TRETA     |         GUPPIES        |       DISCUS      |      BETTA       |          GOLDFISH        |"
							+ "\n" + "    \n 4 - REPILES: " + "\n"
							+ "             |  WATER DRAGON |      CHAMELEON     |   GREEN TREE PYTHON    |    BALL PYTHON    |      IGUANA      |    EASTERN BOX TURTLE    |"
							+ "\n" + "    \n 5 - FARM: " + "\n"
							+ "             |       OX      |         HORSE      |          SHEEP         |       GOAT        |       PONY       |           DONKEY         |"
							+ "\n" + "    \n 6 - EXOTIC: " + "\n"
							+ "             |  PACMAN FROG  |   GREEN TREE FROG  |  COBALT BLUE TARANTULA | CHILE ROSE SPIDER | EMPEROR SCORPION |   HETEROMETRUS SCORPION  |"
							+ "" + "\n" + "\n 7 - CRAZY:" + "\n"
							+ " \n                 yes! with this option we will mix all the categories above and generate a bunch of animals! "
							+ "\n\n"
							+ "_______________________________________________________________________________________________________________________________________________"
							+ "\n"
							+ "                               *   Please press the number of the sub category would you like to chosee   *\n",1,7);
			if (query.userMultipleChoiseValidOption == 1) {
				query.GettingNumber("\n\n " + "Nice. " + "\n\n COMMON PETS"
						+ "\n\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.CommonPets(quantityOfAnimals);
			}

			else if (query.userMultipleChoiseValidOption == 2) {
				query.GettingNumber("\n\n " + "I like your choise." + "\n\n BIRDS"
						+ "\n\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.Birds(quantityOfAnimals);
			} else if (query.userMultipleChoiseValidOption == 3) {
				query.GettingNumber("\n\n " + "Grand." + "\n\n FISH"
						+ "\n\n how many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.Fish(quantityOfAnimals);
			} else if (query.userMultipleChoiseValidOption == 4) {
				query.GettingNumber("\n\n " + "Dont tell for everyone ...  I thik have a reptile as pet is exotic to.."
						+ "\n\n REPTILES"
						+ "\n\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.Reptile(quantityOfAnimals);
			} else if (query.userMultipleChoiseValidOption == 5) {
				query.GettingNumber("\n\n " + "Yay. we will wokr outdoors to helps some Animals " + "\n\n FARM"
						+ "\n\n how many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.Farm(quantityOfAnimals);
			} else if (query.userMultipleChoiseValidOption == 6) {
				query.GettingNumber("\n\n " + "Just weird people chose this option ... just saying.  " + "\n\n EXOTIC"
						+ "\n\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.Exotic(quantityOfAnimals);
			} else if (query.userMultipleChoiseValidOption == 7) {
				query.GettingNumber("\n\n " + "I knew it!   you looks nuts." + "\n\n CRAZY"
						+ "\n\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		please type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... " + "\n", 3);
				 quantityOfAnimals = query.getBunch();
				myAnimals.Crazy(quantityOfAnimals);
			} 
			
		} else if (query.userYesOrNoValidOption == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}
	}

	
}
