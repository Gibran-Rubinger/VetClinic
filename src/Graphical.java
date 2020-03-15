
public class Graphical {

	private static String message = null;
	
//	using a getters and setters to encapsulation to use the method typeWriter with other message.
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		Graphical.message = message;
	}
	
//	In this method it will print some strings as type writer effect.
	protected void typeWriter(String mesage, int delayChar) {
		
//		for loop to print which character with milliseconds delay solution by *Nodehead, link avaliable in Github* 
		for(int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			try {
				Thread.sleep(delayChar);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

