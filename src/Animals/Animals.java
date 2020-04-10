package Animals;

import java.util.ArrayList;

public class Animals {

//  attributes
	 int idAnimal= 0;
	 String name = null;
	 int age= 0;
	 String species = null;
	 String gender = null;
	 String medicalCond = null;
	 
	 AnimalOwner owner = new AnimalOwner("Carolina", "Sacco", 3383, 037, 3049);
	 
//	constructor
	public Animals() {
	}
//	constructor to set the Attributes.
	public Animals(int idAnimal, String name, int age, String species, String gender, String medicalCond) {
		this.idAnimal = idAnimal;
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.medicalCond = medicalCond;	
	}
	
//	produce the methods for getters and setters.
		public int getIdAnimal() {
			return idAnimal;
		}
		public void setIdAnimal(int idAnimal) {
			this.idAnimal = idAnimal;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMedicalCond() {
			return medicalCond;
		}
		public void setMedicalCond(String medicalCond) {
			this.medicalCond = medicalCond;
		}
		
		// creating the to String to override it.
				@Override
				public String toString() {
					return "ID: " +idAnimal+ "   Name: " + name + "         Age: " + age+"       Specie: "+species +"       Gender: " + gender+ "   \n \n Medical Condition: " + medicalCond+ ". \n\n"+owner+"\n________________________________________________________________________________________________________________________________________________________";
				}
}

