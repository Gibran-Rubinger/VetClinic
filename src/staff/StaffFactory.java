package staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import graphical.Graphical;
import staff.admin.*;
import staff.medical.Nurse;
import staff.medical.TraineeVet;
import staff.medical.Veterinarian;

public class StaffFactory {

	private String addGender = "";
	private String addName = "";
	private String addSurname = "";
	private String addTitle = "";
	private int genderMaker = 0;
	private int workMonth = 0;
	private int ageMaker = 0;
	private int salaryMaker = 0;
	private double salary = 0.00;
	private int function = 0;
	private int workF = 0;
	private int startAge = 20;
	private int finishAge = 65;
	
	private int number1StartBunch = 80;
	private int number1FinishBunch = 89;
	private int number2StartBunch = 100;
	private int number2FinishBunch = 999;
	private int number3StartBunch = 1000;
	private int number3FinishBunch = 9999;
	private int yeardone = 2020;
	
	private int addPhoneN1 = 0;
	private int addPhoneN2 = 0;
	private int addPhoneN3 = 0;
	private int addYear = 0;
	private String addDay = "";
	private String addMonth = "";
	private String addNationality = "";
	private String addMaritalStatus = "";
	private int totalAdmin = 0;
	private int totalMedical = 0;

	Graphical printer = new Graphical();
	Random myRandom = new Random();
	StaffData data = new StaffData();

	protected static List<Staff> allStaff;
	protected static List<Staff> adminStaff;
	protected static List<Staff> medicalStaff;

	public StaffFactory() {
		allStaff = new ArrayList<Staff>();
		adminStaff = new ArrayList<Staff>();
		medicalStaff = new ArrayList<Staff>();
	}

	public void Admin(int adminWorkers) {
		totalAdmin = adminWorkers;
//			For loop responsible to generate the objects. 
		for (int i = 0; i < adminWorkers; i++) {
			String maleFirstName = data.maleName[myRandom.nextInt(data.maleName.length)];
			String femaleFirstName = data.femaleName[myRandom.nextInt(data.femaleName.length)];
			String surname = data.Surnames[myRandom.nextInt(data.Surnames.length)];
			addSurname = surname;

			workMonth = myRandom.nextInt(72) + 1;
			ageMaker = (myRandom.nextInt(finishAge - startAge + 1) + startAge);
			function = myRandom.nextInt(3);
			salaryMaker = myRandom.nextInt(5);
			workF = myRandom.nextInt(3);

//			 doing random phones
			addPhoneN1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1) + number1StartBunch);
			addPhoneN2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1) + number2StartBunch);
			addPhoneN3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1) + number3StartBunch);

//		birthday

			addDay = data.day[myRandom.nextInt(data.day.length)];
			addMonth = data.month[myRandom.nextInt(data.month.length)];
			addYear = (yeardone - ageMaker);

			addNationality = data.nationality[myRandom.nextInt(data.nationality.length)];
			addMaritalStatus = data.maritalStatus[myRandom.nextInt(data.maritalStatus.length)];
			
//				Receptionist 
			if (function == 0) {
				addTitle = "Receptionist";
				switch (salaryMaker) {
				case 0:
					salary = 26300.00;
					break;
				case 1:
					salary = 24400.00;
					break;
				case 2:
					salary = 21000.00;
					break;
				case 3:
					salary = 22500.00;
					break;
				case 4:
					salary = 23300.00;
					break;
				}
//					driver salary
			} else if (function == 1) {
				addTitle = "Driver";
				switch (salaryMaker) {
				case 0:
					salary = 25700.00;
					break;
				case 1:
					salary = 24600.00;
					break;
				case 2:
					salary = 23100.00;
					break;
				case 3:
					salary = 22500.00;
					break;
				case 4:
					salary = 20300.00;
					break;
				}
			}
//				IT Helpdesk salary
			else if (function == 2) {
				addTitle = "Helpdesk";
				switch (salaryMaker) {
				case 0:
					salary = 46300.00;
					break;
				case 1:
					salary = 34400.00;
					break;
				case 2:
					salary = 3100.00;
					break;
				case 3:
					salary = 42500.00;
					break;
				case 4:
					salary = 33300.00;
					break;
				}
			}
			genderMaker = i;

			if (genderMaker % 2 == 0) {
				addGender = "Female";
				addName = femaleFirstName;
			} else if (genderMaker % 2 != 0) {
				addGender = "Male";
				addName = maleFirstName;
			}

			if (function == 0) {
				
// int phoneN1, int phoneN2, int phoneN3, String day,
//				String month, int year, String nationality, String maritalStatus) 
				
				adminStaff.add(new Receptionist(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
						function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
			} else if (function == 1) {
				adminStaff.add(new Driver(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
						function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
			} else if (function == 2) {
				adminStaff.add(new ITHelpdesk(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
						function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
			}

		}
		for (Staff print : adminStaff) {
			System.out.println(print);
		}
//		counting the numbers of item in the Array.
		printer.typeWriter("\n" + "The Total of admin staff in the system is:  ", 50);
		System.out.println(adminStaff.size());

	}

	public void medical(int medicalWorkers) {
		totalMedical = medicalWorkers;
//		
		for (int vet = 0; vet < 5; vet++) {
			String maleFirstName = data.maleName[myRandom.nextInt(data.maleName.length)];
			String femaleFirstName = data.femaleName[myRandom.nextInt(data.femaleName.length)];
			String surname = data.Surnames[myRandom.nextInt(data.Surnames.length)];
			addSurname = surname;

			workMonth = myRandom.nextInt(72) + 1;
			ageMaker = (myRandom.nextInt(finishAge - startAge + 1) + startAge);
			function = myRandom.nextInt(3);
			salaryMaker = myRandom.nextInt(5);
			workF = myRandom.nextInt(3);

//			 doing random phones
			addPhoneN1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1) + number1StartBunch);
			addPhoneN2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1) + number2StartBunch);
			addPhoneN3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1) + number3StartBunch);

//		birthday

			addDay = data.day[myRandom.nextInt(data.day.length)];
			addMonth = data.month[myRandom.nextInt(data.month.length)];
			addYear = (yeardone - ageMaker);

			addNationality = data.nationality[myRandom.nextInt(data.nationality.length)];
			addMaritalStatus = data.maritalStatus[myRandom.nextInt(data.maritalStatus.length)];

//			IT Veterinarian salary
			addTitle = "Veterinarian";
			switch (salaryMaker) {
			case 0:
				salary = 56300.00;
				break;
			case 1:
				salary = 54400.00;
				break;
			case 2:
				salary = 5100.00;
				break;
			case 3:
				salary = 52500.00;
				break;
			case 4:
				salary = 53300.00;
				break;
			}

			genderMaker = vet;

			if (genderMaker % 2 == 0) {
				addGender = "Female";
				addName = femaleFirstName;
			} else if (genderMaker % 2 != 0) {
				addGender = "Male";
				addName = maleFirstName;
			}
			medicalStaff.add(
					new Veterinarian(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
							function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
		}

//		removing 5 from the total as we had created the 5 veterinarian above.
		medicalWorkers = (medicalWorkers - 5);
//		For loop responsible to generate the objects.		
		for (int i = 0; i < medicalWorkers; i++) {
			String maleFirstName = data.maleName[myRandom.nextInt(data.maleName.length)];
			String femaleFirstName = data.femaleName[myRandom.nextInt(data.femaleName.length)];
			String surname = data.Surnames[myRandom.nextInt(data.Surnames.length)];
			addSurname = surname;

			workMonth = myRandom.nextInt(72) + 1;
			ageMaker = (myRandom.nextInt(finishAge - startAge + 1) + startAge);
			function = myRandom.nextInt(3);
			salaryMaker = myRandom.nextInt(5);
			workF = myRandom.nextInt(3);

//			 doing random phones
			addPhoneN1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1) + number1StartBunch);
			addPhoneN2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1) + number2StartBunch);
			addPhoneN3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1) + number3StartBunch);

//		birthday

			addDay = data.day[myRandom.nextInt(data.day.length)];
			addMonth = data.month[myRandom.nextInt(data.month.length)];
			addYear = (yeardone - ageMaker);

			addNationality = data.nationality[myRandom.nextInt(data.nationality.length)];
			addMaritalStatus = data.maritalStatus[myRandom.nextInt(data.maritalStatus.length)];
//			Trainee 
			if (function == 0) {
				addTitle = "Trainee";
				switch (salaryMaker) {
				case 0:
					salary = 36300.00;
					break;
				case 1:
					salary = 34400.00;
					break;
				case 2:
					salary = 31000.00;
					break;
				case 3:
					salary = 32500.00;
					break;
				case 4:
					salary = 33300.00;
					break;
				}
//				nurse salary
			} else if (function == 1) {
				addTitle = "Nurse";
				switch (salaryMaker) {
				case 0:
					salary = 45700.00;
					break;
				case 1:
					salary = 44600.00;
					break;
				case 2:
					salary = 43100.00;
					break;
				case 3:
					salary = 42500.00;
					break;
				case 4:
					salary = 40300.00;
					break;
				}
			}
//			IT Veterinarian salary
			else if (function == 2) {
				addTitle = "Veterinarian";
				switch (salaryMaker) {
				case 0:
					salary = 56300.00;
					break;
				case 1:
					salary = 54400.00;
					break;
				case 2:
					salary = 5100.00;
					break;
				case 3:
					salary = 52500.00;
					break;
				case 4:
					salary = 53300.00;
					break;
				}
			}

			genderMaker = i;

			if (genderMaker % 2 == 0) {
				addGender = "Female";
				addName = femaleFirstName;
			} else if (genderMaker % 2 != 0) {
				addGender = "Male";
				addName = maleFirstName;
			}
			if (function == 0) {
				medicalStaff.add(new TraineeVet(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
						function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
			} else if (function == 1) {
				medicalStaff
						.add(new Nurse(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
								function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
			} else if (function == 2) {
				medicalStaff.add(
						new Veterinarian(addName, addSurname, addGender, workF, salary, workMonth, ageMaker,
								function, addTitle, addPhoneN1, addPhoneN2, addPhoneN3, addDay, addMonth, addYear, addNationality, addMaritalStatus));
			}
		}
		for (Staff print : medicalStaff) {
			System.out.println(print);
		}
//	counting the numbers of item in the Array.
		printer.typeWriter("\n" + "The Total of admin staff in the system is:  ", 50);
		System.out.println(medicalStaff.size());

	}

	public void allIn() {
		for (Staff send : adminStaff) {
			allStaff.add(send);
		}
		for (Staff send : medicalStaff) {
			allStaff.add(send);
		}
		printer.typeWriter("\n" + "The Total staff in today is:  ", 50);
		System.out.println(allStaff.size());
	}

}
