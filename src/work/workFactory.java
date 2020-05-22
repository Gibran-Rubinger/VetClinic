package work;

import java.util.ArrayList;
import java.util.List;

import animals.AnimalFactory;
import animals.Animals;
import staff.StaffFactory;

public class workFactory {

//	Attributes
	private int totalAnimals =0;
	private int totalStaff =0;
	
//	instantiations
	AnimalFactory animal = new AnimalFactory();
	StaffFactory staff = new StaffFactory();
	
//	creating the lists
	protected static List<Animals> bunch;
	
	
	public workFactory() {
		 bunch = new ArrayList<>();
	}
	
	public void LoadingAnimals() {
		totalAnimals = animal.getTotalAnimals();
			
	}
}
