package animals.commonPets;

import animals.*;
import java.util.Random;

import graphical.Graphical;

public class Dog extends Animals implements Ianimals {
	
//	Instantiation the random method.
	Random myRandom = new Random();
	
	AnimalOwner owner = new AnimalOwner(null, null, 0, 0, 0);

//	constructor to set the Attributes.
	public Dog(int idAnimal, String name, int age, String species,String gender, String medicalCond, AnimalOwner owner) {
		this.setIdAnimal(idAnimal); 
		this.setName(name);
		this.setAge(age);
		this.setSpecies(species);
		this.setGender(gender);
		this.setMedicalCond(medicalCond);	
		this.owner = owner;
	}
	
//	instantiate the graphical and UserInteraction methods to print some interactions.
	Graphical printer = new Graphical();	
	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		printer.typeWriter("Aaauu, Aauuu,", 50);
		
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		printer.typeWriter("Please, feed me at least 3 times a day.", 50);
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		printer.typeWriter(" Hi my name is "+getName()+" I am a "+getGender()+" and I am very happy to meet you today.\n"
				+"My owner "+owner.getOwnerName()+ " and I having being fun since "+(getAge() - 2020)+" when I was born.", 60);	
		
			
		query.YesOrNo(3,"\n\n\n\n Would you like to see my picture now?  \n\n type Yes or No.");
	
	if (query.getUserYesOrNoValidOptio() == 1) {

		int imageGenerator = myRandom.nextInt(4);
//		picture 1
		switch(imageGenerator) {
		case 0: 
		printer.typeWriter(""
				+ "             \"    ___\\r\\n\" + \r\n" + 
				"				\" __/_  `.  .-\\\"\\\"\\\"-.\\r\\n\" + \r\n" + 
				"				\" \\\\_,` | \\\\-'  /   )`-')\\r\\n\" + \r\n" + 
				"				\"  \\\"\\\") `\\\"` \\\\  ((`\\\"`\\r\\n\" + \r\n" + 
				"				\" ___Y  ,    .'7 /|\\r\\n\" + \r\n" + 
				"				\"(_,___/...-` (_/_/ \"", 1);
			break;
		case 1:
			printer.typeWriter(""
					+ "'.-.'. \r\n" + 
					"'\\~ o/` ,,\r\n" + 
					" { @ } f\r\n" + 
					" /`-'\\$ \r\n" + 
					"(_/-\\_) ", 1);
			break;
		case 2:
			printer.typeWriter(""
					+ "         __\r\n" + 
					" \\ ______/ V`-,\r\n" + 
					"  }        /~~\r\n" + 
					" /_)^ --,r'\r\n" + 
					"|b      |b", 1);
			break;
		case 3:
			printer.typeWriter(""
					+ "     _=,_\r\n" + 
					"    o_/6 /#\\\r\n" + 
					"    \\__ |##/\r\n" + 
					"     ='|--\\\r\n" + 
					"       /   #'-.\r\n" + 
					"       \\#|_   _'-. /\r\n" + 
					"        |/ \\_( # |\" \r\n" + 
					"       C/ ,--___/", 1);
			break;
		case 4:
			printer.typeWriter(""
					+ ",_____ ,\r\n" + 
					"  ,._ ,_. 7\\\r\n" + 
					" j `-'     /\r\n" + 
					" |o_, o    \\\r\n" + 
					".`_y_`-,'   !\r\n" + 
					"|/   `, `._ `-,\r\n" + 
					"|_     \\   _.'*\\\r\n" + 
					"  >--,-'`-'*_*'``---.\r\n" + 
					"  |\\_* _*'-'         '\r\n" + 
					" /    `               \\\r\n" + 
					" \\.         _ .       /\r\n" + 
					"  '`._     /   )     /\r\n" + 
					"   \\  |`-,-|  /c-'7 /\r\n" + 
					"    ) \\ (_,| |   / (_\r\n" + 
					"   ((_/   ((_;)  \\_))) ", 1);
			break;	
			}
		}
		else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}

		System.out.println();
	}

	// creating the to String to override it.
	@Override
	public String toString() {
			return "ID: " +getIdAnimal()+ "   Name: " + getName() + "         Age: " + getAge()+ "         Specie: " + getSpecies()+"       Gender: " + getGender()+ "   \n \n Medical Condition: " + getMedicalCond()+ ". \n\n"+owner+"\n________________________________________________________________________________________________________________________________________________________";
	}
	
}
