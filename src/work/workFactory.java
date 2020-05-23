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
	@SuppressWarnings("unused")
	private int totalMedicalStaff = 0;
	private int animalsToAdmin = 0;
	@SuppressWarnings("unused")
	private int animalsToMedical = 0;
	private int indexAllAnimals = 0;
	private int indexAdmin = 0;
	private int indexMedical = 0;

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
		adminStaff = new ArrayList<Staff>();
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

		StaffFactory.getAdminStaff();
		for (Staff staff : StaffFactory.getAdminStaff()) {
			adminStaff.add(staff);
		}
		StaffFactory.getMedicalStaff();
		for (Staff staff : StaffFactory.getMedicalStaff()) {
			medicalStaff.add(staff);
		}
//		loading the results to divide per staff
		totalAdminStaff = adminStaff.size();
		totalMedicalStaff = medicalStaff.size();

//		divide how many animals will be send to each staff.
		int amountAdmin = 0;
		int amountAdminOdd = 0;
		int amountMedical = 0;
		int amountMedicalOdd = 0;
//		amountAdmin = animalsToAdmin / totalAdminStaff;
//		amountMedical = animalsToMedical / totalMedicalStaff;
		if (animalsToAdmin % totalAdminStaff == 0) {
			amountAdmin = animalsToAdmin / totalAdminStaff;
		} else if (animalsToAdmin % totalAdminStaff != 0) {
			amountAdminOdd = (animalsToAdmin / totalAdminStaff) + 1;
		}
		if (animalsToAdmin % totalAdminStaff == 0) {
			amountMedical = animalsToAdmin / totalAdminStaff;
		} else if (animalsToAdmin % totalAdminStaff != 0) {
			amountMedicalOdd = (animalsToAdmin / totalAdminStaff) + 1;
		}

//		this attribute will be the index
		indexAdmin = 0;
		for (Staff staff : adminStaff) {
			if (indexAdmin < (adminStaff.size() - 1)) {
				for (int i = 0; i < amountAdmin; i++) {
					for (Animals animal : loadingAnimalsForAdmin) {
						staff.getListWork().add(animal);
					}
				}
			}
			indexAdmin++;
			if (indexAdmin == adminStaff.size()) {
				for (int i = 0; i < amountAdminOdd; i++) {
					for (Animals animal : loadingAnimalsForAdmin) {
						staff.getListWork().add(animal);
					}
				}
			}

		}

		indexMedical = 0;
		for (Staff staff : medicalStaff) {
			if (indexMedical < (medicalStaff.size() - 1)) {
				for (int i = 0; i < amountMedical; i++) {
					for (Animals animal : loadingAnimalsForMedical) {
						staff.getListWork().add(animal);
					}
				}
			}
			indexMedical++;
			if (indexMedical == adminStaff.size()) {
				for (int i = 0; i < amountMedicalOdd; i++) {
					for (Animals animal : loadingAnimalsForMedical) {
						staff.getListWork().add(animal);
					}
				}
			}

		}

	}
}
