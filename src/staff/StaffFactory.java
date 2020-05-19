package staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import graphical.Graphical;
import staff.admin.Receptionist;

public class StaffFactory {
	
	private int adminWorkers = 0;
	private int medicalWorkers =0;
	private int genderMaker = 0;
	private int workMonth = 0;
	private int ageMaker = 0;
	private int salaryMaker = 0;
	private double salary = 0.00;
	private int function = 0;
	
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
		
		public void Admin(int bunch) {
//			For loop responsible to generate the objects. 
			for (int i = 0; i < bunch; i++) {
				String maleFistName = data.maleName[myRandom.nextInt(data.maleName.length)];
				String femaleFirstName = data.femaleName[myRandom.nextInt(data.femaleName.length)];
				String surname = data.Surnames[myRandom.nextInt(data.Surnames.length)];
				
				workMonth = myRandom.nextInt(72) + 1;
				ageMaker = myRandom.nextInt(60) +1;
				salaryMaker = myRandom.nextInt(4);
				function = myRandom.nextInt(2);
				
//				Receptionist salary
				if(function == 0) {
				
					switch(salaryMaker) {
					case 0 : salary = 26300.00;
					break;
					case 1 : salary = 24400.00;
					break;
					case 2 : salary = 2100.00;
					break;
					case 3 : salary = 22500.00;
					break;
					case 4 : salary = 23300.00;
					break;
					}
//					driver salary
				}else if (function ==1) {
					switch(salaryMaker) {
					case 0 : salary = 26300.00;
					break;
					case 1 : salary = 24400.00;
					break;
					case 2 : salary = 2100.00;
					break;
					case 3 : salary = 22500.00;
					break;
					case 4 : salary = 23300.00;
					break;
					}
				}
//				driver salary
			}else if (function ==2) {
				switch(salaryMaker) {
				case 0 : salary = 26300.00;
				break;
				case 1 : salary = 24400.00;
				break;
				case 2 : salary = 2100.00;
				break;
				case 3 : salary = 22500.00;
				break;
				case 4 : salary = 23300.00;
				break;
				}
				
				genderMaker += i;
				
				if (genderMaker % 2 == 0) {
					allStaff.add(new Receptionist(femaleFirstName, surname, "female", workFunction, salary, workMonth, ageMaker, function));
				}else if(genderMaker == 0) {
					
				}
				
		}
	}
	

}
