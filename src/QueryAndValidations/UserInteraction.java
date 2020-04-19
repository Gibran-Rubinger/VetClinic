package queryAndValidations;

import java.util.Scanner;

import graphical.*;

public class UserInteraction {
//	Attributes
	String userInput = "";
	int userInputInt = 0;

//	This attribute is responsible for validation the algorithm. Initialising the with a key value.
	public int userYesOrNoValidOption = 1000;
	public int userMultipleChoiseValidOption = 1000;
//	This attribute is responsible to count the numbers of attempts left to trigger the bug message.

	boolean bugRunning = true;

	int countdown = 0;
	int display = 0;
	
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

//				populating the count down and display.
				display--;
				countdown--;

//				in this if statement start the count down.	
				if (countdown > 1) {
					printer.typeWriter(" Warnning this is not a valid option! You have " + display + "  attempts left.",
							60);

//							calling the yes or no message again.
					printer.typeWriter(text, 10);
//							Waiting for new typing
					userInput = myScanner.next();
				}

//							in this if statement is checked the last attempt before the bug message.
				else if (countdown == 1 ) {

					printer.typeWriter(" Warnning this is not a valid option! This is your * LAST *  attempts left.",70);
//								calling the yes or no message for the last time.
					printer.typeWriter(text, 5);
//								Waiting for the last trying
					userInput = myScanner.next();
				}

			}

		}

//		calling the bug message.
		if (countdown == 0) {

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
		int countdown = attempt;
		int display = attempt;
		printer.typeWriter(text, 1);

//		Assign the attribute userInput with the client typing.
    do { 
		try {
				userInputInt = Integer.parseInt(myScanner.next());

//  			check if  the client choose yes.								
				if (userInputInt == 0) {
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
		catch (Exception e) {
		
			printer.typeWriter("Buddy just numbers are allowed here!", 60);
	    for (int i = 0; i < attempt; i++) {
	    		  
	    	display--;
	    	countdown--;
	    	
		
	    	if(countdown > 1) {
	    		printer.typeWriter("\n\n Warnning this is not a valid option! You have " + display + "  attempts left.", 20);
	    		printer.typeWriter(text, 1);
	    		break;
	    	}
	    	else if (countdown == 1) {
	    		printer.typeWriter("\n\n Warnning this is not a valid option! This is your * LAST *  attempts left.", 60);
	    		printer.typeWriter("\n\n so, how you decide if we will continue execute the program  or not?", 1);
	    		printer.typeWriter(text, 1);
	    		break;
	    	}
	    	else if (countdown == 0){
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
	}
		while(bugRunning == true );				
					   
						
//		closing the Scanner.
		myScanner.close();
	}
	
}