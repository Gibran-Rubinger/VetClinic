package animals.commonPets;

import animals.*;
import java.util.Random;
import graphical.Graphical;

public class Rabbit extends Animals implements Ianimals {
//	Instantiation the random method.
	Random myRandom = new Random();

	AnimalOwner owner = new AnimalOwner(null, null, 0, 0, 0);

//	constructor to set the Attributes.
	public Rabbit(int idAnimal, String name, int age, String species, String gender, String medicalCond,
			AnimalOwner owner) {
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
		printer.typeWriter(" Hi my name is " + getName() + " I am a " + getGender()
				+ " and I am very happy to meet you today.\n" + "My owner " + owner.getOwnerName()
				+ " and I having being fun since " + (getAge() - 2020) + " when I was born.", 60);

		query.YesOrNo(3, "\n\n\n\n Would you like to see my picture now?  \n\n type Yes or No.");

		if (query.getUserYesOrNoValidOptio() == 1) {

			int imageGenerator = myRandom.nextInt(4);
//			picture 1
			switch (imageGenerator) {
			case 0:
				printer.typeWriter("" + "                              __\r\n"
						+ "                     /\\    .-\" /\r\n" + "                    /  ; .'  .' \r\n"
						+ "                   :   :/  .'   \r\n" + "                    \\  ;-.'     \r\n"
						+ "       .--\"\"\"\"--..__/     `.    \r\n" + "     .'           .'    `o  \\   \r\n"
						+ "    /                    `   ;  \r\n" + "   :                  \\      :  \r\n"
						+ " .-;        -.         `.__.-'  \r\n" + ":  ;          \\     ,   ;       \r\n"
						+ "'._:           ;   :   (        \r\n" + "    \\/  .__    ;    \\   `-.     \r\n"
						+ " bug ;     \"-,/_..--\"`-..__)    \r\n" + "     '\"\"--.._:", 1);
				break;
			case 1:
				printer.typeWriter("" + "       ,\r\n" + "        /|      __\r\n" + "       / |   ,-~ /\r\n"
						+ "      Y :|  //  /\r\n" + "      | jj /( .^\r\n" + "      >-\"~\"-v\"\r\n"
						+ "     /       Y\r\n" + "    jo  o    |\r\n" + "   ( ~T~     j\r\n" + "    >._-' _./\r\n"
						+ "   /   \"~\"  |\r\n" + "  Y     _,  |\r\n" + " /| ;-\"~ _  l\r\n" + "/ l/ ,-\"~    \\\r\n"
						+ "\\//\\/      .- \\\r\n" + " Y        /    Y    \r\n" + " l       I     !\r\n"
						+ " ]\\      _\\    /\"\\\r\n" + "(\" ~----( ~   Y.  )", 1);
				break;
			case 2:
				printer.typeWriter("" + "/ \\\r\n" + "    / _ \\\r\n" + "   | / \\ |\r\n" + "   ||   || _______\r\n"
						+ "   ||   || |\\     \\\r\n" + "   ||   || ||\\     \\\r\n" + "   ||   || || \\    |\r\n"
						+ "   ||   || ||  \\__/\r\n" + "   ||   || ||   ||\r\n" + "    \\\\_/ \\_/ \\_//\r\n"
						+ "   /   _     _   \\\r\n" + "  /               \\\r\n" + "  |    O     O    |\r\n"
						+ "  |   \\  ___  /   |\r\n" + " /     \\ \\_/ /     \\\r\n" + "/  -----  |  -----  \\\r\n"
						+ "|     \\__/|\\__/     |\r\n" + "\\       |_|_|       /\r\n" + " \\_____       _____/\r\n"
						+ "       \\     /\r\n" + "       |     |", 1);
				break;
			case 3:
				printer.typeWriter("" + "               ((`\\\r\n" + "            ___ \\\\ '--._\r\n"
						+ "         .'`   `'    o  )\r\n" + "        /    \\   '. __.'\r\n"
						+ "       _|    /_  \\ \\_\\_\r\n" + "      {_\\______\\-'\\__\\_\\", 1);
				break;
			case 4:
				printer.typeWriter("" + "           ,\\\r\n" + "             \\\\\\,_\r\n" + "              \\` ,\\\r\n"
						+ "         __,.-\" =__)\r\n" + "       .\"        )\r\n" + "    ,_/   ,    \\/\\_\r\n"
						+ "    \\_|    )_-\\ \\_-`\r\n" + "       `-----` `--`", 1);
				break;
			}
		} else if (query.getUserYesOrNoValidOptio() == 0) {
			printer.typeWriter("Ok, see you later", 50);
		}

		System.out.println();
	}

	// creating the to String to override it.
	@Override
	public String toString() {
		return "ID: " + getIdAnimal() + "   Name: " + getName() + "         Age: " + getAge() + "         Specie: "
				+ getSpecies() + "       Gender: " + getGender() + "   \n \n Medical Condition: " + getMedicalCond()
				+ ". \n\n" + owner
				+ "\n________________________________________________________________________________________________________________________________________________________";

	}

}
