package queryAndValidations;

import exceptions.CustomExceptions;
import graphical.Graphical;
import search.SearchItem;
import staff.StaffFactory;

public class StaffQuery {

	private int medicalStaffQ = 0;
	private boolean goodToGo = false;

	UserInteraction query = new UserInteraction();
	Graphical printer = new Graphical();
	SearchItem where = new SearchItem();
	StaffFactory myStaff = new StaffFactory();

	public void Staffchoise() {
		query.YesOrNo(3, "\n\n Would you like to set  the staff? \n\n Type yes or no. ");
		if (query.getUserYesOrNoValidOptio() == 1) {

			query.MultipleChoise(3, "\n              |           1 - ADMIN:                  |  \n\n\n"
					+ "				 \n              |           2 - MEDICAL:                |  " + "\n\n\n"
					+ "_____________________________________________________________________________________________________________________________________________________________\n\n\n"
					+ "                               *   Please press the number of the type of staff you like to add.  *\n",
					1, 2);
			if (query.getUserMultipleChoiseValidOption() == 1) {
				do {
					try {
						query.GettingNumber("\n\n " + "\n\n ADMIN STAFF"
								+ "\n\n How many admin Staff would you like to create?" + "\n ",
								"\n\n		 * * type at least 10 * * ", 3);

						medicalStaffQ = query.getBunch();
						if (medicalStaffQ <= 9) {
							throw new CustomExceptions();
						} else {

							myStaff.Admin(medicalStaffQ);
							goodToGo = true;
						}
					}

					catch (CustomExceptions e) {
						printer.typeWriter(
								"\n Sorry. for the correct operation the clinic must to have at least 10 admin staff.\n\n Please, try again . . .",
								50);
					}
				} while (goodToGo == false);
			}
			if (query.getUserMultipleChoiseValidOption() == 2) {
				goodToGo = false;
				do {
					try {
						query.GettingNumber("\n\n " + "\n\n MEDICAL STAFF"
								+ "\n\n How many Medical Staff would you like to create?" + "\n ",
								"\n\n		 * * type at least 30 * *", 3);
						medicalStaffQ = query.getBunch();
						if (medicalStaffQ < 30) {
							throw new CustomExceptions();
						} else {

							myStaff.medical(medicalStaffQ);
							goodToGo = true;
						}
					}

					catch (CustomExceptions e) {
						printer.typeWriter(
								"\n Sorry. for the correct operation the clinic must to have at least 30 medical staff.\n\n Please, try again . . .",
								50);
					}
				} while (goodToGo == false);
				if (query.getUserYesOrNoValidOptio() == 0) {
					query.YesOrNo(3, "OK, see you later");

				}
			}
		}
	}
}
