import animals.*;
import graphical.*;
import queryAndValidations.*;

//above are being import the super classes that it will be used in the code.
public class Main {

//	this is the constructor that will call the objects (methods)	
	public static void main(String[] args) {

		Graphical printer = new Graphical();

//		Main Screen is being printed tipeWriter() and the effect of type writer, and the timer delay, is setting by typeWriter()
	
		printer.typeWriter(
				"##############################################################################################################################################################################\r\n"
						+ "##############################################################################################################################################################################\r\n"
						+ "################################################################################################################################,,,,,,,,,,####################################\r\n"
						+ "#########################################################################################################################,,,,,,,,,,,,,,,,,,,,,,,,#############################\r\n"
						+ "#####################################################################################################################,,,,,,                    ,,,,,,#########################\r\n"
						+ "################       ############       ##                  .#                        ##########################,,,,,                            ,,,,,######################\r\n"
						+ "#################      ###########       ###                  .#                        ########################,,,,                                  ,,,,####################\r\n"
						+ "##################      #########       ####      #######################      ###############################,,,,             .,,       .,,            ,,,,##################\r\n"
						+ "###################      #######       #####      #######################      ##############################,,,            ,,,   ,,,,,,,   ,,,           ,,,#################\r\n"
						+ "###################       ######      ######      ************###########      #############################,,,            ,,       .,,       ,,           ,,,################\r\n"
						+ "####################       ####      #######                  ###########      ############################,,,       .,,,,,,,        ,        ,,,,,,,       ,,,###############\r\n"
						+ "#####################      ###      ########      #######################      ############################,,,      ,,       ,,     ,,,     .,      ,,,     ,,,###############\r\n"
						+ "######################      #      #########      #######################      ############################,,,      ,,        ,,,,,,,,,,,,,,         ,,     .,,,##############\r\n"
						+ "#######################     ,     ##########      #######################      ############################,,,      ,,,       ,,          .,.       ,,.      ,,,##############\r\n"
						+ "########################         ###########                   ##########      ############################,,,        ,,,,,,,,              ,,,,,,,,,       ,,,###############\r\n"
						+ "#########################,,,,,,,,###########,,,,,,,,,,,,,,,,,,,##########,,,,,,############################,,,.            .,,               ,,             ,,,###############\r\n"
						+ "############################################################################################################,,,             ,,              .,,            ,,,################\r\n"
						+ "##########################        ######     ###########     ###      ######    ###*   *#######        ######,,,.            ,,.   ,,,,,   ,,,            ,,,#################\r\n"
						+ "#######################     .*/,     ###     ###########     ###       #####    ###*   *####     .*/,     ####,,,,             ....     ...             ,,,,##################\r\n"
						+ "######################     ######     ##     ###########     ###        ####    ###*   *###     ######     #####,,,,                                  ,,,,####################\r\n"
						+ "#####################     ##############     ###########     ###    #     ##    ###*   *##     ####################,,,,                            ,,,,,######################\r\n"
						+ "#####################     ##############     ###########     ###    ##     #    ###*   *##     ######################,,,,,,                    ,,,,,,#########################\r\n"
						+ "######################     ######     ##     ###########     ###    ####        ###*   *###     ######     ##############,,,,,,,,,,,,,,,,,,,,,,,,,,###########################\r\n"
						+ "#######################              ###              ##     ###    #####       ###*   *####             ##########################,,,,#######################################\r\n"
						+ "########################### ,.,  ############################################################### ,.,  ########################################################################\r\n"
						+ "##############################################################################################################################################################################\r\n"
						+ "##############################################################################################################################################################################\r\n"
						+ "######################################################################################################    DEVELOPED BY:    CAROLINA SACCO   &   GIBRAN RUBINGER  -  2020 V.1.0\r\n"
						+ "",
				1);

//		Standard effect for any interaction with the client.  
		// printer.setMessage("\n\n\n\n would you like to create a bunch of animals now?
		// \n\n type Yes or No.");
		// printer.typeWriter(null, 50);

		UserInteraction query = new UserInteraction();
		AnimalFactory myAnimals = new AnimalFactory();

		query.YesOrNo(3, "\n\n\n\n Would you like to create a bunch of animals now?  \n\n type Yes or No.");
		
		// AnimalsData myAnimals = new AnimalsData();

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
							+ "                               *   Please press the number of the sub category would you like to chosee   *\n");
			if (query.userMultipleChoiseValidOption == 1) {
				query.GettingNumber("\n\n "
						+ "Nice. "
						+ "\n COMMON PETS"
						+ "\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				 myAnimals.CommonPets(quantityOfAnimals);
			}
			
			else if (query.userMultipleChoiseValidOption == 2) {
				query.GettingNumber("\n\n "
						+ "I like your choise."
						+ "\n BIRDS"
						+ "\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				myAnimals.Birds(quantityOfAnimals);
			}
			else if (query.userMultipleChoiseValidOption == 3) {
				query.GettingNumber("\n\n "
						+ "Grand."
						+ "\n FISH"
						+ "\n how many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				myAnimals.Fish(quantityOfAnimals);
			}
			else if (query.userMultipleChoiseValidOption == 4) {
				query.GettingNumber("\n\n "
						+ "Dont tell for everyone ...  I thik have a reptile as pet is exotic to.."
						+ "\n REPTILES"
						+ "\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				myAnimals.Reptile(quantityOfAnimals);
			}
			else if (query.userMultipleChoiseValidOption == 5) {
				query.GettingNumber("\n\n "
						+ "Yay. we will wokr outdoors to helps some Animals "
						+ "\n FARM"
						+ "\n how many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				myAnimals.Farm(quantityOfAnimals);
			}
			else if (query.userMultipleChoiseValidOption == 6) {
				query.GettingNumber("\n\n "
						+ "Just weird people chose this option ... just saying.  "
						+ "\n EXOTIC"
						+ "\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				myAnimals.Exotic(quantityOfAnimals);
			}
			else if (query.userMultipleChoiseValidOption == 7) {
				query.GettingNumber("\n\n "
						+ "I knew it!   you looks nuts."
						+ "\n CRAZY"
						+ "\n How many Animals would you like to create? You can type any value would you like but"
						+ "\n 		I would you aks to you to type at least 1000 animals.. we are trying to keep ourself busy here =)"
						+ "\n\n		 * * KEEP IN MIND. the maximun number of animals we can create here will dependes only how many your device "
						+ "can deal before crash >)  ... "
						+ "\n", 3);
				int quantityOfAnimals = query.getBunch();
				myAnimals.Crazy(quantityOfAnimals);
			}
			else if (query.userMultipleChoiseValidOption == 8) {
				printer.typeWriter("Sorry  but 8 is not a valid option at moment", 40);	
			}
			else if (query.userMultipleChoiseValidOption == 9) {
				printer.typeWriter("Sorry  but 8 is not a valid option at moment", 40);	
			}
		} else if (query.userYesOrNoValidOption == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}

	}
}
