import java.util.Random;

public class RandomName {
	
//	Set a String Poll of characters.
	String poolOfCharacters = "ABECIDOFUGAHEJIKOBANIMOLAPENASITOTUGIGABENILAPENUKAFAWEYOU";
	String randomSelect = "";
//	this integer will be use to define the size of a random name.
	int size = 10;
	
//	set the superclass Random for using in a loop to create random names.
	Random myRandom = new Random();
	
	char[] alphabet = new char[size];
	
	for (int i = 0; i < size; i++) {
		alphabet[i] = poolOfCharacters.charAt(myRandom.nextInt(poolOfCharacters.length()));
	}
	for (int i2 = 0; i < alphabet.lenght; i2++) {
		randomSelect += alphabet[i2];
	}
	System.out.println(randomSelect);
}

