package queryAndValidations;

import animals.AnimalFactory;
import graphical.Graphical;
import search.SearchAnimal;

public class AnimalsQuery {

	UserInteraction query = new UserInteraction();
	AnimalFactory myAnimals = new AnimalFactory();
	Graphical printer = new Graphical();
	SearchAnimal where = new SearchAnimal();

	int quantityOfAnimals = 0;

	public void AnimalsChoise() {

		query.YesOrNo(3, "\n\n\n\n Would you like to create a bunch of animals now?  \n\n Type Yes or No.");
		if (query.getUserYesOrNoValidOptio() == 1) {
			query.MultipleChoise(3,
					"\n \n Grand. \nThe animals in our database is devided in 7  sub categories written bellow: \n"
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
							+ " \n                 Yes! With this option we will mix all the categories above and generate a bunch of animals! "
							+ "\n\n"
							+ "_______________________________________________________________________________________________________________________________________________"
							+ "\n"
							+ "                               *   Please press the number of the subcategory would you like to choose   *\n",
					1, 7);
			if (query.getUserMultipleChoiseValidOption() == 1) {
				query.GettingNumber("\n\n " + "Nice. " + "\n\n COMMON PETS"
						+ "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);

				quantityOfAnimals = query.getBunch();
				myAnimals.CommonPets(quantityOfAnimals);
			}

			else if (query.getUserMultipleChoiseValidOption() == 2) {
				query.GettingNumber("\n\n " + "I like your chooice." + "\n\n BIRDS"
						+ "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);
				quantityOfAnimals = query.getBunch();
				myAnimals.Birds(quantityOfAnimals);
			} else if (query.getUserMultipleChoiseValidOption() == 3) {
				query.GettingNumber("\n\n " + "Grand." + "\n\n FISH" + "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);
				quantityOfAnimals = query.getBunch();
				myAnimals.Fish(quantityOfAnimals);
			} else if (query.getUserMultipleChoiseValidOption() == 4) {
				query.GettingNumber("\n\n " + "Don't tell everyone ...  I thik have a reptile as a pet is exotic too.."
						+ "\n\n REPTILES" + "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);
				quantityOfAnimals = query.getBunch();
				myAnimals.Reptile(quantityOfAnimals);
			} else if (query.getUserMultipleChoiseValidOption() == 5) {
				query.GettingNumber("\n\n " + "Yay. we will work outdoors to help some Animals " + "\n\n FARM"
						+ "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);
				quantityOfAnimals = query.getBunch();
				myAnimals.Farm(quantityOfAnimals);
			} else if (query.getUserMultipleChoiseValidOption() == 6) {
				query.GettingNumber("\n\n " + "Just weird people choose this option ... just saying.  " + "\n\n EXOTIC"
						+ "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);
				quantityOfAnimals = query.getBunch();
				myAnimals.Exotic(quantityOfAnimals);
			} else if (query.getUserMultipleChoiseValidOption() == 7) {
				query.GettingNumber("\n\n " + "I knew it!   You look nuts." + "\n\n CRAZY"
						+ "\n\n How many animals would you like to create?"
						+ "\n 		Please type at least 1000 animals... we are trying to keep ourselves busy here =)",
						"\n\n		 * * KEEP IN MIND the maximum number of animals to be generated will depend only on how many your device "
								+ "can deal with before it crashes >)  ... " + "\n",
						3);
				quantityOfAnimals = query.getBunch();
				myAnimals.Crazy(quantityOfAnimals);
			}

		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter("Ok, calling the next step.", 50);
		}
	}

}
