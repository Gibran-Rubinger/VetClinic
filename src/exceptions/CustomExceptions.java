package exceptions;



public class CustomExceptions extends Exception {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
// Constructor with standard message 	
	public CustomExceptions() {
		super("Please follow the menu guidelines and type a valid option.");
	}
//	overloading this Constructor with custom message String parameter
	public CustomExceptions(String text) {
		super(text);
	}
}
