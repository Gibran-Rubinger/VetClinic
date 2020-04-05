import java.util.Scanner;

public class UserInteraction {
//	Attributes
	String userInput = "";
	
	Boolean userValidOption;
	
	int attempt =0;
	
	String validAnswer1 ="Yes";
	String validAnswer2 ="yes";
	String validAnswer3 ="Y";
	String validAnswer4 ="y";
	String validAnswer5 ="No";
	String validAnswer6 ="no";
	String validAnswer7 ="N";
	String validAnswer8 ="n";
	
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
			
			switch (userInput != null ) {
			case validAnswer1:
				return true;
				break;
			case validAnswer2:
				return true;
				break;
			case validAnswer3:
				return true;
				break;
			case validAnswer4:
				return true;
				break;
			case validAnswer5:
				return false;
				break;
			case validAnswer6:
				return false;
				break;
			case validAnswer7:
				return false;
				break;
			case validAnswer8:
				return false;
				break;
			}
		}
		
	return false;
	}
	
		
		
		
		
			
		
	

}
