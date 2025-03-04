package staff;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import animals.Animals;
import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class Staff {
//	We could implement the same solution for animals but we decide to leave as is there just to have more than one way to solve it.
	private UID id = new UID();
	private String staffName = "";
	private String staffSurname = "";
	private String gender = "";
	private String promoted = "UNREALISED";
	private String day = "";
	private String month = "";
	private String nationality = "";
	private String maritalStatus = "";
	private String title = "";
	private double salaryLevel = 0.00;
	private int workFunction = 0;
	private int year = 0;
	private int status = 0;
	private int monthsOnCompany = 0;
	private int promotion = 0;
	private int phoneN1 = 0;
	private int phoneN2 = 0;
	private int phoneN3 = 0;
	private int age = 0;
	private int function = 0;

	protected static List<Animals> ListWork;
	protected static List<Animals> workDone;
	protected static List<Animals> workUnresolved;
	protected static List<Animals> workRecord;

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	Random myRandom = new Random();
	StaffData data = new StaffData();

	public Staff(String staffName, String staffSurname, String gender, int workFunction, double salaryLevel,
			int monthsOnCompany, int age, int funciton, String title, int phoneN1, int phoneN2, int phoneN3, String day,
			String month, int year, String nationality, String maritalStatus) {

		this.staffName = staffName;
		this.staffSurname = staffSurname;
		this.gender = gender;
		this.workFunction = workFunction;
		this.salaryLevel = salaryLevel;
		this.monthsOnCompany = monthsOnCompany;
		this.age = age;
		this.function = funciton;
		this.title = title;
		this.phoneN1 = phoneN1;
		this.phoneN2 = phoneN2;
		this.phoneN3 = phoneN3;
		this.day = day;
		this.month = month;
		this.year = year;
		this.nationality = nationality;
		this.maritalStatus = maritalStatus;
		ListWork = new ArrayList<Animals>();
		workDone = new ArrayList<Animals>();
		workUnresolved = new ArrayList<Animals>();
		workRecord = new ArrayList<Animals>();
	}

	public void Promotion() {
		boolean promoDone = false;
		query.YesOrNo(4, "\n\n\n Would you like to check the status of " + staffName + " " + staffSurname
				+ " on the promotion policy?  \n\n type Yes or No.");
		// chose a option

		if (query.getUserYesOrNoValidOptio() == 1) {

			printer.typeWriter("At moment " + staffName + " " + staffSurname + " has been working for "
					+ monthsOnCompany + " months in this company ", 35);

			if (monthsOnCompany < 16) {
				printer.typeWriter("\n\n  Unfortunately" + staffName + " " + staffSurname
						+ " has not complete at least 16 months to get into a STAGE ONE policy :(", 35);
			}

			else if (monthsOnCompany >= 16 && monthsOnCompany <= 30) {
				printer.typeWriter("\n\n  The avalible status for promotion is: \n STAGE ONE - between 16 to 30 months",
						35);
				promotion = 1;

			} else if (monthsOnCompany >= 31 && monthsOnCompany <= 48) {
				printer.typeWriter(
						"\n\n  The avalible status for promotion is: \n STAGE TWO  - between 31 to 40 months", 35);
				promotion = 2;

			} else if (monthsOnCompany >= 32 && monthsOnCompany <= 72) {
				printer.typeWriter(
						"\n\n  The avalible status for promotion is: \n STAGE THREE  - between 32 to 72 months", 35);
				promotion = 3;
			}
			query.YesOrNo(4, "\n\n\n Would you like to PROCEED with the promotion for " + staffName + " " + staffSurname
					+ " ?  \n\n type Yes or No.");
			if (query.getUserYesOrNoValidOptio() == 1) {

				switch (promotion) {

				case 1:
					salaryLevel = salaryLevel * 0.25 + salaryLevel;
					promoted = "STAGE ONE";
					promoDone = true;
					break;
				case 2:
					salaryLevel = salaryLevel * 0.35 + salaryLevel;
					promoted = "STAGE TWO";
					promoDone = true;
					break;
				case 3:
					salaryLevel = salaryLevel * 0.40 + salaryLevel;
					promoted = "STAGE THREE";
					promoDone = true;
					break;
				}
				printer.typeWriter("staff salary updated successful", 35);

			} else if (query.getUserYesOrNoValidOptio() == 0) {
				printer.typeWriter("NO CHANGES on the staff ", 35);
			}

		}
		if (promoDone == true) {
			query.YesOrNo(2, "\n\n Would you like to see the staff information again?\nType yes or no.\n\n");
			if (query.getUserYesOrNoValidOptio() == 1) {
				info();

			} else if (query.getUserYesOrNoValidOptio() == 0) {
				printer.typeWriter("Ok, all the changes has been record. and " + staffName
						+ " will have a great surprise! go there and give the great news.", 50);
			}
		} else if (promoDone == false) {
			if (query.getUserYesOrNoValidOptio() == 0) {
				printer.typeWriter(" ok, calling the next procedure.  ", 35);
			}
		}
	}

	public void info() {

		System.out.println("ID: " + id + "     NAME: " + getStaffName() + "    SURNAME: " + getStaffSurname()
				+ "           Phone number: +353 0" + getPhoneN1() + "." + getPhoneN2() + "." + getPhoneN3()
				+ "\n\n      E-mail:  " + getStaffName().toLowerCase() + "." + getStaffSurname().toLowerCase()
				+ "@cct.ie    Age: " + getAge() + "    Birth date: " + getDay() + "/" + getMonth() + "/" + getYear()
				+ "\n      Gender:" + getAge() + "            Nationality:  " + getNationality()
				+ "             TITLE: " + getTitle());
		printer.typeWriter("_______________________________________________________________________________________"
				+ "\n      SALARY:" + salaryLevel, 35);
		printer.typeWriter(
				" \n      PROMOTION POLICY: " + promoted + "                 MARITAL STATUS: " + maritalStatus, 40);

		Promotion();
	}

	public void jobDaily() {
		query.YesOrNo(4, "\n\n\n Hi, " + getStaffName() + " " + getStaffSurname()
				+ " would you like to start your task now?  \n\n type Yes or No.");
		if (query.getUserYesOrNoValidOptio() == 1) {
			setStatus(1);
//start to load the "queue".
			printer.typeWriter("\n\n Grand, let's see how many animals you need to delivery today", 40);

			for (Animals animal : ListWork) {
				System.out.println(animal);
			}
			printer.typeWriter("\n\n Let's get start one by one.", 40);
//Producing the effect to "adding" and "removing" animals
			for (Animals animal : ListWork) {
				System.out.println(animal);
				query.YesOrNo(2,
						"\n\n Please type   *yes or no*    \n to mark the delivery status. \n\n yes - Done        no - Unresolved");
				if (query.getUserYesOrNoValidOptio() == 1) {
					workDone.add(animal);
//			we could remove the object but we prefer to have the object as record.
				} else if (query.getUserYesOrNoValidOptio() == 0) {
					workUnresolved.add(animal);
				}
			}
//	check if all animals had being done
			if (workDone.size() != ListWork.size()) {

//			give a chance the user finish the list again.
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
//	we could make a statement to clear the records on listWork but we decide leave as it is.

		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter("\n ok, calling the next procedure.  ", 35);
			setStatus(0);
		}
	}

	public UID getId() {
		return id;
	}

	public void setId(UID id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffSurname() {
		return staffSurname;
	}

	public void setStaffSurname(String staffSurname) {
		this.staffSurname = staffSurname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPromoted() {
		return promoted;
	}

	public void setPromoted(String promoted) {
		this.promoted = promoted;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public double getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public int getWorkFunction() {
		return workFunction;
	}

	public void setWorkFunction(int workFunction) {
		this.workFunction = workFunction;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getMonthsOnCompany() {
		return monthsOnCompany;
	}

	public void setMonthsOnCompany(int monthsOnCompany) {
		this.monthsOnCompany = monthsOnCompany;
	}

	public int getPromotion() {
		return promotion;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	public int getPhoneN1() {
		return phoneN1;
	}

	public void setPhoneN1(int phoneN1) {
		this.phoneN1 = phoneN1;
	}

	public int getPhoneN2() {
		return phoneN2;
	}

	public void setPhoneN2(int phoneN2) {
		this.phoneN2 = phoneN2;
	}

	public int getPhoneN3() {
		return phoneN3;
	}

	public void setPhoneN3(int phoneN3) {
		this.phoneN3 = phoneN3;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFunction() {
		return function;
	}

	public void setFunction(int function) {
		this.function = function;
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
		Staff.workDone = workDone;
	}

	public static List<Animals> getWorkUnresolved() {
		return workUnresolved;
	}

	public static void setWorkUnresolved(List<Animals> workUnresolved) {
		Staff.workUnresolved = workUnresolved;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + function;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + monthsOnCompany;
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + phoneN1;
		result = prime * result + phoneN2;
		result = prime * result + phoneN3;
		result = prime * result + ((promoted == null) ? 0 : promoted.hashCode());
		result = prime * result + promotion;
		long temp;
		temp = Double.doubleToLongBits(salaryLevel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((staffName == null) ? 0 : staffName.hashCode());
		result = prime * result + ((staffSurname == null) ? 0 : staffSurname.hashCode());
		result = prime * result + status;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + workFunction;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (age != other.age)
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (function != other.function)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (monthsOnCompany != other.monthsOnCompany)
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (phoneN1 != other.phoneN1)
			return false;
		if (phoneN2 != other.phoneN2)
			return false;
		if (phoneN3 != other.phoneN3)
			return false;
		if (promoted == null) {
			if (other.promoted != null)
				return false;
		} else if (!promoted.equals(other.promoted))
			return false;
		if (promotion != other.promotion)
			return false;
		if (Double.doubleToLongBits(salaryLevel) != Double.doubleToLongBits(other.salaryLevel))
			return false;
		if (staffName == null) {
			if (other.staffName != null)
				return false;
		} else if (!staffName.equals(other.staffName))
			return false;
		if (staffSurname == null) {
			if (other.staffSurname != null)
				return false;
		} else if (!staffSurname.equals(other.staffSurname))
			return false;
		if (status != other.status)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (workFunction != other.workFunction)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
