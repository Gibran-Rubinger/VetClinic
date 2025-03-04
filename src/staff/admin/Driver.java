package staff.admin;

import java.util.ArrayList;
import java.util.List;

import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;
import staff.Staff;

public class Driver extends Staff {

	protected static List<Animals> ListWork = new ArrayList<Animals>();
	protected static List<Animals> workDone = new ArrayList<Animals>();
	protected static List<Animals> workUnresolved = new ArrayList<Animals>();
	protected static List<Animals> workRecord = new ArrayList<Animals>();

	public Driver(String staffName, String staffSurname, String gender, int workFunction, double salaryLevel,
			int monthsOnCompany, int age, int function, String title, int phoneN1, int phoneN2, int phoneN3, String day,
			String month, int year, String nationality, String maritalStatus) {
		super(staffName, staffSurname, gender, workFunction, salaryLevel, monthsOnCompany, age, function, title,
				phoneN1, phoneN2, phoneN3, day, month, year, nationality, maritalStatus);
		this.setStaffName(staffName);
		this.setStaffSurname(staffSurname);
		this.setGender(gender);
		this.setWorkFunction(workFunction);
		this.setSalaryLevel(salaryLevel);
		this.setMonthsOnCompany(monthsOnCompany);
		this.setAge(age);
		this.setFunction(function);
		this.setTitle(title);
		this.setPhoneN1(phoneN1);
		this.setPhoneN2(phoneN2);
		this.setPhoneN3(phoneN3);
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		this.setNationality(nationality);
		this.setMaritalStatus(maritalStatus);
	}

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();

	public void jobDaily() {
		query.YesOrNo(4, "\n\n\n Hi, " + getStaffName() + " " + getStaffSurname()
				+ " would you like to start your task now?  \n\n type Yes or No.");
		if (query.getUserYesOrNoValidOptio() == 1) {
			setStatus(1);
// start to load the "queue".
			printer.typeWriter("\n\n Grand, let's see how many animals you need to delivery today", 40);

			for (Animals animal : ListWork) {
				System.out.println(animal);
			}
			printer.typeWriter("\n\n Let's get start one by one.", 40);
//  Producing the effect to "adding" and "removing" animals
			for (Animals animal : ListWork) {
				System.out.println(animal);
				query.YesOrNo(2,
						"\n\n Please type   *yes or no*    \n to mark the delivery status. \n\n yes - Done        no - Unresolved");
				if (query.getUserYesOrNoValidOptio() == 1) {
					workDone.add(animal);
//					we could remove the object but we prefer to have the object as record.
				} else if (query.getUserYesOrNoValidOptio() == 0) {
					workUnresolved.add(animal);
				}
			}
//			check if all animals had being done
			if (workDone.size() != ListWork.size()) {

// 				give a chance the user finish the list again.
				query.YesOrNo(2, "\n\n Would you like to finish the animals mark as Unsolved? \n\n type *yes or no*  ");
				if (query.getUserYesOrNoValidOptio() == 1) {
					printer.typeWriter("\n That's nice, let's see how many animals you left behind", 40);

					for (Animals animal : workUnresolved) {
						System.out.println(animal);
					}
					printer.typeWriter("\n\n Let's get start one by one again.", 40);

					for (Animals animal : workUnresolved) {
						System.out.println(animal);
						query.YesOrNo(2,
								"\n\n Please type   *yes or no*    \n to mark the delivery status. \n\n yes - Done        no - Unresolved");
						if (query.getUserYesOrNoValidOptio() == 1) {
							workDone.add(animal);

						} else if (query.getUserYesOrNoValidOptio() == 0) {
							workRecord.add(animal);
						}
					}
				} else if (query.getUserYesOrNoValidOptio() == 0) {
					printer.typeWriter("\n\n Ok this will be record as unsolved.", 40);

					for (Animals animal : workUnresolved) {
						workRecord.add(animal);
					}

				}
			} else {
				printer.typeWriter("\n\n Well done " + getStaffName() + " " + getStaffSurname()
						+ " you finnish all the task raised for you today! ", 40);
			}
//			we could make a statement to clear the records on listWork but we decide leave as it is.

		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter("\n ok, calling the next procedure.  ", 35);
			setStatus(0);
		}
	}

	@Override
	public String toString() {

		return String.format("\n   ID: %s             Name: " + getStaffName() + " " + getStaffSurname()
				+ "\n         Age: " + getAge() + "         Title: Driver "
				+ "           \n\n________________________________________________________________________________________________________________________________________________________",
				getId());
	}

	public List<Animals> getListWork() {
		return ListWork;
	}

	public static void setListWork(List<Animals> listWork) {
		ListWork = listWork;
	}

	public static List<Animals> getWorkDone() {
		return workDone;
	}

	public static void setWorkDone(List<Animals> workDone) {
		Driver.workDone = workDone;
	}

	public static List<Animals> getWorkUnresolved() {
		return workUnresolved;
	}

	public static void setWorkUnresolved(List<Animals> workUnresolved) {
		Driver.workUnresolved = workUnresolved;
	}

}
