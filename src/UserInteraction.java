import java.util.Scanner;

public class UserInteraction {
//	Attributes
	String userInput = "";

//	This attribute is responsible for validation the algorithm. Initialising the with a key value.
	int userValidOption = 404;
//	Those attribute, speedUp and slowDown are responsible to chance the milliseconds of the writeTyping.
	int speedUp = 50;
	int slowDown = 50;

//	This attribute is responsible to count the numbers of attempts left to trigger the bug message.
	int bugRunning = 0;

//	Those are the pool of valid options typing for the client. 
	String validAnswer1 = "Yes";
	String validAnswer2 = "yes";
	String validAnswer3 = "Y";
	String validAnswer4 = "y";
	String validAnswer5 = "No";
	String validAnswer6 = "no";
	String validAnswer7 = "N";
	String validAnswer8 = "n";

//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void YesOrNo(int attempt, String text) {

//		setting the graphical with the milliseconds  preferred.
		printer.setMessage(text);
		printer.typeWriter(50);

//		instantiate of Scanner.
		Scanner myScanner = new Scanner(System.in);
//		Assign the attribute userInput with the client typing.
		userInput = myScanner.next();

//		before to start the for loop, countdown and display are being created and evaluated with the same number of attempt defined in the main method.
		int countdown = attempt;
		int display = attempt;

//		in this for loop if in the las attempt the client will be inform it will be the last attempt. if the numbers of attempt is exceed the bug message is trigger.
		for (int i = 0; i < attempt; i++) {

//                  check if  the client choose yes.		
			if (validAnswer1.equals(userInput) || validAnswer2.equals(userInput) || validAnswer3.equals(userInput)
					|| validAnswer4.equals(userInput)) {
				userValidOption = 1;
				break;
			}
//                  check if if the clieent choose no.
			else if (validAnswer5.equals(userInput) || validAnswer6.equals(userInput) || validAnswer7.equals(userInput)
					|| validAnswer8.equals(userInput)) {
				userValidOption = 0;
				break;
			}
//					in this part start to count how many left attempts has.
			else if (userValidOption == 404) {

//								populating the countdown and display.
				display--;
				countdown--;

//							in this if statement start the coutdown.	
				if (countdown > 1) {
					printer.setMessage(
							" Warnning this is not a valid option! You have " + display + "  attempts left.");
					printer.typeWriter(slowDown);

//							here is decreasing the millisecond to clarify the client the numbers of attempt left.
					slowDown -= 10;
//							here increasing the milliseconds to repeat the Yes or no message.
					speedUp += 50;
//							calling the yes or no message again.
					printer.setMessage(text);
					printer.typeWriter(speedUp);
//							Waiting for new typing
					userInput = myScanner.next();
				}

//							in this if statement is checked the last attempt before the bug message.
				else if (countdown == 1 && display == 1) {

					printer.setMessage(" Warnning this is not a valid option! This is your * LAST *  attempts left.");
					printer.typeWriter(slowDown);
//								calling the yes or no message for the last time.
					printer.setMessage(text);
					printer.typeWriter(speedUp);
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
			printer.setMessage("\r\n"
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
					+ "\r\n" + "");

			printer.typeWriter(1);
		}

	}
//	end of the method yes or no query.
	
}