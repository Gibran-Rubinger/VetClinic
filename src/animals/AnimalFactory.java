package animals;
import java.util.ArrayList;
import java.util.Random;

import animals.*;
import animals.commonPets.*;
import animals.birds.*;
import animals.exotic.*;
import animals.farm.*;
import animals.fish.*;
import animals.reptile.*;


public class AnimalFactory {
	
//	define the size of the ArrayList with this integer.
	int animalsQuantity = 1000;
	int idObj =0;
	int speciesGenerator = 0;
	int groupGenerator = 0;
	
	
//	method responsible to populate 1.000 animals in a random way.
	public void addAnimal() {
		
		int number1StartBunch = 80;
		int number1FinishBunch = 89;
		int number2StartBunch = 100;
		int number2FinishBunch = 999;
		int number3StartBunch = 1000;
		int number3FinishBunch = 9999;
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(animalsQuantity);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
				
//	Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();
	
//	For loop responsible to generate the objects. 
	for(int i = 0; i < animalsQuantity; i++) {
		
//		this attribute is responsible for generate in a random way with kind of Species the animal will be.
		groupGenerator = myRandom.nextInt(2);	
		speciesGenerator = myRandom.nextInt(5); 
			
		
//      Generate the id 
		idObj+= i;

//		generate the random attribute just once instead to repeat the same amount of code every time.
//		__________________________________________
//		Loading random Names
		String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
		String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
		
		
//		__________________________________________
//		Medical conditions 
		String dogMedicalCond = database.dogMedCond[myRandom.nextInt(database.dogMedCond.length)];
		String catMedicalCond = database.catMedCond[myRandom.nextInt(database.catMedCond.length)];
		String domesticPigMedicalCond = database.domesticPigMedCond[myRandom.nextInt(database.domesticPigMedCond.length)];
		String rabbitMedicalCond = database.rabbitMedCond[myRandom.nextInt(database.rabbitMedCond.length)];
		String hamisterMedicalCond = database.hamisterMedCond[myRandom.nextInt(database.hamisterMedCond.length)];
		String guineaPigMedicalCond = database.guineaPigMedCond[myRandom.nextInt(database.guineaPigMedCond.length)];
		
		String birdsMedicalCond = database.birdsMedCond[myRandom.nextInt(database.birdsMedCond.length)];
		
//		__________________________________________
//		Loading random Owners
		
		String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
		String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
		
		int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
		int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
		int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
		
//		__________________________________________
//		
		
//		Generate a common pets group.
		if(groupGenerator == 1) {
//								if statement responsible to generate objects per gender.
								if(idObj %2 ==0) {
		
//									Inside the if statement just Female Object.
									if(speciesGenerator == 0) { 
										listOfAnimals.add(new Dog(idObj, femaleAnimalNames, AgeRandom(20), "Dog", " Female ", dogMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 1) { 
										listOfAnimals.add(new Cat(idObj, femaleAnimalNames, AgeRandom(18), "Cat", " Female ", catMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 2) { 
										listOfAnimals.add(new DomesticPig(idObj, femaleAnimalNames, AgeRandom(17), "Domestic Pig", " Female ", domesticPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 3) { 
										listOfAnimals.add(new Rabbit(idObj, femaleAnimalNames, AgeRandom(9), "Rabbit", " Female ", rabbitMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 4) { 
										listOfAnimals.add(new Hamister(idObj, femaleAnimalNames, AgeRandom(3), "Hamister", " Female ", hamisterMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 5) { 
										listOfAnimals.add(new Rabbit(idObj, femaleAnimalNames, AgeRandom(8), "Guinea Pig", " Female ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
								}
		
							    else {
//								Male Object - every attribute of the object is picked using the random method.
							    	if(speciesGenerator == 0) { 
							    		listOfAnimals.add(new Dog(idObj, maleAnimalNames, AgeRandom(20), "Dog", " Male ", dogMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 1) { 
							    		listOfAnimals.add(new Cat(idObj, maleAnimalNames, AgeRandom(18), "Cat", " Male ", catMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 2) { 
							    		listOfAnimals.add(new DomesticPig(idObj, maleAnimalNames, AgeRandom(17), "Domestic Pig", " Male ", domesticPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 3) { 
							    		listOfAnimals.add(new Rabbit(idObj, maleAnimalNames, AgeRandom(9), "Rabbit", " Male ", rabbitMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 4) { 
							    		listOfAnimals.add(new Hamister(idObj, maleAnimalNames, AgeRandom(3), "Hamister", " Male ", hamisterMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 5) { 
							    		listOfAnimals.add(new Rabbit(idObj, maleAnimalNames, AgeRandom(8), "Guinea Pig", " Male ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
			
							    }
						}
		
		else if(groupGenerator == 2) {
//			if statement responsible to generate objects per gender.
			if(idObj %2 ==0) {

//				Inside the if statement just Female Object.
				if(speciesGenerator == 0) { 
					listOfAnimals.add(new Cokcatiel(idObj, femaleAnimalNames, AgeRandom(14), "Cokcatiel", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 1) { 
					listOfAnimals.add(new GoldianFinch(idObj, femaleAnimalNames, AgeRandom(6), "GoldianFinch", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 2) { 
					listOfAnimals.add(new Budgerigar(idObj, femaleAnimalNames, AgeRandom(20), "Domestic Pig", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 3) { 
					listOfAnimals.add(new Cockatoo(idObj, femaleAnimalNames, AgeRandom(70), "Rabbit", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 4) { 
					listOfAnimals.add(new Dove(idObj, femaleAnimalNames, AgeRandom(10), "Hamister", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 5) { 
					listOfAnimals.add(new Parrot(idObj, femaleAnimalNames, AgeRandom(14), "Guinea Pig", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
			}

		    else {
//			Male Object - every attribute of the object is picked using the random method.
		    	if(speciesGenerator == 0) { 
					listOfAnimals.add(new Cokcatiel(idObj, maleAnimalNames, AgeRandom(14), "Cokcatiel", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 1) { 
					listOfAnimals.add(new GoldianFinch(idObj, maleAnimalNames, AgeRandom(6), "GoldianFinch", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 2) { 
					listOfAnimals.add(new Budgerigar(idObj, maleAnimalNames, AgeRandom(20), "Domestic Pig", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 3) { 
					listOfAnimals.add(new Cockatoo(idObj, maleAnimalNames, AgeRandom(70), "Rabbit", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 4) { 
					listOfAnimals.add(new Dove(idObj, maleAnimalNames, AgeRandom(10), "Hamister", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 5) { 
					listOfAnimals.add(new Parrot(idObj, maleAnimalNames, AgeRandom(14), "Guinea Pig", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
		    }
	}
	
	}
	
//	print the all list using a for each loop.
	for(Animals print : listOfAnimals) {
	System.out.println(print);
	}
	
	
//	counting the numbers of item in the Array.
	System.out.println(" The Total of Animals in the system is:  " + listOfAnimals.size());
	}

	
	
	public int AgeRandom(int limitAge){
		
		Random myRandom = new Random();
	
		int randomAge = 0;
//		as random can choose 0 (animals with 0 age is too weird) we did this method 
		randomAge = myRandom.nextInt(limitAge)+1;// we did this method just to avoid to repeat this line of code in witch object.
		return randomAge;
	
	 }
}



