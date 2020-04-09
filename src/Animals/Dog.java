package Animals;

public class Dog extends Animals implements Ianimals {

//	constructor to set the Attributes.
	public Dog(int idAnimal, String name, int age, String species, String gender, String medicalCond) {
		this.idAnimal = idAnimal;
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.medicalCond = medicalCond;	
	}
	
	@Override
	public void sounds() {
		// TODO Auto-generated method stub

	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moviment() {
		// TODO Auto-generated method stub

	}

}
