package staff.medical;

import graphical.Graphical;
import queryAndValidations.UserInteraction;
import staff.Staff;

public class Nurse extends Staff {

	public Nurse(String staffName, String staffSurname, String gender, int workFunction, double salaryLevel,
			int monthsOnCompany, int age, int function,String title) {
		super(staffName, staffSurname, gender, workFunction, salaryLevel, monthsOnCompany, age,function,title);
		this.setStaffName(staffName);
		this.setStaffSurname(staffSurname);
		this.setGender(gender);
		this.setWorkFunction(workFunction);
		this.setSalaryLevel(salaryLevel);
		this.setMonthsOnCompany(monthsOnCompany);
		this.setAge(age);
		this.setFunction(function);
		this.setTitle(title);
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
	
	return String.format("\n   ID: %s             Name: " + getStaffName() +" "+getStaffSurname()+ "\n         Age: "+ getAge() +"         Title: Nurse "
			+ "           \n\n________________________________________________________________________________________________________________________________________________________", getId());
	}
}
