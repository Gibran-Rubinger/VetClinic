package QueryAndValidations;

import java.util.Scanner;
import Graphical.*;

public class UserInteraction {
//	Attributes
	String userInput = "";
	int userInputInt = 0;

//	This attribute is responsible for validation the algorithm. Initialising the with a key value.
	public int userYesOrNoValidOption = 1000;
	public int userMultipleChoiseValidOption = 1000;
//	Those attribute, speedUp and slowDown are responsible to chance the milliseconds of the writeTyping.
	int speedUp = 50;
	int slowDown = 50;

//	This attribute is responsible to count the numbers of attempts left to trigger the bug message.
	int bugRunning = 0;

//	Those are the pool of valid options typing for the client. 
	String validAnswer1 = "yes";
	String validAnswer2 = "Y";
	String validAnswer3 = "no";
	String validAnswer4 = "n";

//	zero one two three four five six seven eight nine 
	String validAnswer5 = "zero";
	String validAnswer6 = "one";
	String validAnswer7 = "two";
	String validAnswer8 = "three";
	String validAnswer9 = "four";
	String validAnswer10 = "five";
	String validAnswer11 = "six";
	String validAnswer12 = "seven";
	String validAnswer13 = "eight";
	String validAnswer14 = "nine";

//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();

//	instantiate of Scanner.
	Scanner myScanner = new Scanner(System.in);

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void YesOrNo(int attempt, String text) {

//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text, 50);

//		Assign the attribute userInput with the client typing.
		userInput = myScanner.next();

//		before to start the for loop, count down and display are being created and evaluated with the same number of attempt defined in the main method.
		int countdown = attempt;
		int display = attempt;

//		in this for loop the client will be inform when will be the last attempt. if the numbers of attempt is exceed the bug message is trigger.
		for (int i = 0; i < attempt; i++) {

//          		check if  the client choose yes.								
//          		No case sensitive 		
			if (validAnswer1.equalsIgnoreCase(userInput) || validAnswer2.equalsIgnoreCase(userInput)) {
				userYesOrNoValidOption = 1;
				break;
			}
//                  check if if the client choose no.
//					No case sensitive
			else if (validAnswer3.equalsIgnoreCase(userInput) || validAnswer4.equalsIgnoreCase(userInput)) {
				userYesOrNoValidOption = 0;
				break;
			}
//					in this part start to count how many left attempts has.
			else if (userYesOrNoValidOption == 1000) {

//								populating the count down and display.
				display--;
				countdown--;

//							in this if statement start the count down.	
				if (countdown > 1) {
					printer.typeWriter(" Warnning this is not a valid option! You have " + display + "  attempts left.",
							slowDown);

//					this difference is to create a better interaction with the client
//					here is decreasing the millisecond to clarify the client the numbers of attempt left.
					slowDown -= 10;

//							here increasing the milliseconds to repeat the Yes or no message.
					speedUp += 50;
//							calling the yes or no message again.
					printer.typeWriter(text, speedUp);
//							Waiting for new typing
					userInput = myScanner.next();
				}

//							in this if statement is checked the last attempt before the bug message.
				else if (countdown == 1 && display == 1) {

					printer.typeWriter(" Warnning this is not a valid option! This is your * LAST *  attempts left.",
							slowDown);
//								calling the yes or no message for the last time.
					printer.typeWriter(text, speedUp);
//								Waiting for the last trying
					userInput = myScanner.next();
				}

			}
//				Increasing the bug count.	
			bugRunning++;
		}

//		calling the bug message.
		if (bugRunning == attempt) {

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
//	end of the method yes or no query.

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void MultipleChoise(int attempt, String text) {

		printer.typeWriter(text, 1);

//		Assign the attribute userInput with the client typing.

		try {
			
				userInputInt = Integer.parseInt(myScanner.next());
				// userInputInt = myScanner.nextInt();
//  		check if  the client choose yes.								
//  		No case sensitive 		
				if (userInputInt == 0) {
					userMultipleChoiseValidOption = 0;
				
				} else if (userInputInt == 1) {
					userMultipleChoiseValidOption = 1;
				
				} else if (userInputInt == 2) {
					userMultipleChoiseValidOption = 2;
				
				} else if (userInputInt == 3) {
					userMultipleChoiseValidOption = 3;
				
				} else if (userInputInt == 4) {
					userMultipleChoiseValidOption = 4;
				
				} else if (userInputInt == 5) {
					userMultipleChoiseValidOption = 5;
				
				} else if (userInputInt == 6) {
					userMultipleChoiseValidOption = 6;
				
				} else if (userInputInt == 7) {
					userMultipleChoiseValidOption = 7;
				
				} else if (userInputInt == 8) {
					userMultipleChoiseValidOption = 8;
				
				} else if (userInputInt == 9) {
					userMultipleChoiseValidOption = 9;
				
				}
				

			
		
//closing the Scanner.
			myScanner.close();
	}

//calling the bug message.
		catch (Exception e) {
			
//			before to start the for loop, count down and display are being created and evaluated with the same number of attempt defined in the main method.
			int countdown = attempt;
			int display = attempt;

			for (int i = 0; i < attempt; i++) {
//				in this part start to count how many left attempts has.
					if (userMultipleChoiseValidOption == 1000) {

//							populating the count down and display.
						display--;
						countdown--;
					}
//						in this if statement start the count down.	
						else if (countdown > 1) {
							printer.typeWriter(
									" Warnning this is not a valid option! You have " + display + "  attempts left.",
									slowDown);

//				this difference is to create a better interaction with the client
//				here is decreasing the millisecond to clarify the client the numbers of attempt left.
							slowDown -= 10;

//						here increasing the milliseconds to repeat the Yes or no message.
							speedUp += 50;
//						calling the yes or no message again.
							printer.typeWriter(text, speedUp);
//						Waiting for new typing
							userInputInt = Integer.parseInt(userInput);
						}
			}
		}

//						in this if statement is checked the last attempt before the bug message.
					catch (Exception e) {
						else if (countdown == 1 && display == 1) {

							printer.typeWriter(
									" Warnning this is not a valid option! This is your * LAST *  attempts left.",
									slowDown);
//							calling the yes or no message for the last time.
							printer.typeWriter(text, speedUp);
//							Waiting for the last trying
							userInputInt = Integer.parseInt(userInput);
						}
//					Increasing the bug count.	
							bugRunning++;
					}
		catch (Exception e) {
			
			if (bugRunning == attempt) {

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
}