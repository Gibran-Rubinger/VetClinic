package queryAndValidations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import exceptions.CustomExceptions;
import graphical.*;

public class UserInteraction {
//	Attributes
	private String userInput = "";
	private int userInputInt = 0;
	private int userYesOrNoValidOption = 1000;
	private int userMultipleChoiseValidOption = 1000;
//	This attribute is responsible to count the numbers of attempts left to trigger the bug message.

	private boolean bugRunning = true;

	private int countdown = 0;
	private int display = 0;
	private int bunch = 0;

	/*
	 * Regular expression from java -? – this part identifies if the given number is
	 * negative, the dash “–” searches for dash literally and the question mark “?”
	 * marks its presence as an optional one \d+ – this searches for one or more
	 * digits (\.\d+)? – this part of regex is to identify float numbers. Here we're
	 * searching for one or more digits followed by a period. The question mark, in
	 * the end, signifies that this complete group is optional
	 */
	private String hasNumber = "-?\\d+(\\.\\d+)?";
	private String goodToGo = "";

//	Those are the pool of valid options typing for the client. 
	String validAnswer1 = "yes";
	String validAnswer2 = "Y";
	String validAnswer3 = "no";
	String validAnswer4 = "n";

//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();

//	instantiate of Scanner.
	Scanner myScanner = new Scanner(System.in);
	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void YesOrNo(int attempt, String text) {

//		before to start the for loop, count down and display are being created and evaluated with the same number of attempt defined in the main method.
		countdown = attempt;
		display = attempt;
//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text, 50);

		do {
			try {
//		Assign the attribute userInput with the client typing.
				userInput = myReader.readLine();

//		in this statement the client will be inform when will be the last attempt. if the numbers of attempt is exceed the bug message is trigger.

//          	check if  the client choose yes.									
				if (validAnswer1.equalsIgnoreCase(userInput) || validAnswer2.equalsIgnoreCase(userInput)) {
					userYesOrNoValidOption = 1;
					bugRunning = false;
				}
//              check if if the client choose no.
//				No case sensitive
				else if (validAnswer3.equalsIgnoreCase(userInput) || validAnswer4.equalsIgnoreCase(userInput)) {
					userYesOrNoValidOption = 0;
					bugRunning = false;
				} else {
					throw new CustomExceptions();
				}
//			  in this part start to count how many left attempts has.
			} catch (Exception e) {
				Bug(text, null, attempt);
			}

		} while (bugRunning == true);

	}

//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void MultipleChoise(int attempt, String text, int starN, int endN) {
		countdown = attempt;
		display = attempt;
		printer.typeWriter(text, 20);

//		Assign the attribute userInput with the client typing.
		do {
			try {
				userInputInt = Integer.parseInt(myReader.readLine());
//				in this statement we throw a custom error  to keep valid only the options chosen in the parameter StarN endN.
				if (userInputInt < starN || userInputInt > endN) {
					bugRunning = false;
					throw new CustomExceptions();
				}
//  			check if  the client choose yes.	
				switch (userInputInt) {
				case 0:
					setUserMultipleChoiseValidOption(0);
					bugRunning = false;
					break;
				case 1:
					setUserMultipleChoiseValidOption(1);
					bugRunning = false;
					break;
				case 2:
					setUserMultipleChoiseValidOption(2);
					bugRunning = false;
					break;
				case 3:
					setUserMultipleChoiseValidOption(3);
					bugRunning = false;
					break;
				case 4:
					setUserMultipleChoiseValidOption(4);
					bugRunning = false;
					break;
				case 5:
					setUserMultipleChoiseValidOption(5);
					bugRunning = false;
					break;
				case 6:
					setUserMultipleChoiseValidOption(6);
					bugRunning = false;
					break;
				case 7:
					setUserMultipleChoiseValidOption(7);
					bugRunning = false;
					break;
				case 8:
					setUserMultipleChoiseValidOption(8);
					bugRunning = false;
					break;
				case 9:
					setUserMultipleChoiseValidOption(9);
					bugRunning = false;
					break;
				}

			}

//			calling the bug message.
			catch (CustomExceptions e) {
				Bug(text, "", attempt);
			} catch (Exception e) {

				Bug(text, "", attempt);

			}
		} while (bugRunning == true);
	}

	public int GettingNumber(String text, String text2, int attempt) {

		countdown = attempt;
		display = attempt;
//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text, 50);
		printer.typeWriter(text2, 7);

//		Assign the attribute userInput with the client typing.
		do {
			try {
				userInputInt = Integer.parseInt(myReader.readLine());
				if (userInputInt != 0) {
					bunch = userInputInt;
					bugRunning = false;
				}
			}
//			calling the bug message.
			catch (Exception e) {

				Bug(text, "", attempt);
			}
		} while (bugRunning == true);

		return bunch;
	}

	public String OnlyString(int attempt, String text) {

//		before to start the for loop, count down and display are being created and evaluated with the same number of attempt defined in the main method.
		countdown = attempt;
		display = attempt;
//		setting the graphical with the milliseconds  preferred.
		printer.typeWriter(text, 50);

		do {
			try {
//		Assign the attribute userInput with the client typing.
				userInput = myReader.readLine();

//		in this statement the client will be inform when will be the last attempt. if the numbers of attempt is exceed the bug message is trigger.

//          	check if  the client choose yes.									
				if (!userInput.contains(hasNumber)) {
					goodToGo = userInput;
					bugRunning = false;
				} else {
					throw new CustomExceptions();
				}
//			in this part start to count how many left attempts has.
			} catch (Exception e) {
				Bug(text, null, attempt);
			}

		} while (bugRunning == true);
		return goodToGo;
	}

	public void Bug(String text, String text2, int attempt) {

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

//    getters and setters
	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public int getUserInputInt() {
		return userInputInt;
	}

	public void setUserInputInt(int userInputInt) {
		this.userInputInt = userInputInt;
	}

	public int getBunch() {
		return bunch;
	}

	public void setBunch(int bunch) {
		this.bunch = bunch;
	}

	public int getUserYesOrNoValidOptio() {
		return userYesOrNoValidOption;
	}

	public void setUserYesOrNoValidOption(int userYesOrNoValidOption) {
		this.userYesOrNoValidOption = userYesOrNoValidOption;
	}

	public int getUserMultipleChoiseValidOption() {
		return userMultipleChoiseValidOption;
	}

	public void setUserMultipleChoiseValidOption(int userMultipleChoiseValidOption) {
		this.userMultipleChoiseValidOption = userMultipleChoiseValidOption;
	}

	public String getGoodToGo() {
		return goodToGo;
	}

	public void setGoodToGo(String goodToGo) {
		this.goodToGo = goodToGo;
	}

}
