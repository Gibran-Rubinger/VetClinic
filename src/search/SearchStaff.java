package search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;
import staff.Staff;
import staff.StaffFactory;

public class SearchStaff extends StaffFactory {

	private boolean found = false;
	private String idS = "";
	private String staffName = "";

	protected static List<Staff> foundStaff;
	protected static List<Staff> foundPremium;

	public SearchStaff() {
		foundStaff = new ArrayList<>();
		foundPremium = new ArrayList<>();
	}

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();

//	_____________________________________________________________________________________
//	by Id.

	public Staff SearchStaffById(String idSearch) {
		found = false;
		for (Staff staff : allStaff) {
// we need to pass the UID in toString  to able bufferedReader to pass an string to compare. it was very trick to learn :)
			if (staff.getId().toString().equals(idSearch)) {
				printer.typeWriter("\n Your search was successful:  \n", 50);
				System.out.println(staff);
				staff.info();
				found = true;
				return staff;
			}
		}
		if (found == false) {
			printer.typeWriter("\n sorry the animal id you type in was not found.  ", 50);
		}
		return null;
	}

	// _______________________________________________________________________________________
//	by Titles
	public Collection<Staff> SearchTitle(String keyword) {
//		checking the all objects.
		found = false;
		for (Staff title : allStaff) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (title.getTitle().contains(keyword)) {
				foundStaff.add(title);
				found = true;
			}
		}
		if (found == true) {
			StaffToPrint();
		}
		if (found == false) {
			printer.typeWriter("\n sorry the animal Specie you type in was not found.  ", 50);
		}
		return null;
	}

//_______________________________________________________________________________________
//	by Name.
	public Collection<Staff> SearchName(String keyword) {
//		checking the all objects.
		found = false;
		for (Staff staff : allStaff) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (staff.getStaffName().contains(keyword) || staff.getStaffSurname().contains(keyword)) {
				foundStaff.add(staff);
				found = true;
			}
		}
		if (found == true) {
			StaffToPrint();
		} else if (found == false) {
			printer.typeWriter("\n sorry the staff name you type was not found.  ", 50);
		}
		return null;
	}

//_______________________________________________________________________________________
//	printer.

	public void StaffToPrint() {
		for (Staff staffFound : foundStaff) {
			System.out.println(staffFound);
		}
		printer.typeWriter("\n Your search was successful:  \n", 50);
//			counting the numbers of item in the Array.
		printer.typeWriter("\n The Total of staff in the system is:  ", 50);
		System.out.println(foundStaff.size());
		SearchInSearch();
	}

	public void PremiumToPrint() {
		for (Staff staffFound : foundPremium) {
			System.out.println(staffFound);
		}
		printer.typeWriter("\n Your search was successful:  \n", 50);
//			counting the numbers of item in the Array.
		printer.typeWriter("\n The Total of staff in the system is:  ", 50);
		System.out.println(foundPremium.size());
		SearchInSearch();
	}
//	calling the previous searches inside that one.
//	__________________________________________________________________________________________________________________

	public void SearchInSearch() {

		query.MultipleChoise(3, "\n\n As we have " + foundStaff.size()
				+ " staff as a result, would you like to clarify a bit more? "
				+ "\n you know how it works right? please choose one of the options below: " + "\n\n"
				+ "             |           0 - CLOSE SEARCH:        |" + "\n\n"
				+ "             |           1 - ID:                  |" + "\n\n"
				+ "             |           2 - NAME:                |" + "\n\n"
				+ "_____________________________________________________________________________________________________________________________________________________________"
				+ "\n"
				+ "                               *   Please press the number of the type of search would you like to do   *\n",
				0, 2);

		if (query.getUserMultipleChoiseValidOption() == 0) {
			printer.typeWriter("Ok, see you later", 50);
		} else if (query.getUserMultipleChoiseValidOption() == 1) {
			query.OnlyString(3, "\n Please type the ID you looking for: \n");
			idS = query.getGoodToGo();
			IdInsideTitle(idS);
		} else if (query.getUserMultipleChoiseValidOption() == 2) {
			query.OnlyString(3, "\n Please type the name you looking for: "
					+ "\n\n  *BE AWARE* I will put some faith that you will type the species exactly as it shown in your device. otherwise no deal for you. :\n\n");
			staffName = query.getGoodToGo();
			NameInsideTitle(staffName);
		}
	}

//	________________________________________________________________________________
//search in search id	
	public Staff IdInsideTitle(String idSearch) {
		found = false;
		for (Staff staff : foundStaff) {

			if (staff.getId().toString().equals(idSearch)) {
				printer.typeWriter("\n Your search was successful:  \n", 50);
				System.out.println(staff);
				staff.info();
				found = true;
				return staff;
			}
		}
		if (found == false) {
			printer.typeWriter("\n sorry the staff id you type was not found.  ", 50);
		}
		return null;
	}

//	________________________________________________________________________________
//	search in search name	
	public Collection<Staff> NameInsideTitle(String keyword) {
//		checking the all objects.
		found = false;
		for (Staff staff : allStaff) {
//			using the if statement to check in the file  with titles and content and generate the object.
			if (staff.getStaffName().contains(keyword) || staff.getStaffSurname().contains(keyword)) {
				foundPremium.add(staff);
				found = true;
			}
		}
		PremiumToPrint();
		if (found == false) {
			printer.typeWriter("\n sorry the staff name you type was not found.  ", 50);
		}
		return null;
	}

}
