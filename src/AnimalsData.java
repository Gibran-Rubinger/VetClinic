import java.util.ArrayList;
import java.util.Random;

public class AnimalsData {
	
//	define the size of the array with this integer.
	int size = 1000;
	int idObj =0;
	int speciesGenerator = 0;
	
//	method responsible to populate 1.000 animals in a random way.
	public void addAnimal() {
		
//		generate the Array to storage the 1.000 random Animals.
		Animals[] listOfAnimals;
		
//		instantiation of the Array
		listOfAnimals = new Animals[size];
		
//		generating the Array for populating the objects.
		String[] poolOfFemaleNames = {"Deco","Bob","Joly","Laize",
		
				"Abbey","Abbie","Abby","Abigail","Addie","Akira","Alex","Alice","Allie","Ally","Amber","Amy","Angel",
				"Angora","Annabelle","Annie","Aribella","Ariel","Artemis","Arya","Ashley","Aspen","Astra","Athena",
				"Aurora","Autumn","Ava","Baby","Baby Girl","Bailey","Ballerina","Bandit","Bear","Beatrice","Bebe",
				"Bella","Belle","Betty","Bianca","Biscuit","Blossom","Blue","Blush","Bonnet","Bonnie","Boo","Boots",
				"Bowie","Brandi","Brandy","Brooklyn","Buffy","Bunny","Buttercup","Cali","Callie","Candy","Carly","Casey",
				"Cassie","Chanel","Charlie","Charlotte","Chelsea","Cheyenne","Chloe","Cinder","Cinderella","Cinnamon",
				"Cleo","Cleopatra","Coco","Cocoa","Colby","Cookie","Coral","Cricket","Crystal","Cuddles","Cupcake",
				"Daisy","Dakota","Damsel","Daphne","Darla","Darling","Delilah","Diamond","Dinah","Diva","Dixie",
				"Dolce","Dolly","Dora","Dorothy","Dottie","Duchess","Dusty","Dutchess","Ebony","Echo","Ella","Ellie",
				"Elsa","Emily","Emma","Emmy","Eva","Faith","Fergie","Finley","Finn","Fiona","Florence","Flower","Fluffy",
				"Foxy","Frankie","Freya","Gabby","Gemma","Georgia","Gia","Gidget","Gigi","Ginger","Gizmo","Gloria","Goldie",
				"Grace","Gracie","Greta","Gwendoline","Gypsy","Hailey","Haley","Hannah","Harley","Harper","Hazel","Heidi",
				"Hershey","Holly","Honey","Hope","Hydrangea","Indi","Indy","Iris","Isabella","Isabelle","Isis","Ivy",
				"Izzy","Jackie","Jade","Jasmine","Jazzy","Jenny","Jersey","Jessie","Jewel","Jinx","Josephine","Josie",
				"Juliet","Juno","Kali","Karma","Katie","Katrina","Kaya","Kayla","Khloe","Kiera","Kiki","Kira","Kit Kat",
				"Kitten","Kitty","Koa","Koda","Koko","Kona","Kona","Korra","Lacey","Lacy","Lady","Laila","Lara","Lassie",
				"Lavender","Layla","Leia","Leila","Lexi","Lexie","Libby","Liberty","Lila","Lilly","Lizzie","Loki","Lola",
				"Lucky","Lulu","Luna","Mabel","Mademoiselle","Magenta","Maisy","Matilda","Maxine","Maya","Melody","Mercedes",
				"Merida","Mia","Miley","Mimi","Mindy","Minnie","Misha","Missy","Misty","Mittens","Mocha","Moxie","Muffin",
				"Mya","Nala","Nikki","Nina","Nola","Nora","Nova","Nutmeg","Oakley","Onyx","Opal","Ophelia","Oreo", "Paisley",
				"Paprika","Paris","Patches","Peaches","Peanut","Pearl","Pebbles","Peggy","Penny","Pepper","Petunia","Pinky",
				"Pixie","Plum","Poppy","Precious","Princess","Pumpkin","Queenie","Reese","Remi","Roo","Rosie","Roxy","Ruby",
				"Sage","Samantha","Sandy","Sapphire","Sassy","Savannah","Scarlet","Sheba","Snowball","Socks","Sonny","Sparkles",
				"Spike","Spooky","Stanley","Star","Storm","Stormy","Sugar","Suki","Summer","Sunny","Sunshine","Sweetie",
				"Sydney","Tabby","Tabitha","Tasha","Tasha","Tess","Tessa","Tiana","Tiffany","Tiger Lily","Tigger",
				"Tilly","Tina","Tink","Tinkerbell","Tootsie","Trixie","Una","Violet","Whiskers","Willow","Winnie",
				"Winona","Xena","Zelda","Ziva","Zoe","Zoey","Zola"};
		
		String[] poolOfManeNames = {"Ace","Albert","Alex","Alexander","Alvin","Amos","Andy","Angel","Angus","Apollo","Archie","Arthur","Ash",
				"Atticus","Baby","Bailey","Bandit","Barley","Barnabas","Barnaby","Barney","Bart","Batman","Baxter","Bear",
				"Ben","Benjamin","Benji","Benny","Bentley","Billy","Binx","Blackie","Blue","Bo","Bob","Bobby","Boo","Boomer",
				"Boots","Boris","Bourbon","Brady","Brody","Brooks","Bruce","Bruno","Brutus","Bubba","Buddy","Budweiser",
				"Buffalo","Bugatti","Buster","Butters","Buzz","Caesar","Calvin","Captain","Casey","Cash","Casper","Champ",
				"Chance","Charlie","Chase","Chester","Chevy","Chico","Cleveland","Clyde","Coco","Cody","Cole","Cookie",
				"Cooper","Cosmo","Cricket","Cuddles","Dante","Dash","Denim","Dewey","Dexter","Diego","Diesel","Digger",
				"Dixon","Domino","Doug","Duke","Duke","Duncan","Dusty","Dylan","Eddie","Einstein","Eli","Eliot","Elmo",
				"Elvis","Emperor","Ernie","Felix","Ferrari","Figaro","Finn","Finnegan","Fluffy","Frank","Frankie",
				"Franklin","Fred","Freddie","Freddy","Gabriel","Garfield","Gatsby","General","George","Georgie","Gideon",
				"Gizmo","Goliath","Gunner","Gus","Hank","Harley","Harry","Harvey","Henry","Hobbes","Homer","Hopper",
				"Houdini","Hugo","Hummer","Hunter","Iggy","Indy","Ivan","Izzy","Jack","Jackson","Jake","James","Jasper",
				"Jax","Jazz","Jerry","Jesse","Jet","Jinx","Jj","Joe","Joey","Johnny","Jonah","Julius","Junior","King",
				"Kirby","Kobe","Larry","Lenny","Leo","Lester","Levi","Lincoln","Linus","Logan","Loki","Louie","Louis",
				"Lucky","Luigi","Luke","Mac","Magic","Mango","Mario","Marley","Marlow","Marshall","Martin","Marvin","Mason",
				"Maverick","Max","Maximilian","Maximus","Maxwell","Merlin","Mickey","Midnight","Mikey","Miles","Milo",
				"Mittens","Mochi","Moe","Mojo","Monkey","Monty","Moose","Morris","Mortimer","Moses","Mozart","Mugsy",
				"Murphy","Neko","Nemo","Neo","Nicholas","Nico","Nigel","Niko","Noah","Norman","Oliver","Ollie","Onyx",
				"Opie","Oreo","Orion","Orville","Oscar","Oswald","Otis","Ozzie","Ozzy","Parker","Patches","Patrick",
				"Paxton","Peanut","Pepe","Pepper","Percy","Pete","Petey","Pierre","Pip","Pippin","Prince","Pumpkin",
				"Quincy","Ralph","Rambo","Rascal","Reggie","Remy","Reuben","Rex","Ricky","Riley","Ringo","Rocco","Rocky",
				"Roman","Romeo","Rory","Roscoe","Rudy","Rufus","Rustler" , "Rusty","Salem","Sam","Sammy","Sampson","Samson",
				"Scooter","Scout","Sebastian","Shadow","Shakespeare","Sheldon","Sherlock","Simba","Simon","Smokey",
				"Smudge","Snickers","Snowball","Socks","Sonny","Sox","Sparky","Spencer","Spike","Spooky","Stanley",
				"Stormy","Sullivan","Sunny","Sylvester","Tango","Tank","Taz","Teddy","Thaddeus","Theo","Theodore",
				"Thomas","Thor","Tigger","Timmy","Toby","Tracker","Tucker","Tyson","Vader","Waldo","Wally","Wesson",
				"Whiskey","William","Winston","Yoda","Zeus","Ziggy"};
		
		String[] poolOfCommonAnimals = {"Dog","Cat","Domestic Pig","Rabbit", "Hamister", "Guinea Pig"};
		String[] poolOfBirdsAnimals = {"Cockatiel","Gouldian finch","Parrot","Cockatoo", "Budgerigar", "Dove"};
		String[] poolOfFishAnimals = {"Oscar","Neon Tetra","Guppies","Discus", "Bettas", "Goldfish"};
		String[] poolOfReptileAnimals = {"Water Dragon","Chameleon","Rat Snake","Ball Python Snake", "Iguana", "Turtle"};
		String[] poolOfFarmAnimals = {"Ox","Horse","Sheep","Goat", "Pony", "Donkey"};
		String[] poolOfWeirdAnimals = {"Spider","Scorpion","Frog"};
		
		
		
		String[] poolOfCommonPetzMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		String[] poolOfBirdsMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		String[] poolOfFishMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		String[] poolOfReptaleMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		String[] poolOfFarmMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		String[] poolOfWeirdMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
//		Instantiation the random method.
		Random myRandom = new Random();
		
//		For loop responsible to generate the objects. 
		for(int i = 0; i < listOfAnimals.length; i++) {
//          Generate the id 
			idObj+= i;
//			if statement responsible to generate objects per gender.
			if(idObj %2 ==0) {
			
				speciesGenerator = myRandom.nextInt(5); 
				
//				Female Object - every attribute of the object is picked using the random method.
				listOfAnimals[i] = new Animals(idObj, poolOfFemaleNames[myRandom.nextInt(poolOfFemaleNames.length)], (myRandom.nextInt(15)+1), poolOfSpecies[myRandom.nextInt(poolOfSpecies.length)], " Female ", poolOfMedicalCond[myRandom.nextInt(poolOfMedicalCond.length)]);
			}
			else {
//				Male Object - every attribute of the object is picked using the random method.
				listOfAnimals[i] = new Animals(idObj, poolOfManeNames[myRandom.nextInt(poolOfManeNames.length)], (myRandom.nextInt(15)+1), poolOfSpecies[myRandom.nextInt(poolOfSpecies.length)], " Male ", poolOfMedicalCond[myRandom.nextInt(poolOfMedicalCond.length)]);
			}
		}
		

//		print the all list
		for(Animals print : listOfAnimals) {
		System.out.println(print);
		}
//		counting the numbers of item in the Array.
		System.out.println(" The Total of Animals in the system is:  " + listOfAnimals.length);
	}

}
