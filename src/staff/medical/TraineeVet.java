package staff.medical;

import graphical.Graphical;
import queryAndValidations.UserInteraction;
import staff.Staff;

public class TraineeVet extends Staff {

	public TraineeVet(String staffName, String staffSurname, String gender, int workFunction, double salaryLevel,
			int monthsOnCompany, int age, int function,String title, int phoneN1, int phoneN2, int phoneN3, String day,
			String month, int year, String nationality, String maritalStatus) {
		super(staffName, staffSurname, gender, workFunction, salaryLevel, monthsOnCompany, age,function,title,phoneN1,phoneN2,phoneN3,day,month,year,nationality,maritalStatus);
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
	
	return String.format("\n   ID: %s             Name: " + getStaffName() +" "+getStaffSurname()+ "\n         Age: "+ getAge() +"         Title: Trainee Veterinarian "
			+ "           \n\n________________________________________________________________________________________________________________________________________________________", getId());
	}
}
