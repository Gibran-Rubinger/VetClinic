package animals;
import graphical.*;
import queryAndValidations.*;

public interface Ianimals {
	
//	instantiate the graphical and UserInteraction method to print some interactions.
	Graphical printer = new Graphical();
	UserInteraction test = new UserInteraction();

//	This method will be responsible to produce the  specific sounds of the animal.
	public void sounds();
	
//	This method will be responsible to produce the  specific way the animals normally feeds.
	public void feeding();
	
//	This method will be responsible to produce the  way the animal moves.	
	public void info();
}
