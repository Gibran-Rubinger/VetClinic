package animals;
//import java.security.Policy;

public class AnimalsData {
//		generating the Array for populating the objects.
		String[] poolOfOwnerNames = {"Carolina","Alcione","Livia","Fatima","Carla","Fabiola","Dercio","Alirio","Adair","Adilson","Adriano","Afranio","Alessadra",
				 "Aline","Amanda","Ana","Angela","Arlen","Bernardo","Frederico","Fernando","Isabela","Larissa","Lucas","Malu","Marcela","Marli","Natalia",
				 "Polyana","Rafaela","Sibele","Silvia","Anita","Cristina","Cintia","Fabiana","Livea","Luiz","Marcos","Maria","Mary","Patricia","Paulo",
				 "Barbara","Edson","Bianca","Braulio","Braz","Bruna","Camila","Carol","Catia","Charles","Cicero","Lourdes","Daniela","Fernanda","Gabrielle",
				 "Humberto","Luiz","Mark","Max","Clara","Cosme","Cristiano","Vitor","Vinicius","Grace","Marcelo","Priscila","Daniel","Dave","Denise","Geraldo",
				 "Shirley","Simone","Erik","Francisco","Guilherme","Gustavo","Heitor","Hugo","Icaro","Igor","Leonardo","Joao","Jhon","Joshua","Julia","Juliana",
				 "Karen","Laura","Lucia","Luisa","Marco","Margareth","Marijke", "Alexandre","Ludmila","Conrrado","Neimar", "Jorge","Pamela","Pedro","Liz","Ricardo",
				 "Robert","Rodrigo","Rose","Sandra","Sarah","Simoes","Fabiano","Talita","Thiago","Thomas","Troy","Washington","Aoife","Caoimhe","Saoirse","Ciara",
				 "Niamh","Roisin","Nora","Lorraine","Connor","Nolan","Carson","Brayden","Declan","Kevin","Derek","Darren","Amilcar","Ken","Alan","Nico","Michael",
				 "Conor","Sean","Oisin","Cian","Darragh","Cillian","Fionn","Finn","Rian","Eoin","Oscar","Callum","Aidan","Tadhg","Eoghan","Niamh","Clodagh", 
				 "Aisling","Eabha","Aoibhinn","Aine","Sadhbh","Eimear","Orla","Sinead","Caoimhe","Saoirse","Roisin","Shannon" };
		
		String[] poolOfOwnerSurnames = {"Ferreira","Cunha","Silva","Cram","Murphy","Kelly","Byrne","Ryan","OSullivan","Walsh","OConnor","McCarthy",
				 "McLoughlin","MacLochlainn","OCarroll","Connolly","Daly","OConnell","Wilson", "Dunne", "Brennan", "Burke","Collins","Casey","Graham", 
				 "Higgins","Cullen","Keane","King","Maher","MacKenna","Bell","Aponte","Healy","Gonzales","McKeown"};
		
		String[] poolOfFemaleNames = {"Joly","Laize","Abbey","Abbie","Abby","Abigail","Addie","Akira","Alex","Alice","Allie","Ally","Amber","Amy","Angel",
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
		
		String[] poolOfMaleNames = {"Deco","Bob","Teddy","Red","Ralfh","Duque","Cu","Ace","Albert","Alex","Alexander","Alvin",
				"Amos","Andy","Angel","Angus","Apollo","Archie","Arthur","Ash","Atticus","Baby","Bailey","Bandit","Barley",
				"Barnabas","Barnaby","Barney","Bart","Batman","Baxter","Bear","Ben","Benjamin","Benji","Benny","Bentley",
				"Billy","Binx","Blackie","Blue","Bo","Bob","Bobby","Boo","Boomer",
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
		
		// if == 0
		String[] poolOfCommonPetzMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		// if == 1
		String[] poolOfBirdsMedicalCond = {"Gastric Foreign Object(s) Ingestion", "B", "C" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "D", "E","FFF","GGG", "Preventative Healthcare (Check-Up)","HHH","Diagnostic Imaging","vaccine"};
		// if == 2
		String[] poolOfFishMedicalCond = {"Gastric Foreign Object(s) Ingestion", "CC", "DD" , "Poisoning", "EE","GG", "KKK", "UUU","RRRR","EEER", "Preventative Healthcare (Check-Up)","Acupuncture","ssss","vaccine"};
		// if == 3
		String[] poolOfReptileMedicalCond = {"Gastric Foreign Object(s) Ingestion", "FFFD", "DEDEDE" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		// if == 4
		String[] poolOfFarmMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		// if == 5
		String[] poolOfExoticMedicalCond = {"Gastric Foreign Object(s) Ingestion", "Being Hit by a Car", "Lacerations or Bite Wounds" , "Poisoning", "Abscesses","Scratch or Wound on Eye", "Cruciate Ligament Injury (without surgery)", "Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair", "Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
	
}

