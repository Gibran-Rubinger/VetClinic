import java.util.Scanner;

public class UserInteraction {
//	Attributes
	String userInput = "";
	
	int userValidOption = 404;
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
	
//	this a method to simple verification by Yes or No choice from the client.
	public void YesOrNo(int attempt, String text) {
	
//		setting the graphical with the milliseconds  preferred.
		printer.setMessage(text);
		printer.typeWriter(null, 50);
		
//		instantiate of Scanner.
		Scanner myScanner = new Scanner(System.in);
//		 Assign the attribute userInput with the client typing.
		userInput = myScanner.next();
		
		
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
					else {
						printer.setMessage(" Warnning this is not a valid option! You have more " + attempt + " attempts.");
					}
				}
			
			
			while(stopTry == false){
//				error message
			if (stopTry == false){
				
			
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
								break;
							}
			
			}
		
//		closing the Scanner.
		myScanner.close();
		
		
		
		
		
	}
}