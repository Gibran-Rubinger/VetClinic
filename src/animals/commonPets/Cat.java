package animals.commonPets;

import animals.*;
import java.util.Random;

import graphical.Graphical;

public class Cat extends Animals implements Ianimals {
	
//	Instantiation the random method.
	Random myRandom = new Random();
	
	AnimalOwner owner = new AnimalOwner(null, null, 0, 0, 0);

//	constructor to set the Attributes.
	public Cat(int idAnimal, String name, int age, String species,String gender, String medicalCond, AnimalOwner owner) {
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
		printer.typeWriter("Meow, Meow,", 50);
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
				+"My owner "+owner.getOwnerName()+ " and I having being fun since "+(getAge() - 2020)+" when I born.", 60);	
			
				
		query.YesOrNo(3,"\n\n\n\n Would you like to see my picture now?  \n\n type Yes or No.");
		
		if (query.getUserYesOrNoValidOptio() == 1) {

			int imageGenerator = myRandom.nextInt(5);
//			picture 1
			switch(imageGenerator) {
			case 1: 
			printer.typeWriter(
					"       _                        \r\n" + 
					"       \\`*-.                    \r\n" + 
					"        )  _`-.                 \r\n" + 
					"       .  : `. .                \r\n" + 
					"       : _   '  \\               \r\n" + 
					"       ; *` _.   `*-._          \r\n" + 
					"       `-.-'          `-.       \r\n" + 
					"         ;       `       `.     \r\n" + 
					"         :.       .        \\    \r\n" + 
					"         . \\  .   :   .-'   .   \r\n" + 
					"         '  `+.;  ;  '      :   \r\n" + 
					"         :  '  |    ;       ;-. \r\n" + 
					"         ; '   : :`-:     _.`* ;\r\n" + 
					"      .*' /  .*' ; .*`- +'  `*' \r\n" + 
					"      `*-*   `*-*  `*-*'", 1);
				break;
			case 2:
				printer.typeWriter(""
						+ "     ,\r\n" + 
						"       \\`-._           __\r\n" + 
						"        \\\\  `-..____,.'  `.\r\n" + 
						"         :`.         /    \\`.\r\n" + 
						"         :  )       :      : \\\r\n" + 
						"          ;'        '   ;  |  :\r\n" + 
						"          )..      .. .:.`.;  :\r\n" + 
						"         /::...  .:::...   ` ;\r\n" + 
						"         ; _ '    __        /:\\\r\n" + 
						"         `:o>   /\\o_>      ;:. `.\r\n" + 
						"        `-`.__ ;   __..--- /:.   \\\r\n" + 
						"        === \\_/   ;=====_.':.     ;\r\n" + 
						"         ,/'`--'...`--....        ;\r\n" + 
						"              ;                    ;\r\n" + 
						"            .'                      ;\r\n" + 
						"          .'                        ;\r\n" + 
						"        .'     ..     ,      .       ;\r\n" + 
						"       :       ::..  /      ;::.     |\r\n" + 
						"      /      `.;::.  |       ;:..    ;\r\n" + 
						"     :         |:.   :       ;:.    ;\r\n" + 
						"     :         ::     ;:..   |.    ;\r\n" + 
						"      :       :;      :::....|     |\r\n" + 
						"      /\\     ,/ \\      ;:::::;     ;\r\n" + 
						"    .:. \\:..|    :     ; '.--|     ;\r\n" + 
						"   ::.  :''  `-.,,;     ;'   ;     ;\r\n" + 
						".-'. _.'\\      / `;      \\,__:      \\\r\n" + 
						"`---'    `----'   ;      /    \\,.,,,/\r\n" + 
						"                   `----`           ", 1);
				break;
			case 3:
				printer.typeWriter(""
						+ " _\r\n" + 
						" ( \\\r\n" + 
						" \\ \\\r\n" + 
						"  / /                |\\\\\r\n" + 
						" / /     .-`````-.   / ^`-.\r\n" + 
						"\\ \\    /         \\_/  {|} `o\r\n" + 
						" \\ \\  /   .---.   \\\\ _  ,--'\r\n" + 
						"  \\ \\/   /     \\,  \\( `^^^\r\n" + 
						"   \\   \\/\\      (\\  )\r\n" + 
						"    \\   ) \\     ) \\ \\\r\n" + 
						"jgs  ) /__ \\__  ) (\\ \\___\r\n" + 
						"    (___)))__))(__))(__)))", 1);
				break;
			case 4:
				printer.typeWriter(""
						+ "  _          ___\r\n" + 
						"    /' '\\       / \" \\\r\n" + 
						"   |  ,--+-----4 /   |\r\n" + 
						"   ',/   o  o     --.;\r\n" + 
						"--._|_   ,--.  _.,-- \\----.\r\n" + 
						"------'--`--' '-----,' VJ  |\r\n" + 
						"     \\_  ._\\_.   _,-'---._.'\r\n" + 
						"       `--...--``  /\r\n" + 
						"         /###\\   | |\r\n" + 
						"         |.   `.-'-'.\r\n" + 
						"        .||  /,     |\r\n" + 
						"       do_o00oo_,.ob", 1);
				break;
			case 5:
				printer.typeWriter(""
						+ ",_     _\r\n" + 
						" |\\\\_,-~/\r\n" + 
						" / _  _ |    ,--.\r\n" + 
						"(  @  @ )   / ,-'\r\n" + 
						" \\  _T_/-._( (\r\n" + 
						" /         `. \\\r\n" + 
						"|         _  \\ |\r\n" + 
						" \\ \\ ,  /      |\r\n" + 
						"  || |-_\\__   /\r\n" + 
						" ((_/`(____,-'", 1);
				break;	
				}
			}
		else if (query.getUserYesOrNoValidOptio() == 0){
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
