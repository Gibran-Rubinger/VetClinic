import java.util.Random;

public class RandomName {
	
//	Set a String Poll of characters.
	
	String poolOfCharacters = "ABCDEFGHIKLMNOPQRSTVXYZ";
	String randomSelect = "";
//	this integer will be use to define the size of a random name.
	int size = 5;

	
	public String Rn() {
	
//	set the superclass Random for using in a loop to create random names.
	Random myRandom = new Random();
//	
	char[] alphabet = new char[size];
	
	for (int i = 0; i < size; i++) {
		alphabet[i] = poolOfCharacters.charAt(myRandom.nextInt(poolOfCharacters.length()));
	}
	for (int i = 0; i < size; i++) {
		randomSelect += alphabet[i];
	}
	return randomSelect;
	
  }

}

