package Animals;

public class Dog extends Animals implements Ianimals {
	
	AnimalOwner owner = new AnimalOwner("Carolina", "Sacco", 3383, 037, 3049);

//	constructor to set the Attributes.
	public Dog(int idAnimal, String name, int age, String species,String gender, String medicalCond) {
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
		System.out.println(" AAu,  AAAu");
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		System.out.println("Please, feed me at least 3 times a day.");
	}

	@Override
	public void moviment() {
		// TODO Auto-generated method stub
		System.out.println("    ___\r\n" + 
				" __/_  `.  .-\"\"\"-.\r\n" + 
				" \\_,` | \\-'  /   )`-')\r\n" + 
				"  \"\") `\"` \\  ((`\"`\r\n" + 
				" ___Y  ,    .'7 /|\r\n" + 
				"(_,___/...-` (_/_/ ");
	}

	// creating the to String to override it.
	@Override
	public String toString() {
		return "ID: " +idAnimal+ "   Name: " + name + "         Age: " + age+ "         Specie: " + species+"       Gender: " + gender+ "   \n \n Medical Condition: " + medicalCond+ ". \n\n"+owner+"\n________________________________________________________________________________________________________________________________________________________";
	}
	
}
