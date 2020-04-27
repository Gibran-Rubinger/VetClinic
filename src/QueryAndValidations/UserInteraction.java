package queryAndValidations;

import java.util.Scanner;

import exceptions.CustomExceptions;
import graphical.*;

public class UserInteraction {
//	Attributes
	String userInput = "";
	protected int userInputInt = 0;

//	This attribute is responsible for validation the algorithm. Initialising the with a key value.
	public int userYesOrNoValidOption = 1000;
	public int userMultipleChoiseValidOption = 1000;
//	This attribute is responsible to count the numbers of attempts left to trigger the bug message.

	boolean bugRunning = true;

	int countdown = 0;
	int display = 0;
	int bunch = 0;

//	Those are the pool of valid options typing for the client. 
	String validAnswer1 = "yes";
	String validAnswer2 = "Y";
	String validAnswer3 = "no";
	String validAnswer4 = "n";

//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();

//	instantiate of Scanner.
	Scanner myScanner = new Scanner(System.in);

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void YesOrNo(int attempt, String text) {
		countdown = attempt;
		display = attempt;
//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text, 50);

		do {
			try {
//		Assign the attribute userInput with the client typing.
				userInput = myScanner.next();

//		before to start the for loop, count down and display are being created and evaluated with the same number of attempt defined in the main method.
				countdown = attempt;
				display = attempt;

//		in this for loop the client will be inform when will be the last attempt. if the numbers of attempt is exceed the bug message is trigger.

//          		check if  the client choose yes.									
				if (validAnswer1.equalsIgnoreCase(userInput) || validAnswer2.equalsIgnoreCase(userInput)) {
					userYesOrNoValidOption = 1;
					bugRunning = false;
				}
//                  check if if the client choose no.
//					No case sensitive
				else if (validAnswer3.equalsIgnoreCase(userInput) || validAnswer4.equalsIgnoreCase(userInput)) {
					userYesOrNoValidOption = 0;
					bugRunning = false;
				}
				else {
					throw new CustomExceptions();
				}
//					in this part start to count how many left attempts has.
			}catch (Exception e) {
				Bug(text, attempt);
			}

		} while (bugRunning == true);

	}

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void MultipleChoise(int attempt, String text, int starN, int endN) {
		countdown = attempt;
		display = attempt;
		printer.typeWriter(text, 1);

//		Assign the attribute userInput with the client typing.
		do {
			try {
				userInputInt = Integer.parseInt(myScanner.next());
//				in this statement we throw a custom error  to keep valid only the options chosen in the parameter StarN endN.
				if (userInputInt < starN || userInputInt > endN) {
					bugRunning = false;
					throw new CustomExceptions();
				}
//  			check if  the client choose yes.								
				else if (userInputInt == 0) {
					userMultipleChoiseValidOption = 0;
					bugRunning = false;

				} else if (userInputInt == 1) {
					userMultipleChoiseValidOption = 1;
					bugRunning = false;

				} else if (userInputInt == 2) {
					userMultipleChoiseValidOption = 2;
					bugRunning = false;

				} else if (userInputInt == 3) {
					userMultipleChoiseValidOption = 3;
					bugRunning = false;

				} else if (userInputInt == 4) {
					userMultipleChoiseValidOption = 4;
					bugRunning = false;

				} else if (userInputInt == 5) {
					userMultipleChoiseValidOption = 5;
					bugRunning = false;

				} else if (userInputInt == 6) {
					userMultipleChoiseValidOption = 6;
					bugRunning = false;

				} else if (userInputInt == 7) {
					userMultipleChoiseValidOption = 7;
					bugRunning = false;

				} else if (userInputInt == 8) {
					userMultipleChoiseValidOption = 8;
					bugRunning = false;

				} else if (userInputInt == 9) {
					userMultipleChoiseValidOption = 9;
					bugRunning = false;
				}
//			    Increasing the bug count.	
			}

//		calling the bug message.
			catch (CustomExceptions e) {
//				System.out.println(e.getMessage());
				Bug(text, attempt);
			} catch (Exception e) {

				Bug(text, attempt);
//								
			}
		} while (bugRunning == true);
	}

	public int GettingNumber(String text, int attempt) {

		countdown = attempt;
		display = attempt;
//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text, 50);

//		Assign the attribute userInput with the client typing.
		do {
			try {
				userInputInt = Integer.parseInt(myScanner.next());
				if (userInputInt != 0) {
					bunch = userInputInt;
					bugRunning = false;
				}
			}
//			calling the bug message.
			catch (Exception e) {

				Bug(text, attempt);
			}
		} while (bugRunning == true);
//		closing the Scanner.
		myScanner.close();
		return bunch;
	}

	public void Bug(String text, int attempt) {
		printer.typeWriter(
				"Sorry, I can not understand what you type in. Please follow the menu guidelines and type a valid option",
				60);
		for (int i = 0; i < attempt; i++) {

			display--;
			countdown--;

			if (countdown > 1) {
				printer.typeWriter("\n\n Warnning this is not a valid option! You have " + display + "  attempts left.",
						20);
				printer.typeWriter(
						"\n_______________________________________________________________________________________________________________________________________________",
						1);
				printer.typeWriter(text, 1);
				bugRunning = true;
				break;
			} else if (countdown == 1) {
				printer.typeWriter("\n\n Warnning this is not a valid option! This is your * LAST *  attempts left.",
						60);
				printer.typeWriter("\n\n so, how you decide if we will continue execute the program  or not?", 1);
				printer.typeWriter(
						"\n_______________________________________________________________________________________________________________________________________________",
						1);
				printer.typeWriter(text, 1);
				bugRunning = true;
				break;
			} else if (countdown == 0) {
				bugRunning = false;
				printer.typeWriter("\r\n"
						+ "                                                                                                                                                                              \r\n"
						+ "                                                                                                                                                  @(    @*                    \r\n"
						+ "                                                                                                                                              @&            @&                \r\n"
						+ "                                                                                                                                            @@               @@&              \r\n"
						+ "                                                                                                                                           @@@                @@@             \r\n"
						+ "                                                                                                                                          &@@@  @@@@@@@@@@@. /@@@             \r\n"
						+ "    @@@@@@@@@.   @@.@@@,@@@     @@@@,,@@@%     %@@@@@./@@@      @@ @@@#@@@               @@         %@@  .@@%        @@                   %@@@@             @@@@@             \r\n"
						+ "    @@           @@.     (@@    @@      @@    @@         @@&    @@      @@              @@         #@#     &@%      @@                 @@@@@@@@@@@,      %@@@@@@@@@@@         \r\n"
						+ "    @@@@@@@@&    @@*,,,%@@*     @@,,,/@@@    @@#          @@    @@,.,*@@@              @@   @@     @@       @@     @@   @@          .@@@%     .@@@@@   &@@@@#     ,@@@@       \r\n"
						+ "    @@           @@.  %@@/      @@   @@@     &@@          @@    @@   @@@              @@    @@     @@       @@    @@    @@         /@*     @@@    @#    @.   /@@      @@      \r\n"
						+ "    @@           @@.    (@@     @@     @@*    @@#        @@*    @@     @@&           @@@@@@@@@@@   *@@     @@(   @@@@@@@@@@@       @        @@@    /@@@@     @@@       &/     \r\n"
						+ "    @@@@@@@@@&   @@.     .@@    @@      @@&     @@@@&@@@@#      @@      &@@                 @@       @@@&@@@            @@         @         @@@@   @@@@  *@@@.         ,     \r\n"
						+ "                                                                                                                                               .@  #@@@@  @&           &      \r\n"
						+ "                                                                                                                                                  @@@@@@@,                    \r\n"
						+ "                                                                                                                                       (@     ,@@@@@@(@@@@@@@     *@          \r\n"
						+ "                                                                                                                                           .,                .,               \r\n"
						+ "\r\n" + "", 1);
			}
		}
	}

	public int getBunch() {
		return bunch;
	}

	public void setBunch(int bunch) {
		this.bunch = bunch;
	}

	public int getUserYesOrNoValidOption() {
		// TODO Auto-generated method stub
		return 0;
	}

}
