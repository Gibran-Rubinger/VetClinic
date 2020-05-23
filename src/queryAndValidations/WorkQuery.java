package queryAndValidations;

import graphical.Graphical;
import search.SearchStaff;
import staff.StaffFactory;

public class WorkQuery {
	
	private String key;
	private int chooice =2;
	
	UserInteraction query = new UserInteraction();
	Graphical printer = new Graphical();
	
	SearchStaff where = new SearchStaff();
	StaffFactory myStaff = new StaffFactory();
	
	
	public void WhoIsWorking() {
		query.YesOrNo(3, "\n\n Would you like to start work? \n\n Type yes or no. ");
		if (query.getUserYesOrNoValidOptio() == 1) {
			printer.typeWriter("Nice! \n\n Let's get started  ", 20);
			query.OnlyString(3, "\n Please type the ID who will start to work now: \n");
			key = query.getGoodToGo();
			where.SearchStaffById(key,chooice);
		}
			
				if (query.getUserYesOrNoValidOptio() == 0) {
					query.YesOrNo(3, "OK, see you later");

				}
		}
}
