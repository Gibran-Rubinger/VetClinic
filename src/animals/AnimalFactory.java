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
		String dogMedicalCond = database.poolOfCommonPetzMedicalCond[myRandom.nextInt(database.poolOfCommonPetzMedicalCond.length)];
		String catMedicalCond = database.poolOfCommonPetzMedicalCond[myRandom.nextInt(database.poolOfCommonPetzMedicalCond.length)];
		String domesticPigMedicalCond = database.poolOfCommonPetzMedicalCond[myRandom.nextInt(database.poolOfCommonPetzMedicalCond.length)];
		String rabbitMedicalCond = database.poolOfCommonPetzMedicalCond[myRandom.nextInt(database.poolOfCommonPetzMedicalCond.length)];
		String hamisterMedicalCond = database.poolOfCommonPetzMedicalCond[myRandom.nextInt(database.poolOfCommonPetzMedicalCond.length)];
		String guineaPigMedicalCond = database.poolOfCommonPetzMedicalCond[myRandom.nextInt(database.poolOfCommonPetzMedicalCond.length)];
//		__________________________________________
//		Loading random Owners
		
		String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
		String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
		
		int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
		int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
		int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
		
//		__________________________________________
//		Ages
		int dogAge = (myRandom.nextInt(20)+1);
		int catAge = (myRandom.nextInt(18)+1);
		int domesticPigAge = (myRandom.nextInt(17)+1);
		int rabbitAge = (myRandom.nextInt(9)+1);
		int hamisterAge = (myRandom.nextInt(3)+1);
		int guineaPigAge = (myRandom.nextInt(8)+1);
		
		int cokcatielAge = (myRandom.nextInt(8)+1);
		
//		Generate a common pets group.
		if(groupGenerator == 1) {
//								if statement responsible to generate objects per gender.
								if(idObj %2 ==0) {
		
//									Inside the if statement just Female Object.
									if(speciesGenerator == 0) { 
										listOfAnimals.add(new Dog(idObj, femaleAnimalNames, dogAge, "Dog", " Female ", dogMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 1) { 
										listOfAnimals.add(new Cat(idObj, femaleAnimalNames, catAge, "Cat", " Female ", catMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 2) { 
										listOfAnimals.add(new DomesticPig(idObj, femaleAnimalNames, domesticPigAge, "Domestic Pig", " Female ", domesticPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 3) { 
										listOfAnimals.add(new Rabbit(idObj, femaleAnimalNames, rabbitAge, "Rabbit", " Female ", rabbitMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 4) { 
										listOfAnimals.add(new Hamister(idObj, femaleAnimalNames, hamisterAge, "Hamister", " Female ", hamisterMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 5) { 
										listOfAnimals.add(new Rabbit(idObj, femaleAnimalNames, guineaPigAge, "Guinea Pig", " Female ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
								}
		
							    else {
//								Male Object - every attribute of the object is picked using the random method.
							    	if(speciesGenerator == 0) { 
							    		listOfAnimals.add(new Dog(idObj, maleAnimalNames, dogAge, "Dog", " Male ", dogMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 1) { 
							    		listOfAnimals.add(new Cat(idObj, maleAnimalNames, catAge, "Cat", " Male ", catMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 2) { 
							    		listOfAnimals.add(new DomesticPig(idObj, maleAnimalNames, domesticPigAge, "Domestic Pig", " Male ", domesticPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 3) { 
							    		listOfAnimals.add(new Rabbit(idObj, maleAnimalNames, rabbitAge, "Rabbit", " Male ", rabbitMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 4) { 
							    		listOfAnimals.add(new Hamister(idObj, maleAnimalNames, hamisterAge, "Hamister", " Male ", hamisterMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
							    	else if(speciesGenerator == 5) { 
							    		listOfAnimals.add(new Rabbit(idObj, maleAnimalNames, guineaPigAge, "Guinea Pig", " Male ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
			
							    }
						}
		
		if(groupGenerator == 2) {
//			if statement responsible to generate objects per gender.
			if(idObj %2 ==0) {

//				Inside the if statement just Female Object.
				if(speciesGenerator == 7) { 
					listOfAnimals.add(new Cokcatiel(idObj, femaleAnimalNames, cokcatielAge, "Cokcatiel", " Female ", dogMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 1) { 
					listOfAnimals.add(new GoldianFinch(idObj, femaleAnimalNames, catAge, "GoldianFinch", " Female ", catMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 2) { 
					listOfAnimals.add(new DomesticPig(idObj, femaleAnimalNames, domesticPigAge, "Domestic Pig", " Female ", domesticPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 3) { 
					listOfAnimals.add(new Rabbit(idObj, femaleAnimalNames, rabbitAge, "Rabbit", " Female ", rabbitMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 4) { 
					listOfAnimals.add(new Hamister(idObj, femaleAnimalNames, hamisterAge, "Hamister", " Female ", hamisterMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
				else if(speciesGenerator == 5) { 
					listOfAnimals.add(new Rabbit(idObj, femaleAnimalNames, guineaPigAge, "Guinea Pig", " Female ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
				}
			}

		    else {
//			Male Object - every attribute of the object is picked using the random method.
		    	if(speciesGenerator == 0) { 
		    		listOfAnimals.add(new Dog(idObj, maleAnimalNames, dogAge, "Dog", " Male ", dogMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
		    	}
		    	else if(speciesGenerator == 1) { 
		    		listOfAnimals.add(new Cat(idObj, maleAnimalNames, catAge, "Cat", " Male ", catMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
		    	}
		    	else if(speciesGenerator == 2) { 
		    		listOfAnimals.add(new DomesticPig(idObj, maleAnimalNames, domesticPigAge, "Domestic Pig", " Male ", domesticPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
		    	}
		    	else if(speciesGenerator == 3) { 
		    		listOfAnimals.add(new Rabbit(idObj, maleAnimalNames, rabbitAge, "Rabbit", " Male ", rabbitMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
		    	}
		    	else if(speciesGenerator == 4) { 
		    		listOfAnimals.add(new Hamister(idObj, maleAnimalNames, hamisterAge, "Hamister", " Male ", hamisterMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
		    	}
		    	else if(speciesGenerator == 5) { 
		    		listOfAnimals.add(new Rabbit(idObj, maleAnimalNames, guineaPigAge, "Guinea Pig", " Male ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
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
}
}



