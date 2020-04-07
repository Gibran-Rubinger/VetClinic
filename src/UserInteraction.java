import java.util.Scanner;

public class UserInteraction {
//	Attributes
	String userInput = "";
	
	int userValidOption = 404;
	
	int speedUp = 50;
	int slowDown = 50;
	//boolean stopTry = false;
	
	String validAnswer1 ="Yes";
	String validAnswer2 ="yes";
	String validAnswer3 ="Y";
	String validAnswer4 ="y";
	String validAnswer5 ="No";
	String validAnswer6 ="no";
	String validAnswer7 ="N";
	String validAnswer8 ="n";
	
	boolean stopTry = false;
	
	
	
//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();
	
//	this a method to verification by Yes or No choice with bug message when exceed attempt from the client.
	public void YesOrNo(int attempt, String text) {
	
		
//		setting the graphical with the milliseconds  preferred.
		printer.setMessage(text);
		printer.typeWriter(null, 50);
		
//		instantiate of Scanner.
		Scanner myScanner = new Scanner(System.in);
//		 Assign the attribute userInput with the client typing.
		userInput = myScanner.next();
		
		
		int countdown = attempt;
		
//		countdown need to start with -- otherwise the numbers of attempt will be one times bigger than we choose in the main class
		//countdown--;
		
		for (int i = 0; i < attempt; i++) {
			
			
		
				
					if (validAnswer1.equals(userInput) || validAnswer2.equals(userInput) || validAnswer3.equals(userInput) || validAnswer4.equals(userInput)){
						userValidOption = 1;
						stopTry = true;
						break;
						}
					else if (validAnswer5.equals(userInput) || validAnswer6.equals(userInput) || validAnswer7.equals(userInput) || validAnswer8.equals(userInput)){
						userValidOption = 0;
						stopTry = true;
						break;		
					}
					else if (userValidOption == 404) {
						
//						in this for loop we define a bug message when the countdown =0.
						
							countdown --;
							
							if(countdown!=1){
							
							 
							printer.setMessage(" Warnning this is not a valid option! You have " + countdown   + "  attempts.");
							printer.typeWriter(null, slowDown);
							}
							else if (countdown == 1) {
								printer.setMessage(" Warnning this is not a valid option! This is your LAST  attempts.");
								printer.typeWriter(null, slowDown);
							}
							speedUp += 50;
							slowDown -= 10;
							printer.setMessage(text);
							printer.typeWriter(null, speedUp);
							userInput = myScanner.next();
						}
					
				
				}
		 if (countdown == 0) {
			printer.setMessage("\r\n" + 
					"                                                                                                                                                                              \r\n" + 
					"                                                                                                                                                  @(    @*                    \r\n" + 
					"                                                                                                                                              @&            @&                \r\n" + 
					"                                                                                                                                            @@               @@&              \r\n" + 
					"                                                                                                                                           @@@                @@@             \r\n" + 
					"                                                                                                                                          &@@@  @@@@@@@@@@@. /@@@             \r\n" + 
					"    @@@@@@@@@.   @@.@@@,@@@     @@@@,,@@@%     %@@@@@./@@@      @@ @@@#@@@               @@         %@@  .@@%        @@                   %@@@@             @@@@@             \r\n" + 
					"    @@           @@.     (@@    @@      @@    @@         @@&    @@      @@              @@         #@#     &@%      @@                 @@@@@@@@@@@,      %@@@@@@@@@@@         \r\n" + 
					"    @@@@@@@@&    @@*,,,%@@*     @@,,,/@@@    @@#          @@    @@,.,*@@@              @@   @@     @@       @@     @@   @@          .@@@%     .@@@@@   &@@@@#     ,@@@@       \r\n" + 
					"    @@           @@.  %@@/      @@   @@@     &@@          @@    @@   @@@              @@    @@     @@       @@    @@    @@         /@*     @@@    @#    @.   /@@      @@      \r\n" + 
					"    @@           @@.    (@@     @@     @@*    @@#        @@*    @@     @@&           @@@@@@@@@@@   *@@     @@(   @@@@@@@@@@@       @        @@@    /@@@@     @@@       &/     \r\n" + 
					"    @@@@@@@@@&   @@.     .@@    @@      @@&     @@@@&@@@@#      @@      &@@                 @@       @@@&@@@            @@         @         @@@@   @@@@  *@@@.         ,     \r\n" + 
					"                                                                                                                                               .@  #@@@@  @&           &      \r\n" + 
					"                                                                                                                                                  @@@@@@@,                    \r\n" + 
					"                                                                                                                                       (@     ,@@@@@@(@@@@@@@     *@          \r\n" + 
					"                                                                                                                                           .,                .,               \r\n" + 
					"\r\n" + 
					"");
			
			printer.typeWriter(null, 1);
		}

//		closing the Scanner.
		myScanner.close();

	}
}