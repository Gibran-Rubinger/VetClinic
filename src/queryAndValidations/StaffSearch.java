package queryAndValidations;

import graphical.Graphical;
import search.SearchStaff;

public class StaffSearch {
	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	SearchStaff where = new SearchStaff();

	private String idS;
	private int chooice =1;
	private String title = "";
	private String staffName = "";

	public void SearchStaff() {
		query.YesOrNo(4,
				"\n\n\n Would you like to search for an specific type of data related to staff?  \n\n type Yes or No.");
		// chose a option
		if (query.getUserYesOrNoValidOptio() == 1) {
			query.MultipleChoise(3, "\n \n Grand. \nPlease choose the type of search written bellow: \n"
					+ "           \n 1 - ID: " + "\n\n"
					+ "             |                  If you have the staff ID already you can just type the Id.                                                                 |"
					+ "\n" + "    \n\n 2 - TITLE: " + "\n\n"
					+ "             |                  Here you can search for a title and will return all the staff in the list from the function you chose.                      |"
					+ "\n" + "    \n\n 3 - NAME: " + "\n\n"
					+ "             |                  Here you can search for a specify name and will return all the staff in the list with the same name you chose.             |"
					+ "\n\n"
					+ "_____________________________________________________________________________________________________________________________________________________________"
					+ "\n"
					+ "                               *   Please press the number of the type of search would you like to do   *\n",
					1, 3);

			if (query.getUserMultipleChoiseValidOption() == 1) {
				query.OnlyString(3, "\n Please type the ID you looking for: \n");
				idS = query.getGoodToGo();
				where.SearchStaffById(idS, chooice);
			} else if (query.getUserMultipleChoiseValidOption() == 2) {
//		            	  would be possible implement a method similar to YesOrNo and check all the title names to case sensitive BUT we don't afford the time to do it. 
				query.OnlyString(3, "\n Please type the title you looking for: "
						+ "\n\n  *BE AWARE* I will put some faith that you will type the title exactly as it shown in your device. otherwise no deal for you. :\n\n");
				title = query.getGoodToGo();
				where.SearchTitle(title);
			} else if (query.getUserMultipleChoiseValidOption() == 3) {
				query.OnlyString(3, "\\n Please type the name you looking for: \"\r\n"
						+ "						+ \"\\n\\n  *BE AWARE* I will put some faith that you will type the title exactly as it shown in your device. otherwise no deal for you. :\\n\\n");
				staffName = query.getGoodToGo();
				where.SearchName(staffName);
			} else if (query.getUserYesOrNoValidOptio() == 0) {
				printer.typeWriter("Ok, see you later", 50);
			}
		}
	}

}
