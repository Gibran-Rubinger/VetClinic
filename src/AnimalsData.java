import java.util.ArrayList;
import java.util.Random;

public class AnimalsData {
	
//	define the size of the array with this integer.
	int size = 1000;
	int idObj =0;
	
//	method responsible to populate 1.000 animals in a random way.
	public void addAnimal() {
		
//		generate the Array to storage the 1.000 random Animals.
		Animals[] listOfAnimals;
		
//		instantiation of the Array
		listOfAnimals = new Animals[size];
		
//		generating the Array for populating the objects.
		String[] poolOfNames = {"Deco","Bob","Joly","Laize"};
		String[] poolOfSpecies = {"Dog","Cat", "Domestic Pig", "Cockatiel", "Oscar Fish","Rabbit"};
		String[] poolOfGender = {"Male","Female"};
		String[] poolOfMedicalCond = {"A","B","C","D","E","F","G"};
		
//		Instantiation the random method.
		Random myRandom = new Random();
		

		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < listOfAnimals.length; i++) {
//          Generate the id 
			idObj+= i;
			
//			every attribute of the object is picked using the random method.
			listOfAnimals[i] = new Animals(idObj, poolOfNames[myRandom.nextInt(poolOfNames.length)], (myRandom.nextInt(15)+1), poolOfSpecies[myRandom.nextInt(poolOfSpecies.length)], poolOfGender[myRandom.nextInt(poolOfGender.length)], poolOfMedicalCond[myRandom.nextInt(poolOfMedicalCond.length)]);
		}
//		print the all list
		for(Animals print : listOfAnimals) {
		System.out.println(print);
		}
//		counting the numbers of item in the Array.
		System.out.println(" The Total of Animals in the system is:  " + listOfAnimals.length);
	}

}
