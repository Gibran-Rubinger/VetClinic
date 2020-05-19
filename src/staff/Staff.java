package staff;

import java.rmi.server.UID;
import java.util.Random;

import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class Staff {
//	We could implement the same solution for animals but we decide to leave as is there just to have more than one way to solve it.
	private UID id = new UID();
	private String staffName = "";
	private String staffSurname = "";
	private String gender = "";
	private String workFunction = "";
	private String status = "";
	private String promoted = "UNREALISED";
	private String day = "";
	private String month = "";
	private String nationality = "";
	private String maritalStatus = "";
	private double salaryLevel = 0.00;
	private int year = 0;
	
	private int monthsOnCompany = 0;
	private int promotion = 0;
	private int phoneN1 = 0;
	private int phoneN2 = 0;
	private int phoneN3 = 0;
	private int age = 0;
	

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	Random myRandom = new Random();
	StaffData data = new StaffData();
	
	

	public Staff(UID id, String staffName, String staffSurname, String gender, String workFunction, double salaryLevel,
			 int monthsOnCompany) {
		this.id = id;
		this.staffName = staffName;
		this.staffSurname = staffSurname;
		this.gender = gender;
		this.workFunction = workFunction;
		this.salaryLevel = salaryLevel;
		this.monthsOnCompany = monthsOnCompany;
	}

	public void Promotion() {
		query.YesOrNo(4, "\n\n\n Would you like to check the status of " + staffName + " " + staffSurname
				+ " on the promotion policy?  \n\n type Yes or No.");
		// chose a option

		if (query.getUserYesOrNoValidOptio() == 1) {

			printer.typeWriter("At moment " + staffName + " " + staffSurname + " has been working for "
					+ monthsOnCompany + " in this company ", 35);

			if (monthsOnCompany >= 16 && monthsOnCompany <= 30) {
				printer.typeWriter("\n\n  The avalible status for promotion is: \n STAGE ONE - between 16 to 30 months",
						35);
				promotion = 1;

			} else if (monthsOnCompany >= 31 && monthsOnCompany <= 48) {
				printer.typeWriter(
						"\n\n  The avalible status for promotion is: \n STAGE TWO  - between 31 to 40 months", 35);
				promotion = 2;

			} else if (monthsOnCompany >= 32 && monthsOnCompany <= 72) {
				printer.typeWriter(
						"\n\n  The avalible status for promotion is: \n STAGE THREE  - between 31 to 40 months", 35);
				promotion = 3;
			}
				query.YesOrNo(4, "\n\n\n Would you like to PROCEED with the promotion for " + staffName + " "
						+ staffSurname + " ?  \n\n type Yes or No.");
				if (query.getUserYesOrNoValidOptio() == 1) {
					
					switch (promotion) {

					case 1:
						salaryLevel = salaryLevel * 0.25 + salaryLevel;
						promoted = "STAGE ONE";
						break;
					case 2:
						salaryLevel = salaryLevel * 0.35 + salaryLevel;
						promoted = "STAGE TWO";
						break;
					case 3:
						salaryLevel = salaryLevel * 0.40 + salaryLevel;
						promoted = "STAGE THREE";
						break;
					}
					printer.typeWriter("staff salary updated successful", 35);

				} else if (query.getUserYesOrNoValidOptio() == 0) {
					printer.typeWriter("NO CHANGES on the staff ", 35);
				}
			
		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter(" ok, calling the next procedure.  ", 35);
		}
	}

	
	public void info() {
//		 doing random phones
		int number1StartBunch = 80;
		int number1FinishBunch = 89;
		int number2StartBunch = 100;
		int number2FinishBunch = 999;
		int number3StartBunch = 1000;
		int number3FinishBunch = 9999;
		phoneN1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1) + number1StartBunch);
		phoneN2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1) + number2StartBunch);
		phoneN3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1) + number3StartBunch);
		
//		birthday
		int yearStart = 1960;
		int yeardone = 2000;
		day = data.day[myRandom.nextInt(data.day.length)];
		month = data.month[myRandom.nextInt(data.month.length)];
		year = (myRandom.nextInt(yeardone - yearStart + 1) + yearStart);
		
		nationality = data.nationality[myRandom.nextInt(data.nationality.length)];
		maritalStatus = data.maritalStatus [myRandom.nextInt(data.maritalStatus.length)];
		
		
		
		System.out.println("ID: "+id+"     NAME: "+staffName+"    SURNAME: "+staffSurname+"       Phone number: +353 0" + phoneN1 + "." + phoneN2 + "." + phoneN3 + 
				"\n\n      E-mail:  "+ staffName.toLowerCase() + "." +staffSurname.toLowerCase() + "@cct.ie    Age: "+age+"    Birth date: "+day+"/"+month+"/"+year+
				"\n     Gender:"+gender+"     Nationality:  "+nationality+" t");
		System.out.println(" \n   PROMOTION POLICY: "+promoted+"     MARITAL STATUS: "+maritalStatus);
	}

	
	public void jobDaly() {
		query.YesOrNo(4, "\n\n\n Hi" + staffName + " " + staffSurname
				+ " would you like to start your job  now?  \n\n type Yes or No.");
		printer.typeWriter(" Today we had schedule for you "++" g", 20);

		if (query.getUserYesOrNoValidOptio() == 1) {
			
		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter(" ok, calling the next procedure.  ", 35);
		}
	}
}
