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
		
		
		String[] dogMedCond = {"Has been stung by a bee or insect.","Regularly treated for worms.","Vomiting and diarrhoea.","Anal Sacculectomy.",
				"Hair loss under tail. ","Allergic skin disease.","Cruciate Ligament Disease.","Itchy lesion - hotspot.",
				"Foreign Body Ingestion.","Torn or Broken Nail.","Gastric Foreign Object(s) Ingestion.","Being Hit by a Car",
				"Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye","Cruciate Ligament Injury (without surgery)",
				"Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair",
				"Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
		String[] catMedCond = {"Feet infection by chewing.","Aural haematoma ear arllergy.","Arthritis or osteoarthritis.","Joint injury by obesitty.",
				"Joint support medication injections.","Weight control.","Liver and kidneys are unestablished.","Feline Bronchial asthma.",
				"Has been stung by a bee or insect.","Diabetes Mellitus.","Gastric Foreign Object(s) Ingestion.","Being Hit by a Car",
				"Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye","Lameness/Back Trouble","Heat Stroke/Dehydration",
				"Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
		String[] domesticPigMedCond = {"Has been stung by a bee or insect.","Feet infection by chewing.","Hair loss under tail.","Swine pleuropneumonia.",
				"Swine leptospirosis.","Gastrointestinal worms.","Swine cysticercosis.","Swine coccidiosis.","Coughing, sneezing, abdominal breathing.",
				"Mastitis","Gastric Foreign Object(s) Ingestion.","Being Hit by a Car","Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye",
				"Cruciate Ligament Injury (without surgery)","Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair",
				"Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
		String[] rabbitMedCond = {"Anaesthetic and burring the teeth flat to overgrown teeth.","Rabbit’s stomach obstruction.","uterine adenocarcinoma.",
				"Diagnostic with Myxomatosis.","Haemorrhagic Disease Virus (Rabbit Calicivirus).","Vaccine Provide protection against RHDV1.",
				"Pasteurella multocida bacterium snuffles"," Checkup blood test and vaccine","Bacterial infections of the middle and inner ear or infections of the brain.",
				"Encephalitozoon cuniculi parasite.","Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Poisoning",
				"Scratch or Wound on Eye","Heat Stroke/Dehydration","Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
		String[] hamisterMedCond = {"Diagnostic with cold, swollen nasal discharge.","Wet Tail bacterial illness.","Scratches its ears, loses its hair - mange illness.",
				"Abscesses swelling on the body","Hair loss and bleeding, by Bar Rub.","Circling moves in circles, running round seemingly without cause.",
				"moves in circles, running round seemingly without cause,","Dry Ears the skin on ears is flaky.","Dehydration, is lying down and not moving,hyperventilating too.",
				"Protruding Eyes are not symmetrical caused by an infection.","Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds",
				"Poisoning","Scratch or Wound on Eye","Heat Stroke/Dehydration","Preventative Healthcare (Check-Up)","vaccine"};
		
		String[] guineaPigMedCond = {"Respiratory Infections caused by Pneumonia.","Stress by overcrowding.","Cultures of the ocular (eye) and nasal discharge.",
				"infection in the sensitive gastrointestinal tract.","Slow down digestion and food passage through the intestinal tract.",
				"Debility in skin, joints, and mucosal surfaces by Scurvy (Vitamin C deficiency).","Abscesses (infected swelling containing an accumulation of pus and bacteria).",
				"development of urinary calculi (stones or uroliths).","Skin Infection by itchy.","deep bacterial infection that causes lameness and pain. .","vaccine",
				"Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye","Heat Stroke/Dehydration","Preventative Healthcare (Check-Up)"};
		
		String[] fishMedCond = {"Diagnostic  with aeromonas bacteria.","Diagnostic with Mycobacterium marinum.","Diagnostic with Mycobacterium marinum.",
				"Infected by Streptococcus  iniae bacteria.","Vomiting and diarrhoea caused by Salmonella.","Diarrhoea or blood infections caused by bacteria called Aeromonas.",
				"skin infections through contact with infected water.","Anchor worms hang from body of fish.","Flat, disk-shapes slowly moving on skin and fins.",
				"Flukers Small red spots on skin and fins.","Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Scratch or Wound on Eye",
				"Preventative Healthcare (Check-Up)"};
		
		String[] reptileMedCond = {"Infected by Salmonella.","Infected by campylobacteriosis (a bowel infection).","Infected by leptospirosis (a liver disease).",
				"Trichinellosis disease of muscles, the nervous system and the heart and lungs.","Infection by the Clostridium bacterium botulism.",
				"Dysecdysis, inadequate skin shedding.","Low humidity, ectoparasitism, nutritional deficiencies.","Secondary infection and abscessation.",
				"Fractures due to trauma are commonly.","Burns associated with unscreened incandescent lights or other heat sources.",
				"Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Scratch or Wound on Eye","Heat Stroke/Dehydration","Preventative Healthcare (Check-Up)"};
		
		String[] oxMedCond = {"Bovine infectious rhinotracheitis.","Bovine viral diarrhea.","Foot-and-mouth disease.","Progressive paralysis.","Mammary gland infection.",
				"Infected by Mycobacterium bovis (M. bovis).","Diagnostic with bovine brucellosis.","zoonotic infection caused by pathogenic spirochetes of the genus Leptospira.",
				"Neosporose vacccine.","Diagnostic  with fever, apathy, anorexia.","Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye",
				"Cruciate Ligament Injury (without surgery)","Lameness/Back Trouble","Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair",
				"Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
		String[] sheepAndGoatMedCond = {"Central nervous system disease.","Digestive system disease.","Diagnostic with fungus of facial eczema (Pithomyces chartarum).",
			"Infected by heliotrope / Potato Weed (Heliotropium europaeum).","Bone surfaces in one or more joints become damaged by infection.",
			"Uncoordination, loss of appetite, excessive salivation, mild excitability by Botulism infection.","Diagnostic with cheesy gland (CLA) bacterial infection.",
			"Weepy eyes and photosensitisation by Cobalt Deficiency.","Heavy infestation of lungworms causes irritation to the lining of the airways and a cough.",
			"Diagnostic with listeriosis bacterial infection.","Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds",
			"Poisoning","Scratch or Wound on Eye","Cruciate Ligament Injury (without surgery)","Lameness/Back Trouble","Heat Stroke/Dehydration",
			"Cruciate Ligament Injury Surgical Repair","Preventative Healthcare (Check-Up)","Acupuncture","Diagnostic Imaging","vaccine"};
		
		String[] horsePonyAndDonkeyMedCond = {"Abdominal pain and colic.","Diagnostic with degenerative Joint Disease (DJD).","Progressive type of arthritis and osteoarthritis.",
				"Laminitis inflammation attaches the coffin bone to the hoof wall.","Equine Encephalomyelitis.","Diagnostic with equine encephalomyelitis.",
				"West Nile infection from being bitten by an infected mosquito.","infectious condition muscle weakness in the form of a weak tongue,.",
				"Azoturia colapse by overexerted.","Diagnostic with potomac Horse Fever.","Gastric Foreign Object(s) Ingestion.","Being Hit by a Car",
				"Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye","Cruciate Ligament Injury (without surgery)","Lameness/Back Trouble",
				"Heat Stroke/Dehydration","Cruciate Ligament Injury Surgical Repair","Preventative Healthcare (Check-Up)","Diagnostic Imaging","vaccine"};
		
		String[] birdsMedCond = {"Diagnostic with Proventricular Dilatation Disease (PDD).","Difficulty in breathing by Chlamydia bacterium infection.","Diagnostic with Psittacosis Fever.",
				"Infected by Psittacine Beak and Feather Disease.","infectious condition loss, an enlarged abdomen, paralysis, and diarrhea.","Diagnostic with fungal infection similar to Candidiasis.",
				"check up after a bron wings surgery.","Diagnostic with Cryptococcosis infection (Cryptococcus neoformans).","Unknown causes of loose feathers, probably stress factor.",
				"respiratory secretions caused by bacteria (Chylamydia psittaci) .","Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Poisoning","Scratch or Wound on Eye",
				"Heat Stroke/Dehydration","Preventative Healthcare (Check-Up)","vaccine"};
		
		String[] exoticMedCond = {"Infection condition by salmonella.","Survey and adaptations of the terrarium's micro ecosystem.","Inactivity and unusual behaviors by stress factor.",
				"Sudden weight loss.","Skin blotches caused by hemorrhaging.","Eye cloudiness for immune system is depressed."," internal parasites infection condiction.",
				"infectious condition Cryptosporidiosis protozoal parasite.","Diagnostic with Skin infection.","Diagnostic with infectious stomatitis.",
				"Gastric Foreign Object(s) Ingestion.","Lacerations or Bite Wounds","Scratch or Wound on Eye","Heat Stroke/Dehydration","Preventative Healthcare (Check-Up)"};

		String[] typeAnimal = {"dogs","cats","domestic pig","rabbit","hamister","guinea pig","cokcatiel","goudian finch","parrot",     
				"cockatoo","budgerigar","dove","oscar","neon treta","guppies","discus","betta","goldfish","water dragon",      
				"chameleon","green tree python","ball python","iguana","eastern box turtle","ox","horse","sheep",      
				"goat","pony","donkey","pacman frog","green tree frog","cobalt blue tarantula","chile rose spider",
				"emperor scorpion","heterometrus scorpion"};
}

