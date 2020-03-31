import java.util.ArrayList;
import java.util.Random;

public class AnimalsData {
	int size = 1000;
	
	public void addAnimal() {
		Animals[] listOfAnimals;
		
		listOfAnimals = new Animals[size];
		String[] poolOfNames = {"Deco","Bob","Joly","Laize"};
		String[] poolOfSpecies = {"Dog","Cat", "Domestic Pig", "Cockatiel", "Oscar Fish","Rabbit"};
		String[] poolOfGender = {"Male","Female"};
		String[] poolOfMedicalCond = {"A","B","C","D","E","F","G"};
		
		
		Random myRandom = new Random();
		
//		generate the animal id
		
//		generate the objects
		for(int i = 0; i < listOfAnimals.length; i++) {
			
			listOfAnimals[i] = new Animals(0000, poolOfNames[myRandom.nextInt(poolOfNames.length)], myRandom.nextInt(15), poolOfSpecies[myRandom.nextInt(poolOfSpecies.length)], poolOfGender[myRandom.nextInt(poolOfGender.length)], poolOfMedicalCond[myRandom.nextInt(poolOfMedicalCond.length)]);
		}
		
		System.out.println(listOfAnimals);
	}

}
