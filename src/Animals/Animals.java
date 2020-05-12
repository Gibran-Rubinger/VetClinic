package animals;

import java.util.Random;

import graphical.Graphical;
import queryAndValidations.UserInteraction;

public abstract class Animals {

//  attributes
	private int idAnimal = 0;
	private String name = "";
	private int age = 0;
	private String species = "";
	private String gender = "";
	private String medicalCond = "";

	Graphical printer = new Graphical();
	UserInteraction query = new UserInteraction();
	Random myRandom = new Random();
	AnimalOwner owner = new AnimalOwner(null, null, 0, 0, 0);

	
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


	
// creating the to String to override it.
	@Override
	public String toString() {
		return "ID: " + idAnimal + "   Name: " + name + "         Age: " + age + "         Specie: " + species
				+ "       Gender: " + gender + "   \n \n Medical Condition: " + medicalCond + ". \n\n"
				+ "\n________________________________________________________________________________________________________________________________________________________";
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
//	produce the methods for hashCode and equals.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + idAnimal;
		result = prime * result + ((medicalCond == null) ? 0 : medicalCond.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animals other = (Animals) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (idAnimal != other.idAnimal)
			return false;
		if (medicalCond == null) {
			if (other.medicalCond != null)
				return false;
		} else if (!medicalCond.equals(other.medicalCond))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}

	public void info() {
		
			printer.typeWriter(" Hi my name is "+getName()+" I am a "+getGender()+" and I am very happy to meet you today.\n"
					+"My owner "+owner.getOwnerName()+ " and I having being fun since "+(getAge() - 2020)+" when I was born.", 60);	
			
				
			query.YesOrNo(3,"\n\n\n\n Would you like to see my picture now?  \n\n type Yes or No.");
		
		if (query.getUserYesOrNoValidOptio() == 1) {

			@SuppressWarnings("unused")
			int imageGenerator = myRandom.nextInt(4);
	}
		else if (query.getUserYesOrNoValidOptio() == 0){
			printer.typeWriter("Ok, see you later", 50);
		}
	}
}
