
import java.io.BufferedReader;

import animals.*;
import graphical.*;
import queryAndValidations.*;

//above are being import the super classes that it will be used in the code.
public class Main {

//	this is the constructor that will call the objects (methods)	
	public static void main(String[] args) {

		Graphical printer = new Graphical();

//		Main Screen is being printed using the setMenssage() and the effect of type writer, and the timer delay, is setting by typeWriter()
//		printer.setMessage();	
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
		AnimalsData myAnimals = new AnimalsData();

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
							+ " yes! with this option we will mix all the categories above and generate a bunch of animals! "
							+ "\n\n"
							+ "Please press the number of the sub category would you like to chosee:\n");
			if (query.userMultipleChoiseValidOption == 1) {
				 myAnimals.addAnimal();
			}
			
		} else if (query.userYesOrNoValidOption == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}

	}
}
