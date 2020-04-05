import java.util.Scanner;

public class UserInteraction {
//	Attributes
	String userInput = "";
	
	Boolean userValidOption;
	
	int attempt =0;
	
//	instantiate the graphical method to print some interactions.
	Graphical printer = new Graphical();
	
	private String GettingUserInput() {
//	Instantiate scanner to collect the interaction
	Scanner collect = new Scanner(System.in);
	userInput = collect.nextLine();
	return userInput;
	}
//	this a method to simple verification of Yes or No choice from the client.
	public boolean YesOrNo(int attempt) {
		
		//userValidOption= true;
		
		
		for(int i=0; i<attempt; i++) {
			
			switch (userInput) {
			
			case "Yes":
				return true;
				break;
				
			case "yes":
				return true;
				break;
				
			case "Y":
				return true;
				break;
				
			case "y":
				return true;
				break;
				
			case "No":
				return false;
				break;
				
			case "no":
				return false;
				break;
				
			case "N":
				return false;
				break;
				
			case "n":
				return false;
				break;
				
//				here if non of options above matches we inform the client is a unknown value.
			default:
				printer.setMessage("\n\n\n\n Sorry It is not valid typing option \n");
				printer.typeWriter(null, 50);
			}
		}
		
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
		
		return false;
		
	}
	
		
		
		
		
			
		
	

}
