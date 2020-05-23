package work;

import java.util.ArrayList;
import java.util.List;

import animals.AnimalFactory;
import animals.Animals;
import staff.Staff;
import staff.StaffFactory;

public class workFactory {

//	Attributes
	private int totalAnimals = 0;
	private int totalAdminStaff = 0;
	private int totalMedicalStaff = 0;
	private int animalsToAdmin = 0;
	private int animalsToMedical = 0;
	private int indexAllAnimals = 0;

//	instantiations
	AnimalFactory animal = new AnimalFactory();
	StaffFactory staff = new StaffFactory();

//	creating the lists
	protected static List<Animals> loadingAnimalsForAdmin;
	protected static List<Animals> loadingAnimalsForMedical;
	protected static List<Animals> allAnimals;
	protected static List<Staff> adminStaff;
	protected static List<Staff> medicalStaff;
	

	public workFactory() {
		loadingAnimalsForAdmin = new ArrayList<Animals>();
		loadingAnimalsForMedical = new ArrayList<Animals>();
		allAnimals = new ArrayList<Animals>();
		adminStaff = new ArrayList <Staff>();
		medicalStaff = new ArrayList<Staff>();
	}

	public void LoadingAnimals() {
//		loading the results to divide the animals
		totalAnimals = animal.getTotalAnimals();

//		we will divide 1/3 for admin and 2/3 to medical.
		animalsToAdmin = (totalAnimals / 3);
		animalsToMedical = (totalAnimals / 3) * 2;

		animal.getListOfAnimals();
		for (Animals animal : animal.getListOfAnimals()) {
			allAnimals.add(animal);
		}
//		this attribute will be the index
		indexAllAnimals = 0;
//		loop to divide the animals 
		for (Animals animal : allAnimals) {
			if (indexAllAnimals <= animalsToAdmin) {
				loadingAnimalsForAdmin.add(animal);
			} else if (indexAllAnimals > animalsToAdmin) {
				loadingAnimalsForMedical.add(animal);
			}
			indexAllAnimals++;
		}

	}

	public void SendAnimalsToStaff() {

//		loading the results to divide per staff
		totalAdminStaff = staff.getTotalAdmin();
		totalMedicalStaff = staff.getTotalMedical();

		StaffFactory.getAdminStaff();
		for (Staff staff : StaffFactory.getAdminStaff()) {
			adminStaff.add(staff);
		}
		StaffFactory.getMedicalStaff();
		for(Staff staff : StaffFactory.getMedicalStaff()) {
			medicalStaff.add(staff);
		}
		
		
	}
}
