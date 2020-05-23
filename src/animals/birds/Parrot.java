package animals.birds;

import animals.*;

import java.util.Random;
import graphical.Graphical;

public class Parrot extends Animals implements Ianimals {
	Random myRandom = new Random();

	AnimalOwner owner = new AnimalOwner(null, null, 0, 0, 0);

//	constructor to set the Attributes.
	public Parrot(int idAnimal, String name, int age, String species, String gender, String medicalCond,
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
		printer.typeWriter("hello,  hello.", 50);
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
				printer.typeWriter("" + "                    _..          \r\n"
						+ "                   .' _ `\\      \r\n" + "                  /  /e)-,\\     \r\n"
						+ "                 /  |  ,_ |        \r\n" + "                /   '-(-.)/        \r\n"
						+ "              .'--.   \\  `       .  \r\n" + "             /    `\\   |   _.--'`__.'  \r\n"
						+ "           /`       |  /.-'  .--'        \r\n"
						+ "         .'        ;  /__.-'`            \r\n"
						+ "       .'`-'_     /_.')))                  \r\n" + "      / -'_.'---;`'-)))\r\n"
						+ "     (__.'/   /` .'`\r\n" + "      (_.'/ /` /`\r\n" + "        _|.' /`\r\n"
						+ "     .-` __.'|\r\n" + "      .-'||  |\r\n" + "         \\_`/\r\n" + "           `\r\n" + "",
						1);
				break;
			case 1:
				printer.typeWriter("" + "                 _.----._\r\n" + "               ,'.::.--..:._\r\n"
						+ "              /::/_,-<o)::;_`-._\r\n" + "             ::::::::`-';'`,--`-`\r\n"
						+ "             ;::;'|::::,','\r\n" + "           ,'::/  ;:::/, :.\r\n"
						+ "          /,':/  /::;' \\ ':\\\r\n" + "         :'.:: ,-''   . `.::\\\r\n"
						+ "         \\.:;':.    `    :: .:\r\n" + "         (;' ;;;       .::' :|\r\n"
						+ "          \\,:;;      \\ `::.\\.\\\r\n" + "          `);'        '::'  `:\r\n"
						+ "           \\.  `        `'  .:      _,'\r\n"
						+ "            `.: ..  -. ' :. :/  _.-' _.-\r\n"
						+ "              >;._.:._.;,-=_(.-'  __ `._\r\n"
						+ "            ,;'  _..-((((''  .,-''  `-._\r\n"
						+ "         _,'<.-''  _..``'.'`-'`.        `\r\n" + "     _.-((((_..--''       \\ \\ `.`.\r\n"
						+ "   -'  _.``'               \\      ` \r\n" + "     ,'\r\n" + "", 1);
				break;
			case 2:
				printer.typeWriter("" + " /;\r\n" + "                                        /;\r\n"
						+ "                                       //\r\n"
						+ "                                      //\r\n" + "                                     ;/\r\n"
						+ "                                   ,//\r\n" + "                               _,-' ;_,,\r\n"
						+ "                            _,'-_  ;|,'\r\n" + "                        _,-'_,..--. |\r\n"
						+ "                ___   .'-'_)'  ) _)\\|      ___\r\n"
						+ "              ,'\"\"\"`'' _  )   ) _)  ''--'''_,-'\r\n"
						+ "           -={-o-  /|    )  _)  ) ; '_,--''\r\n"
						+ "              \\ -' ,`.  ) .)  _)_,''|\r\n" + "               `.\"(   `------''     /\r\n"
						+ "                 `.\\             _,'\r\n" + "                   `-.____....-\\\\\r\n"
						+ "                             || \\\\\r\n" + "                             // ||\r\n"
						+ "                            //  ||\r\n" + "                           //   ||\r\n"
						+ "                       _-.//_, _||_,\r\n" + "                         ,'   ,-'/\r\n" + "",
						1);
				break;
			case 3:
				printer.typeWriter("" + "      .-\"-.\r\n" + "       /  - -\\\r\n" + "       \\  @ @/\r\n"
						+ "        (_ <_)\r\n" + "        _)(`\r\n" + "    ,_(`_))\\\r\n" + "     \"-\\)__/\r\n"
						+ "      __|||__\r\n" + "     ((__|__))" + "NO PHOTO REGISTER", 1);
				break;
			case 4:
				printer.typeWriter("" + "                                                           ,-,\r\n"
						+ "                                                        ,',' `,\r\n"
						+ "                                                      ,' , ,','\r\n"
						+ "                                                    ,' ,'  ,'\r\n"
						+ "                                                  ,' ,', ,'\r\n"
						+ "                                                ,'  , ,,'\r\n"
						+ "                                              ,' ,', ,'\r\n"
						+ "                                            ,' , , ,'\r\n"
						+ "                                        __,',___','\r\n"
						+ "                     __,,,,,,,------\"\"\"\"_    __,-\"\"\"\"\"_`=--\r\n"
						+ "      _..---.____.--'''''''''''_,---'  _; --'  ___,-'___\r\n"
						+ "    ,':::::,--.::'''''' ''''''' ___,--'   __,-';    __,-\"\"\"\r\n"
						+ "   ;:::::,'   |::'' '''' '===)-' __; _,--'    ;---''\r\n"
						+ "  |:: @,'    ;:;\\ ''''==== =),--'_,-'   ` )) ;\r\n"
						+ "  `:::'    _;:/  `._=== ===)_,-,-' `  )  `  ;\r\n"
						+ "   | ;--.;:::; `    `-._=_)_.-'   `  `  )  /`-._\r\n"
						+ "   '        `-:.  `         `    `  ) )  ,'`-.. \\\r\n"
						+ "               `:_ `    `        )    _,'     | :\r\n"
						+ "                  `-._    `  _--  _,-'        | :\r\n"
						+ "                      `----..\\  \\'            | |\r\n"
						+ "                             _\\  \\            | :\r\n"
						+ "  _____                 _,--'__,-'            : :      _______\r\n"
						+ " ()___ '-------.....__,'_ --'___________ _,--'--\\\\-''''  _____\r\n"
						+ "      `-------.....______\\\\______ _________,--._-'---''''\r\n"
						+ "                      `=='", 1);
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
