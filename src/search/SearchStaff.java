package search;

import java.rmi.server.UID;
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
	private int idS = 0;
	private String StaffName = "";
	
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
	//_______________________________________________________________________________________
//	by Name.
	public Collection<Animals> SearchName(String keyword) {
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
			AnimalsToPrint();
		} else if (found == false) {
			printer.typeWriter("\n sorry the animal name you type in was not found.  ", 50);
		}
		return null;
	}

//_______________________________________________________________________________________
//	printer.

	public void AnimalsToPrint() {
		for (Animals animalfound : foundAnimal) {
			System.out.println(animalfound);
		}
		printer.typeWriter("\n Your search was successful:  \n", 50);
//			counting the numbers of item in the Array.
		printer.typeWriter("\n The Total of Animals in the system is:  ", 50);
		System.out.println(foundAnimal.size());
		SearchInSearch();
	}

}
