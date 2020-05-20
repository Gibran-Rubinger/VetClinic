package staff.admin;

import graphical.Graphical;
import queryAndValidations.UserInteraction;
import staff.Staff;

public class Driver extends Staff {

	public Driver(String staffName, String staffSurname, String gender, int workFunction, double salaryLevel,
			int monthsOnCompany, int age, int function) {
		super(staffName, staffSurname, gender, workFunction, salaryLevel, monthsOnCompany, age,function);
		this.setStaffName(staffName);
		this.setStaffSurname(staffSurname);
		this.setGender(gender);
		this.setWorkFunction(workFunction);
		this.setSalaryLevel(salaryLevel);
		this.setMonthsOnCompany(monthsOnCompany);
		this.setAge(age);
		this.setFunction(function);
	}
	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	
	public void jobDaily() {
		query.YesOrNo(4, "\n\n\n Hi" + getStaffName() + " " + getStaffSurname()
				+ " would you like to start your job  now?  \n\n type Yes or No.");
		if (query.getUserYesOrNoValidOptio() == 1) {
			setStatus(1);
			
			/*
			*
			*
			*
			*
			*/
			
		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter(" ok, calling the next procedure.  ", 35);
			setStatus(0);
		}
	}
	@Override
	public String toString() {
		return "\n   ID: " + getId() + "\n   Name: " + getStaffName() +" "+getStaffSurname()+ "         Age: " + getAge() +"         Title: Driver "
				+ "           \n\n________________________________________________________________________________________________________________________________________________________";
	}
}
