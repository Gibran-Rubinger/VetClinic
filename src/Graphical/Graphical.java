package graphical;

public class Graphical {

//	In this method it will print some strings as type writer effect.
	public void typeWriter(String message, int delayChar) {

//		for loop to print which character with milliseconds delay solution REFERENCE (YES! We understood how 
//		it works and adapted for better use in our code .. here we create the message attribute outside and remove the using of getters and setters)by *Nodehead, link available in Github* 
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			try {
				Thread.sleep(delayChar);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
