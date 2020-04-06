import java.util.Scanner;

public class UserInteraction {
//	Attributes
	String userInput = "";
	
	int userValidOption = 0;
	
	String validAnswer1 ="Yes";
	String validAnswer2 ="yes";
	String validAnswer3 ="Y";
	String validAnswer4 ="y";
	String validAnswer5 ="No";
	String validAnswer6 ="no";
	String validAnswer7 ="N";
	String validAnswer8 ="n";
	
	
//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();
	
	
//	this a method to simple verification by Yes or No choice from the client.
	public void YesOrNo(int attempt, String text) {
		//"\n\n\n\n would you like to continue? Please type Yes or No. \n"
		Scanner collect = new Scanner(System.in);
		printer.setMessage(text);
		printer.typeWriter(null, 50);
		userInput = collect.nextLine();
		
		for(int i=0; i<attempt; i++) {
			
			if (userInput == validAnswer1 || userInput == validAnswer2 || userInput == validAnswer3 || userInput == validAnswer4){
				userValidOption = 1;
			}
			else if (userInput == validAnswer5 || userInput == validAnswer6 || userInput == validAnswer7 || userInput == validAnswer8){
				userValidOption = 2;
			}
		}		
		collect.close();
//		error message
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
		
}
