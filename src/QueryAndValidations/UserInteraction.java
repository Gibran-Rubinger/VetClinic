package QueryAndValidations;
import java.util.Scanner;
import Graphical.*;
public class UserInteraction {
//	Attributes
	String userInput = "";

//	This attribute is responsible for validation the algorithm. Initialising the with a key value.
	public int userValidOption = 1000;
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

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void YesOrNo(int attempt, String text) {

//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text,50);

//		instantiate of Scanner.
		Scanner myScanner = new Scanner(System.in);
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
				userValidOption = 1;
				break;
			}
//                  check if if the client choose no.
//					No case sensitive
			else if (validAnswer3.equalsIgnoreCase(userInput) || validAnswer4.equalsIgnoreCase(userInput)) {
				userValidOption = 0;
				break;
			}
//					in this part start to count how many left attempts has.
			else if (userValidOption == 1000) {

//								populating the count down and display.
				display--;
				countdown--;

//							in this if statement start the count down.	
				if (countdown > 1) {
					printer.typeWriter(" Warnning this is not a valid option! You have " + display + "  attempts left.",slowDown);
					
//					this difference is to create a better interaction with the client
//					here is decreasing the millisecond to clarify the client the numbers of attempt left.
					slowDown -= 10;
					
//							here increasing the milliseconds to repeat the Yes or no message.
					speedUp += 50;
//							calling the yes or no message again.
					printer.typeWriter(text,speedUp);
//							Waiting for new typing
					userInput = myScanner.next();
				}

//							in this if statement is checked the last attempt before the bug message.
				else if (countdown == 1 && display == 1) {

					printer.typeWriter(" Warnning this is not a valid option! This is your * LAST *  attempts left.",slowDown);
//								calling the yes or no message for the last time.
					printer.typeWriter(text,speedUp);
//								Waiting for the last trying
					userInput = myScanner.next();
				}

			}
//				Increasing the bug count.	
			bugRunning++;
		}
//		closing the Scanner.
		myScanner.close();

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
					+ "\r\n" + "",1);
		}

	}
//	end of the method yes or no query.
	
	
	
	
	
	
//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void MultipleChoise(int attempt, String text) {
		
//		instantiate of Scanner.
		Scanner myScanner = new Scanner(System.in);
//		Assign the attribute userInput with the client typing.
		userInput = myScanner.next();
		int userInputNumber = Integer.parseInt(userInput);
//		before to start the for loop, count down and display are being created and evaluated with the same number of attempt defined in the main method.
		int countdown = attempt;
		int display = attempt;
		
		for (int i = 0; i < attempt; i++) {

			
			
			
//  		check if  the client choose yes.								
//  		No case sensitive 		
	if (validAnswer5.equalsIgnoreCase(userInput) || userInputNumber == 0) {
		userValidOption = 0;
		break;
	}
	else if (validAnswer6.equalsIgnoreCase(userInput) || userInputNumber == 1) {
		userValidOption = 1;
		break;
	}
	else if (validAnswer7.equalsIgnoreCase(userInput) || userInputNumber == 2) {
		userValidOption = 2;
		break;
	}
	else if (validAnswer8.equalsIgnoreCase(userInput) || userInputNumber == 3) {
		userValidOption = 3;
		break;
	}
	else if (validAnswer9.equalsIgnoreCase(userInput) || userInputNumber == 4) {
		userValidOption = 4;
		break;
	}
	else if (validAnswer10.equalsIgnoreCase(userInput) || userInputNumber == 5) {
		userValidOption = 5;
		break;
	}
	else if (validAnswer11.equalsIgnoreCase(userInput) || userInputNumber == 6) {
		userValidOption = 6;
		break;
	}
	else if (validAnswer12.equalsIgnoreCase(userInput) || userInputNumber == 7) {
		userValidOption = 7;
		break;
	}
	else if (validAnswer13.equalsIgnoreCase(userInput) || userInputNumber == 8) {
		userValidOption = 8;
		break;
	}
	else if (validAnswer14.equalsIgnoreCase(userInput) || userInputNumber == 9) {
		userValidOption = 9;
		break;
	}
//			in this part start to count how many left attempts has.
	else if (userValidOption == 1000) {

//						populating the count down and display.
		display--;
		countdown--;

//					in this if statement start the count down.	
		if (countdown > 1) {
			printer.typeWriter(" Warnning this is not a valid option! You have " + display + "  attempts left.",slowDown);
			
//			this difference is to create a better interaction with the client
//			here is decreasing the millisecond to clarify the client the numbers of attempt left.
			slowDown -= 10;
			
//					here increasing the milliseconds to repeat the Yes or no message.
			speedUp += 50;
//					calling the yes or no message again.
			printer.typeWriter(text,speedUp);
//					Waiting for new typing
			userInput = myScanner.next();
		}

//					in this if statement is checked the last attempt before the bug message.
		else if (countdown == 1 && display == 1) {

			printer.typeWriter(" Warnning this is not a valid option! This is your * LAST *  attempts left.",slowDown);
//						calling the yes or no message for the last time.
			printer.typeWriter(text,speedUp);
//						Waiting for the last trying
			userInput = myScanner.next();
		}

	}
//		Increasing the bug count.	
	bugRunning++;
}
//closing the Scanner.
myScanner.close();

//calling the bug message.
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
			+ "\r\n" + "",1);
}


	}
	
	
}