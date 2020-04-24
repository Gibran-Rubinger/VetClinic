package animals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import animals.commonPets.*;
import animals.birds.*;
import animals.exotic.*;
import animals.farm.*;
import animals.fish.*;
import animals.reptile.*;
import graphical.Graphical;
import queryAndValidations.*;

public class AnimalFactory {
	
//	define the size of the ArrayList with this integer.
	public int animalsQuantity = 0;
	int idObj =0;
	int speciesGenerator = 0;
	int groupGenerator = 0;
	
	int number1StartBunch = 80;
	int number1FinishBunch = 89;
	int number2StartBunch = 100;
	int number2FinishBunch = 999;
	int number3StartBunch = 1000;
	int number3FinishBunch = 9999;
	
	Graphical printer = new Graphical();

	UserInteraction Ntot = new UserInteraction();

		//	method responsible to populate 1.000 animals in a random way.
	  	public void CommonPets(int bunch) {
	  		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//	For loop responsible to generate the objects. 
	for(int i = 0; i < bunch; i++) {
		
//		this attribute is responsible for generate in a random way with kind of Species the animal will be.
			
		speciesGenerator = myRandom.nextInt(6); 
			
//      Generate the id 
		idObj+= i;

//		generate the random attribute just once instead to repeat the same amount of code every time.
//		__________________________________________
//		Loading random Names
		String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
		String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
		
		
//		__________________________________________
//		Medical conditions 
		
//		Common Pets
		String dogMedicalCond = database.dogMedCond[myRandom.nextInt(database.dogMedCond.length)];
		String catMedicalCond = database.catMedCond[myRandom.nextInt(database.catMedCond.length)];
		String domesticPigMedicalCond = database.domesticPigMedCond[myRandom.nextInt(database.domesticPigMedCond.length)];
		String rabbitMedicalCond = database.rabbitMedCond[myRandom.nextInt(database.rabbitMedCond.length)];
		String hamisterMedicalCond = database.hamisterMedCond[myRandom.nextInt(database.hamisterMedCond.length)];
		String guineaPigMedicalCond = database.guineaPigMedCond[myRandom.nextInt(database.guineaPigMedCond.length)];
		
//		__________________________________________
//		Loading random Owners
		
		String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
		String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
		
		int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
		int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
		int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
		
//		__________________________________________
//		
		
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
										listOfAnimals.add(new GuineaPig(idObj, femaleAnimalNames, AgeRandom(8), "Guinea Pig", " Female ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
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
							    		listOfAnimals.add(new GuineaPig(idObj, maleAnimalNames, AgeRandom(8), "Guinea Pig", " Male ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
			
							    }
				}
	
	
//		counting the numbers of item in the Array.
        
	Set <Animals> perSpecie = new HashSet<>(listOfAnimals);
        
        for(Animals item : perSpecie) {
    		System.out.println(item);
    		
        
        System.out.println(item+ ": " + Collections.frequency(listOfAnimals, item) );
        } 
        printer.typeWriter("\n"
        		+ "The Total of Animals in the system is:  ", 50);
        System.out.println(listOfAnimals.size());
	
	  }

	public void Birds(int bunch) {
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < bunch; i++) {
			
//			this attribute is responsible for generate in a random way with kind of Species the animal will be.
			speciesGenerator = myRandom.nextInt(6); 
				
			
//	      Generate the id 
			idObj+= i;

//			generate the random attribute just once instead to repeat the same amount of code every time.
//			__________________________________________
//			Loading random Names
			String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
			String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
			
			
//			__________________________________________
//			Medical conditions 
			String birdsMedicalCond = database.birdsMedCond[myRandom.nextInt(database.birdsMedCond.length)];
						
//			__________________________________________
//			Loading random Owners
			
			String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
			String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
			
			int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
			int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
			int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
			
//			__________________________________________
			
//				if statement responsible to generate objects per gender.
				if(idObj %2 ==0) {

//					Inside the if statement just Female Object.
					if(speciesGenerator == 0) { 
						listOfAnimals.add(new Cokcatiel(idObj, femaleAnimalNames, AgeRandom(14), "Cokcatiel", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new GoldianFinch(idObj, femaleAnimalNames, AgeRandom(6), "GoldianFinch", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new Budgerigar(idObj, femaleAnimalNames, AgeRandom(20), "Budgerigar", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new Cockatoo(idObj, femaleAnimalNames, AgeRandom(70), "Cockatoo", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Dove(idObj, femaleAnimalNames, AgeRandom(10), "Dove", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new Parrot(idObj, femaleAnimalNames, AgeRandom(14), "Parrot", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
				}

			    else {
//				Male Object - every attribute of the object is picked using the random method.
			    	if(speciesGenerator == 0) { 
						listOfAnimals.add(new Cokcatiel(idObj, maleAnimalNames, AgeRandom(14), "Cokcatiel", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new GoldianFinch(idObj, maleAnimalNames, AgeRandom(6), "GoldianFinch", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new Budgerigar(idObj, maleAnimalNames, AgeRandom(20), "Budgerigar", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new Cockatoo(idObj, maleAnimalNames, AgeRandom(70), "Cockatoo", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Dove(idObj, maleAnimalNames, AgeRandom(10), "Dove", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new Parrot(idObj, maleAnimalNames, AgeRandom(14), "Parrot", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
			    }
			}
		
		for(Animals print : listOfAnimals) {
			System.out.println(print);
			}
//			counting the numbers of item in the Array.
            printer.typeWriter("\n"
            		+ "The Total of Animals in the system is:  ", 50);
            System.out.println(listOfAnimals.size());
	}

	public void Fish(int bunch) {
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < bunch; i++) {
			
//			this attribute is responsible for generate in a random way with kind of Species the animal will be.
			speciesGenerator = myRandom.nextInt(6); 
				
			
//	      Generate the id 
			idObj+= i;

//			generate the random attribute just once instead to repeat the same amount of code every time.
//			__________________________________________
//			Loading random Names
			String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
			String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
			
			
//			__________________________________________
//			Medical conditions 
			String fishMedicalCond = database.fishMedCond[myRandom.nextInt(database.fishMedCond.length)];
						
//			__________________________________________
//			Loading random Owners
			
			String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
			String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
			
			int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
			int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
			int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
			
//			__________________________________________
			
//				if statement responsible to generate objects per gender.
				if(idObj %2 ==0) {

//					Inside the if statement just Female Object.
					if(speciesGenerator == 0) { 
						listOfAnimals.add(new Oscar(idObj, femaleAnimalNames, AgeRandom(21), "Oscar", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new NeonTreta(idObj, femaleAnimalNames, AgeRandom(11), "Neon Treta", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new Guppies(idObj, femaleAnimalNames, AgeRandom(3), "Guppies", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new Discus(idObj, femaleAnimalNames, AgeRandom(11), "Discus", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Betta(idObj, femaleAnimalNames, AgeRandom(6), "Betta", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new Goldfish(idObj, femaleAnimalNames, AgeRandom(11), "Goldfish", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
				}

			    else {
//				Male Object - every attribute of the object is picked using the random method.
			    	if(speciesGenerator == 0) { 
						listOfAnimals.add(new Oscar(idObj, maleAnimalNames, AgeRandom(21), "Oscar", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new NeonTreta(idObj, maleAnimalNames, AgeRandom(11), "Neon Treta", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new Guppies(idObj, maleAnimalNames, AgeRandom(3), "Guppies", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new Discus(idObj, maleAnimalNames, AgeRandom(11), "Discus", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Betta(idObj, maleAnimalNames, AgeRandom(6), "Betta", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new Goldfish(idObj, maleAnimalNames, AgeRandom(11), "Goldfish", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
			    }
			}
		
		for(Animals print : listOfAnimals) {
			System.out.println(print);
			}
//			counting the numbers of item in the Array.
            printer.typeWriter("\n"
            		+ "The Total of Animals in the system is:  ", 50);
            System.out.println(listOfAnimals.size());
	}

    public void Reptile(int bunch) {
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < bunch; i++) {
			
//			this attribute is responsible for generate in a random way with kind of Species the animal will be.
			speciesGenerator = myRandom.nextInt(6); 
				
			
//	      Generate the id 
			idObj+= i;

//			generate the random attribute just once instead to repeat the same amount of code every time.
//			__________________________________________
//			Loading random Names
			String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
			String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
			
			
//			__________________________________________
//			Medical conditions 
			String reptileMedicalCond = database.reptileMedCond[myRandom.nextInt(database.reptileMedCond.length)];
						
//			__________________________________________
//			Loading random Owners
			
			String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
			String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
			
			int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
			int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
			int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
			
//			__________________________________________
			
//				if statement responsible to generate objects per gender.
				if(idObj %2 ==0) {

//					Inside the if statement just Female Object.
					if(speciesGenerator == 0) { 
						listOfAnimals.add(new WaterDragon(idObj, femaleAnimalNames, AgeRandom(21), "Whater Dragon", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new Chameleon(idObj, femaleAnimalNames, AgeRandom(11), "Chameleon", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new GreenTreePython(idObj, femaleAnimalNames, AgeRandom(21), "Green Tree Python", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new BallPython(idObj, femaleAnimalNames, AgeRandom(31), "Ball Python", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Iguana(idObj, femaleAnimalNames, AgeRandom(11), "Iguana", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new EasternBoxTurtle(idObj, femaleAnimalNames, AgeRandom(101), "Eastern Box Turtle", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
				}

			    else {
//				Male Object - every attribute of the object is picked using the random method.
					if(speciesGenerator == 0) { 
						listOfAnimals.add(new WaterDragon(idObj, maleAnimalNames, AgeRandom(21), "Whater Dragon", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new Chameleon(idObj, maleAnimalNames, AgeRandom(11), "Chameleon", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new GreenTreePython(idObj, maleAnimalNames, AgeRandom(21), "Green Tree Python", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new BallPython(idObj, maleAnimalNames, AgeRandom(31), "Ball Python", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Iguana(idObj, maleAnimalNames, AgeRandom(11), "Iguana", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new EasternBoxTurtle(idObj, maleAnimalNames, AgeRandom(101), "Eastern Box Turtle", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}	
			    }
			}
		
		for(Animals print : listOfAnimals) {
			System.out.println(print);
			}
//			counting the numbers of item in the Array.
            printer.typeWriter("\n"
            		+ "The Total of Animals in the system is:  ", 50);
            System.out.println(listOfAnimals.size());
	}

    public void Farm(int bunch) {
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < bunch; i++) {
			
//			this attribute is responsible for generate in a random way with kind of Species the animal will be.
			speciesGenerator = myRandom.nextInt(6); 
				
			
//	      Generate the id 
			idObj+= i;

//			generate the random attribute just once instead to repeat the same amount of code every time.
//			__________________________________________
//			Loading random Names
			String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
			String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
			
			
//			__________________________________________
//			Medical conditions 
			String oxMedicalCond = database.oxMedCond[myRandom.nextInt(database.oxMedCond.length)];
			String horsePonyAndDonkeyMedicalCond = database.horsePonyAndDonkeyMedCond[myRandom.nextInt(database.horsePonyAndDonkeyMedCond.length)];
			String sheepAndGoatMedicalCond = database.sheepAndGoatMedCond[myRandom.nextInt(database.sheepAndGoatMedCond.length)];
//			__________________________________________
//			Loading random Owners
			
			String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
			String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
			
			int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
			int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
			int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
			
//			__________________________________________
			
//				if statement responsible to generate objects per gender.
				if(idObj %2 ==0) {

//					Inside the if statement just Female Object.
					if(speciesGenerator == 0) { 
						listOfAnimals.add(new Ox(idObj, femaleAnimalNames, AgeRandom(23), "Ox", " Female ", oxMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new Horse(idObj, femaleAnimalNames, AgeRandom(31), "Horse", " Female ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new Sheep(idObj, femaleAnimalNames, AgeRandom(13), "Sheep", " Female ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new Goat(idObj, femaleAnimalNames, AgeRandom(19), "Goat", " Female ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Pony(idObj, femaleAnimalNames, AgeRandom(30), "Pony", " Female ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new EasternBoxTurtle(idObj, femaleAnimalNames, AgeRandom(31), "Donkey", " Female ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
				}

			    else {
//				Male Object - every attribute of the object is picked using the random method.
			    	if(speciesGenerator == 0) { 
						listOfAnimals.add(new Ox(idObj, maleAnimalNames, AgeRandom(23), "Ox", " Male ", oxMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new Horse(idObj, maleAnimalNames, AgeRandom(31), "Horse", " Male ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new Sheep(idObj, maleAnimalNames, AgeRandom(13), "Sheep", " Male ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new Goat(idObj, maleAnimalNames, AgeRandom(19), "Goat", " Male ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new Pony(idObj, maleAnimalNames, AgeRandom(30), "Pony", " Male ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new EasternBoxTurtle(idObj, maleAnimalNames, AgeRandom(31), "Donkey", " Male ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
			    }
			}
		
		for(Animals print : listOfAnimals) {
			System.out.println(print);
			}
//			counting the numbers of item in the Array.
            printer.typeWriter("\n"
            		+ "The Total of Animals in the system is:  ", 50);
            System.out.println(listOfAnimals.size());
	}

    public void Exotic(int bunch) {
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < bunch; i++) {
			
//			this attribute is responsible for generate in a random way with kind of Species the animal will be.
			speciesGenerator = myRandom.nextInt(6); 
				
			
//	      Generate the id 
			idObj+= i;

//			generate the random attribute just once instead to repeat the same amount of code every time.
//			__________________________________________
//			Loading random Names
			String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
			String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
			
			
//			__________________________________________
//			Medical conditions 
			String exoticMedicalCond = database.exoticMedCond[myRandom.nextInt(database.exoticMedCond.length)];
//			__________________________________________
//			Loading random Owners
			
			String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
			String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
			
			int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
			int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
			int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
			
//			__________________________________________
			
			
			
//				if statement responsible to generate objects per gender.
				if(idObj %2 ==0) {

//					Inside the if statement just Female Object.
					if(speciesGenerator == 0) { 
						listOfAnimals.add(new PacmanFrog(idObj, femaleAnimalNames, AgeRandom(16), "PacmanFrong", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new GreenTreeFrog(idObj, femaleAnimalNames, AgeRandom(17), "Green Tree Frog", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new CobaltBlueTarantula(idObj, femaleAnimalNames, AgeRandom(17), "Cobalt Blue Tarantula", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new ChileRoseSpider(idObj, femaleAnimalNames, AgeRandom(21), "Chile Rose Spider", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new EmperorScorpion(idObj, femaleAnimalNames, AgeRandom(9), "Empero Scorpion", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new HeterometrusScorpion(idObj, femaleAnimalNames, AgeRandom(7), "Heterometrus Scorpion", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
				}

			    else {
//				Male Object - every attribute of the object is picked using the random method.
			    	if(speciesGenerator == 0) { 
						listOfAnimals.add(new PacmanFrog(idObj, maleAnimalNames, AgeRandom(16), "PacmanFrong", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 1) { 
						listOfAnimals.add(new GreenTreeFrog(idObj, maleAnimalNames, AgeRandom(17), "Green Tree Frog", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 2) { 
						listOfAnimals.add(new CobaltBlueTarantula(idObj, maleAnimalNames, AgeRandom(17), "Cobalt Blue Tarantula", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 3) { 
						listOfAnimals.add(new ChileRoseSpider(idObj, maleAnimalNames, AgeRandom(21), "Chile Rose Spider", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 4) { 
						listOfAnimals.add(new EmperorScorpion(idObj, maleAnimalNames, AgeRandom(9), "Empero Scorpion", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
					else if(speciesGenerator == 5) { 
						listOfAnimals.add(new HeterometrusScorpion(idObj, maleAnimalNames, AgeRandom(7), "Heterometrus Scorpion", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
					}
			    }	
		}
		
		for(Animals print : listOfAnimals) {
			System.out.println(print);
			}
//			counting the numbers of item in the Array.
            printer.typeWriter("\n"
            		+ "The Total of Animals in the system is:  ", 50);
            System.out.println(listOfAnimals.size());
	}

public void Crazy(int bunch) {
		
		
//		generate the Array to storage the 1.000 random Animals.
		ArrayList<Animals> listOfAnimals;
		//ArrayList<AnimalOwner> listOfOwner;
		 
		
//		instantiation of the Array
		listOfAnimals = new ArrayList<Animals>(bunch);
		//listOfOwner = new ArrayList<AnimalOwner>(animalsQuantity);
			
	//Instantiation the random method.
	Random myRandom = new Random();
	AnimalsData database = new AnimalsData();

		
//	For loop responsible to generate the objects. 
	for(int i = 0; i < bunch; i++) {
		
//		this attribute is responsible for generate in a random way with kind of Species the animal will be.
		groupGenerator = myRandom.nextInt(6);	
		speciesGenerator = myRandom.nextInt(6); 
			
//      Generate the id 
		idObj+= i;

//		generate the random attribute just once instead to repeat the same amount of code every time.
//		__________________________________________
//		Loading random Names
		String femaleAnimalNames = database.poolOfFemaleNames[myRandom.nextInt(database.poolOfFemaleNames.length)];
		String maleAnimalNames = database.poolOfMaleNames[myRandom.nextInt(database.poolOfMaleNames.length)];
		
		
//		__________________________________________
//		Medical conditions 
		
//		Common Pets
		String dogMedicalCond = database.dogMedCond[myRandom.nextInt(database.dogMedCond.length)];
		String catMedicalCond = database.catMedCond[myRandom.nextInt(database.catMedCond.length)];
		String domesticPigMedicalCond = database.domesticPigMedCond[myRandom.nextInt(database.domesticPigMedCond.length)];
		String rabbitMedicalCond = database.rabbitMedCond[myRandom.nextInt(database.rabbitMedCond.length)];
		String hamisterMedicalCond = database.hamisterMedCond[myRandom.nextInt(database.hamisterMedCond.length)];
		String guineaPigMedicalCond = database.guineaPigMedCond[myRandom.nextInt(database.guineaPigMedCond.length)];
		
//		Birds
		String birdsMedicalCond = database.birdsMedCond[myRandom.nextInt(database.birdsMedCond.length)];
		
//		fish
		String fishMedicalCond = database.fishMedCond[myRandom.nextInt(database.fishMedCond.length)];
		
//		Reptile
		String reptileMedicalCond = database.reptileMedCond[myRandom.nextInt(database.reptileMedCond.length)];
		
//		Farm
		String oxMedicalCond = database.oxMedCond[myRandom.nextInt(database.oxMedCond.length)];
		String horsePonyAndDonkeyMedicalCond = database.horsePonyAndDonkeyMedCond[myRandom.nextInt(database.horsePonyAndDonkeyMedCond.length)];
		String sheepAndGoatMedicalCond = database.sheepAndGoatMedCond[myRandom.nextInt(database.sheepAndGoatMedCond.length)];
		
//		Exotic
		String exoticMedicalCond = database.exoticMedCond[myRandom.nextInt(database.exoticMedCond.length)];
		
//		__________________________________________
//		Loading random Owners
		
		String firstNameOwner = database.poolOfOwnerNames[myRandom.nextInt(database.poolOfOwnerNames.length)];
		String SurnameOwner = database.poolOfOwnerSurnames[myRandom.nextInt(database.poolOfOwnerSurnames.length)];
		
		int n1 = (myRandom.nextInt(number1FinishBunch - number1StartBunch + 1)+number1StartBunch);
		int n2 = (myRandom.nextInt(number2FinishBunch - number2StartBunch + 1)+number2StartBunch);
		int n3 = (myRandom.nextInt(number3FinishBunch - number3StartBunch + 1)+number3StartBunch);		
		
//		__________________________________________
		
//		Common Pets
		if(groupGenerator == 0) {
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
										listOfAnimals.add(new GuineaPig(idObj, femaleAnimalNames, AgeRandom(8), "Guinea Pig", " Female ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
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
							    		listOfAnimals.add(new GuineaPig(idObj, maleAnimalNames, AgeRandom(8), "Guinea Pig", " Male ", guineaPigMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
							    	}
			
							    }
					}
		
//	Birds sub group	
	else if(groupGenerator == 1) {
		
								if(idObj %2 ==0) {

//									Inside the if statement just Female Object.
									if(speciesGenerator == 0) { 
										listOfAnimals.add(new Cokcatiel(idObj, femaleAnimalNames, AgeRandom(14), "Cokcatiel", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 1) { 
										listOfAnimals.add(new GoldianFinch(idObj, femaleAnimalNames, AgeRandom(6), "GoldianFinch", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 2) { 
										listOfAnimals.add(new Budgerigar(idObj, femaleAnimalNames, AgeRandom(20), "Budgerigar", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 3) { 
										listOfAnimals.add(new Cockatoo(idObj, femaleAnimalNames, AgeRandom(70), "Cockatoo", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 4) { 
										listOfAnimals.add(new Dove(idObj, femaleAnimalNames, AgeRandom(10), "Dove", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
									else if(speciesGenerator == 5) { 
										listOfAnimals.add(new Parrot(idObj, femaleAnimalNames, AgeRandom(14), "Parrot", " Female ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
									}
								}

									else {
//										Male Object - every attribute of the object is picked using the random method.
										if(speciesGenerator == 0) { 
											listOfAnimals.add(new Cokcatiel(idObj, maleAnimalNames, AgeRandom(14), "Cokcatiel", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 1) { 
											listOfAnimals.add(new GoldianFinch(idObj, maleAnimalNames, AgeRandom(6), "GoldianFinch", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 2) { 
											listOfAnimals.add(new Budgerigar(idObj, maleAnimalNames, AgeRandom(20), "Budgerigar", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 3) { 
											listOfAnimals.add(new Cockatoo(idObj, maleAnimalNames, AgeRandom(70), "Cockatoo", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 4) { 
											listOfAnimals.add(new Dove(idObj, maleAnimalNames, AgeRandom(10), "Dove", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 5) { 
											listOfAnimals.add(new Parrot(idObj, maleAnimalNames, AgeRandom(14), "Parrot", " Male ", birdsMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
									}
							}

//  Fish sub group 							
	else if(groupGenerator == 2) {
		
							if(idObj %2 ==0) {
//								Inside the if statement just Female Object.
										if(speciesGenerator == 0) { 
											listOfAnimals.add(new Oscar(idObj, femaleAnimalNames, AgeRandom(21), "Oscar", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 1) { 
											listOfAnimals.add(new NeonTreta(idObj, femaleAnimalNames, AgeRandom(11), "Neon Treta", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 2) { 
											listOfAnimals.add(new Guppies(idObj, femaleAnimalNames, AgeRandom(3), "Guppies", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 3) { 
											listOfAnimals.add(new Discus(idObj, femaleAnimalNames, AgeRandom(11), "Discus", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 4) { 
											listOfAnimals.add(new Betta(idObj, femaleAnimalNames, AgeRandom(6), "Betta", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 5) { 
											listOfAnimals.add(new Goldfish(idObj, femaleAnimalNames, AgeRandom(11), "Goldfish", " Female ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
									}

								    else {
//                       			Male Object - every attribute of the object is picked using the random method.
								    	if(speciesGenerator == 0) { 
											listOfAnimals.add(new Oscar(idObj, maleAnimalNames, AgeRandom(21), "Oscar", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 1) { 
											listOfAnimals.add(new NeonTreta(idObj, maleAnimalNames, AgeRandom(11), "Neon Treta", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 2) { 
											listOfAnimals.add(new Guppies(idObj, maleAnimalNames, AgeRandom(3), "Guppies", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 3) { 
											listOfAnimals.add(new Discus(idObj, maleAnimalNames, AgeRandom(11), "Discus", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 4) { 
											listOfAnimals.add(new Betta(idObj, maleAnimalNames, AgeRandom(6), "Betta", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 5) { 
											listOfAnimals.add(new Goldfish(idObj, maleAnimalNames, AgeRandom(11), "Goldfish", " Male ", fishMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
								    }	
							}
//		Reptiles sub Group
	else if(groupGenerator == 3) {
		
								if(idObj %2 ==0) {
//											Inside the if statement just Female Object.
											if(speciesGenerator == 0) { 
												listOfAnimals.add(new WaterDragon(idObj, femaleAnimalNames, AgeRandom(21), "Whater Dragon", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 1) { 
												listOfAnimals.add(new Chameleon(idObj, femaleAnimalNames, AgeRandom(11), "Chameleon", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 2) { 
												listOfAnimals.add(new GreenTreePython(idObj, femaleAnimalNames, AgeRandom(21), "Green Tree Python", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 3) { 
												listOfAnimals.add(new BallPython(idObj, femaleAnimalNames, AgeRandom(31), "Ball Python", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 4) { 
												listOfAnimals.add(new Iguana(idObj, femaleAnimalNames, AgeRandom(11), "Iguana", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 5) { 
												listOfAnimals.add(new EasternBoxTurtle(idObj, femaleAnimalNames, AgeRandom(101), "Eastern Box Turtle", " Female ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
										}
								
									    else {
//											Male Object - every attribute of the object is picked using the random method.
											if(speciesGenerator == 0) { 
												listOfAnimals.add(new WaterDragon(idObj, maleAnimalNames, AgeRandom(21), "Whater Dragon", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 1) { 
												listOfAnimals.add(new Chameleon(idObj, maleAnimalNames, AgeRandom(11), "Chameleon", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 2) { 
												listOfAnimals.add(new GreenTreePython(idObj, maleAnimalNames, AgeRandom(21), "Green Tree Python", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 3) { 
												listOfAnimals.add(new BallPython(idObj, maleAnimalNames, AgeRandom(31), "Ball Python", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 4) { 
												listOfAnimals.add(new Iguana(idObj, maleAnimalNames, AgeRandom(11), "Iguana", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 5) { 
												listOfAnimals.add(new EasternBoxTurtle(idObj, maleAnimalNames, AgeRandom(101), "Eastern Box Turtle", " Male ", reptileMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}	
									    }
									}
//		Farm Sub group
	else if(groupGenerator == 4) {
									if(idObj %2 ==0) {
							
							//			Inside the if statement just Female Object.
										if(speciesGenerator == 0) { 
											listOfAnimals.add(new Ox(idObj, femaleAnimalNames, AgeRandom(23), "Ox", " Female ", oxMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 1) { 
											listOfAnimals.add(new Horse(idObj, femaleAnimalNames, AgeRandom(31), "Horse", " Female ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 2) { 
											listOfAnimals.add(new Sheep(idObj, femaleAnimalNames, AgeRandom(13), "Sheep", " Female ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 3) { 
											listOfAnimals.add(new Goat(idObj, femaleAnimalNames, AgeRandom(19), "Goat", " Female ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 4) { 
											listOfAnimals.add(new Pony(idObj, femaleAnimalNames, AgeRandom(30), "Pony", " Female ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 5) { 
											listOfAnimals.add(new EasternBoxTurtle(idObj, femaleAnimalNames, AgeRandom(31), "Donkey", " Female ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
									}
							
								    else {
							//		Male Object - every attribute of the object is picked using the random method.
								    	if(speciesGenerator == 0) { 
											listOfAnimals.add(new Ox(idObj, maleAnimalNames, AgeRandom(23), "Ox", " Male ", oxMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 1) { 
											listOfAnimals.add(new Horse(idObj, maleAnimalNames, AgeRandom(31), "Horse", " Male ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 2) { 
											listOfAnimals.add(new Sheep(idObj, maleAnimalNames, AgeRandom(13), "Sheep", " Male ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 3) { 
											listOfAnimals.add(new Goat(idObj, maleAnimalNames, AgeRandom(19), "Goat", " Male ", sheepAndGoatMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 4) { 
											listOfAnimals.add(new Pony(idObj, maleAnimalNames, AgeRandom(30), "Pony", " Male ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
										else if(speciesGenerator == 5) { 
											listOfAnimals.add(new EasternBoxTurtle(idObj, maleAnimalNames, AgeRandom(31), "Donkey", " Male ", horsePonyAndDonkeyMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
										}
								    }
								
			
	}
//		Exotic sub group
	else if(groupGenerator == 5) {
								if(idObj %2 ==0) {
								
//											Inside the if statement just Female Object.
											if(speciesGenerator == 0) { 
												listOfAnimals.add(new PacmanFrog(idObj, femaleAnimalNames, AgeRandom(16), "PacmanFrong", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 1) { 
												listOfAnimals.add(new GreenTreeFrog(idObj, femaleAnimalNames, AgeRandom(17), "Green Tree Frog", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 2) { 
												listOfAnimals.add(new CobaltBlueTarantula(idObj, femaleAnimalNames, AgeRandom(17), "Cobalt Blue Tarantula", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 3) { 
												listOfAnimals.add(new ChileRoseSpider(idObj, femaleAnimalNames, AgeRandom(21), "Chile Rose Spider", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 4) { 
												listOfAnimals.add(new EmperorScorpion(idObj, femaleAnimalNames, AgeRandom(9), "Empero Scorpion", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 5) { 
												listOfAnimals.add(new HeterometrusScorpion(idObj, femaleAnimalNames, AgeRandom(7), "Heterometrus Scorpion", " Female ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
										}
								
									    else {
//											Male Object - every attribute of the object is picked using the random method.
									    	if(speciesGenerator == 0) { 
												listOfAnimals.add(new PacmanFrog(idObj, maleAnimalNames, AgeRandom(16), "PacmanFrong", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 1) { 
												listOfAnimals.add(new GreenTreeFrog(idObj, maleAnimalNames, AgeRandom(17), "Green Tree Frog", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 2) { 
												listOfAnimals.add(new CobaltBlueTarantula(idObj, maleAnimalNames, AgeRandom(17), "Cobalt Blue Tarantula", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 3) { 
												listOfAnimals.add(new ChileRoseSpider(idObj, maleAnimalNames, AgeRandom(21), "Chile Rose Spider", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 4) { 
												listOfAnimals.add(new EmperorScorpion(idObj, maleAnimalNames, AgeRandom(9), "Empero Scorpion", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
											else if(speciesGenerator == 5) { 
												listOfAnimals.add(new HeterometrusScorpion(idObj, maleAnimalNames, AgeRandom(7), "Heterometrus Scorpion", " Male ", exoticMedicalCond, new AnimalOwner(firstNameOwner, SurnameOwner, n1 , n2, n3)));
											}
									    }	

	}	
				}
	
	
	for(Animals print : listOfAnimals) {
		System.out.println(print);
		}
//		counting the numbers of item in the Array.
        printer.typeWriter("\n"
        		+ "The Total of Animals in the system is:  ", 50);
        System.out.println(listOfAnimals.size());
	
	  }

    
//___________________________________________________________________________
//	print the all list using a for each loop.
	
	
	public int AgeRandom(int limitAge){
	
		Random myRandom = new Random();
		
		int randomAge = 0;
//		as random can choose 0 (animals with 0 age is too weird) we did this method 
		randomAge = myRandom.nextInt(limitAge)+1;// we did this method just to avoid to repeat this line of code in witch object.
		return randomAge;
	
	 }
}



