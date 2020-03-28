import java.util.ArrayList;

public class Animals {

//  attributes
	 String idAnimal = null;
	 String name = null;
	 int age = 0;
	 boolean species = true;
	 boolean gender = true;
	 String medicalCond = null;
//	constructor
	public Animals() {
	}
//	constructor to set the Attributes.
	public Animals(String idAnimal, String name, int age, boolean species, boolean gender, String medicalCond) {
		this.idAnimal = idAnimal;
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.medicalCond = medicalCond;	
	}
	
//	produce the methods for getters and setters.
	public String getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(String idAnimal) {
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
	public boolean isSpecies() {
		return species;
	}
	public void setSpecies(boolean species) {
		this.species = species;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getMedicalCond() {
		return medicalCond;
	}
	public void setMedicalCond(String medicalCond) {
		this.medicalCond = medicalCond;
	}
// creating the to String
	
	
}
