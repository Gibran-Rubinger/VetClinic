package animals.commonPets;
import animals.*;
import java.util.Random;

import graphical.Graphical;
import queryAndValidations.UserInteraction;

public class Hamister extends Animals implements Ianimals {
//		Instantiation the random method.
	Random myRandom = new Random();
	
	AnimalOwner owner = new AnimalOwner(null, null, 0, 0, 0);

//	constructor to set the Attributes.
	public Hamister(int idAnimal, String name, int age, String species,String gender, String medicalCond, AnimalOwner owner) {
		this.idAnimal = idAnimal;
		this.name = name;
		this.age = age;
		this.species = species;
		this.gender = gender;
		this.medicalCond = medicalCond;	
		this.owner = owner;
	}
	
//	instantiate the graphical and UserInteraction methods to print some interactions.
	Graphical printer = new Graphical();	
	
	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		printer.typeWriter("ronk, ronk,", 50);
	}

	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		printer.typeWriter("Please, feed me at least 3 times a day.", 50);
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		printer.typeWriter(" Hi my name is "+name+" I am a "+gender+" dog and I am very happy to meet you today.\n"
				+"My owner "+owner.ownerName+ " and I having being fun since "+(age - 2020)+" when I born.", 60);	
			
				
		test.YesOrNo(3,"\n\n\n\n Would you like to see my picture now?  \n\n type Yes or No.");
		
		if (test.getUserYesOrNoValidOption() == 1) {

			int imageGenerator = myRandom.nextInt(5);
//			picture 1
			switch(imageGenerator) {
			case 1: 
			printer.typeWriter(
					""
					+ "\r\n" + 
					"                            (\\,/)\r\n" + 
					"                            oo   '''//,        _\r\n" + 
					"                          ,/_;~,        \\,    / '\r\n" + 
					"                          \"'   \\    (    \\    !\r\n" + 
					"                                ',|  \\    |__.'\r\n" + 
					"                                '~  '~----''\r\n" + 
					"", 1);
				break;
			case 2:
				printer.typeWriter(""
						+ " ,     .\r\n" + 
						"                       (\\,;,/)\r\n" + 
						"                        (o o)\\//,\r\n" + 
						"                         \\ /     \\,\r\n" + 
						"                         `+'(  (   \\    )\r\n" + 
						"                            //  \\   |_./\r\n" + 
						"                          '~' '~----'  ", 1);
				break;
			case 3:
				printer.typeWriter(""
						+ "  (`-()_.-=-.\r\n" + 
						"       /66  ,  ,  \\\r\n" + 
						"     =(o_/=//_(   /======`\r\n" + 
						"         ~\"` ~\"~~`", 1);
				break;
			case 4:
				printer.typeWriter(""
						+ "          ___\r\n" + 
						" _  _  .-'   '-.\r\n" + 
						"(.)(.)/         \\   \r\n" + 
						" /@@             ;\r\n" + 
						"o_\\\\-mm-......-mm`~~~~~~~", 1);
				break;
			case 5:
				printer.typeWriter(""
						+ "              _,_\r\n" + 
						"           _.-~' o'~;,\r\n" + 
						" _      .-~_  =,,-~~\r\n" + 
						"' ~--._(___ )__/\r\n" + 
						"         ~~~^ ~^ ", 1);
				break;	
				}
			}
		else if (test.getUserYesOrNoValidOption() == 0){
			printer.typeWriter("Ok, see you later", 50);
		}

			System.out.println();
		}

		// creating the to String to override it.
		@Override
		public String toString() {
			return "ID: " +idAnimal+ "   Name: " + name + "         Age: " + age+ "         Specie: " + species+"       Gender: " + gender+ "   \n \n Medical Condition: " + medicalCond+ ". \n\n"+owner+"\n________________________________________________________________________________________________________________________________________________________";
		}
	
	

}
